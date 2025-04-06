/* SELECTION SORT
O QUE É O ALGORITMO DE ORDENCAO POR SELECAO?
É um algoritmo que ordena uma lista do menor elemento para o maior.
A ideia é percorrer o vetor e encontrar o menor elemento,
depois trocá-lo com o primeiro elemento. Em seguida, você procura o segundo menor elemento e troca com o segundo,
 e assim por diante, até o vetor estar ordenado.
*/

package Capitulo2OrdenacaoPorSelecao;
public class OrdenacaoPorSelecao {
    /* ENCONTRA INDICE DO MENOR VALOR DO ARRAY, comparando com menorAteAgr */
    public static int algoritmoBuscaMenorElemento(int[] lista, int menorAteAgr){
        int menorIndice = menorAteAgr;
        for (int i = menorIndice+1; i < lista.length; i++) {
            if (lista[i] < lista[menorIndice] ){
                menorIndice = i;
            }
        }
        return menorIndice;

    }
    /* ORDENACAO SIMPLES: TROCA DE LUGAR O ATUAL VALOR COM O MENOR VALOR */
    public static void trocaValores(int[] lista, int i, int j){
        int temp = lista[i];
        lista[i] = lista[j];
        lista[j] = temp;

    }

    /* SELECTION SORT: BUSCA O MENOR ELEMENTO E SUBSTITUI COM O VALOR ATUAL */
    public static int[] algoritmoOrdenacaoPorSelecao(int[] lista){
        for (int i = 0; i < lista.length-1; i++) {
            int menor = algoritmoBuscaMenorElemento(lista, i);
            trocaValores(lista, i, menor);
        }
        return lista;

    }

    public static void main(String[] args){
        int[] lista = {10,9,8,7};
        for (int a : lista){
            System.out.print(a+ " ");
        }
        System.out.println();
        int[] novo = algoritmoOrdenacaoPorSelecao(lista);
        for (int a : novo){
            System.out.print(a+ " ");
        }

    }
}

