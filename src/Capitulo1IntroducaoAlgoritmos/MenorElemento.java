/*
ENCONTRANDO O MENOR ELEMENTO DE UM ARRAY
A maneira mais simples de encontrar o menor elemento é percorrer toda a lista e manter o menor valor encontrado.
*
* */
package Capitulo1IntroducaoAlgoritmos;

public class MenorElemento {
    public static int MenorElementoDaLista(int[] lista){
        int men = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < men) {
                men = lista[i];
            }
        }
        System.out.println(men);  //comparando a saida do for-each
        int menor = lista[0];
        for (int a : lista){
            if (menor>a){
                menor =a;
            }
        }
        return menor;
    }

    public static void main(String[] args){
        int[] numeros = {4, 2, 9, 1, 5,0,-1, -111, 233, 0, -111};
        System.out.println("O menor elemento é: " + MenorElementoDaLista(numeros)); // Saída: 1
    }


}
