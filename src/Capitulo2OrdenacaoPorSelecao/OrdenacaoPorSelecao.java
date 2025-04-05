/*
O QUE É O ALGORITMO DE ORDENCAO POR SELECAO?
É um algoritmo que ordena uma lista do menor elemento para o maior.
* */
package Capitulo2OrdenacaoPorSelecao;
public class OrdenacaoPorSelecao {
    public static int AlgoritmoBuscaMenorElemento(int[] lista){
        int menor = lista[0];
        int menorIndice = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < menor){
                menor = lista[i];
                menorIndice = i;
            }
        }
        return menorIndice;
    }
    public static int AlgoritmoOrdenacaoPorSelecao(int[] lista){
        int[] listaOrdenada;
        for (int i = 0; i < lista.length; i++) {
            int menor = AlgoritmoBuscaMenorElemento(lista);
            //listaOrdenada.add().
        }


    }

    public static void main(String[] args){}
}
