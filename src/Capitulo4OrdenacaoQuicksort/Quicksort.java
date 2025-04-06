/*  ALGORITMO ORDENAÇÃO QUICKSORT - DIVIDIR PARA CONQUISTAR
Conhecido pelo bom desempenho em tempo de execução, ele utiliza da lógica de dividir um problema e vários menores.
Dividir: Dividimos o problema em subproblemas menores.
Conquistar: Resolvemos os subproblemas recursivamente.
Combinar: Juntamos as soluções dos subproblemas.

TEMPO DE EXECUÇÃO EM NOTAÇÃO BIG O = O(n Log n)
*/
package Capitulo4OrdenacaoQuicksort;

import java.util.Arrays;

public class Quicksort {
    public static void algoritmoDividirParaConquistar(int[] lista, int inicio, int fim){
        if (inicio < fim){
            int indicePivo = dividindoOProblema(lista, inicio, fim);
            algoritmoDividirParaConquistar(lista, inicio, indicePivo - 1);  // esquerda
            algoritmoDividirParaConquistar(lista, indicePivo + 1, fim);     // direita
        }

    }
    public static int dividindoOProblema(int[] lista, int inicio, int fim){
        int pivo = lista[fim];
        int i = inicio  -1;

        for (int j = inicio; j < fim ; j++) {
            if (lista[j] < pivo){
                i++;
                trocandoPosicoes(lista, i, j);
            }
        }
        trocandoPosicoes(lista, i+1, fim);
        return i+1; //atual indice do pivo

    }

    public static void trocandoPosicoes(int[] lista, int i, int j){
        int temp = lista[i];
        lista[i] = lista[j];
        lista[j] = temp;
    }
    public static void main(String[] args) {
        int[] lista = {10,4,3,6,5};
        algoritmoDividirParaConquistar(lista, 0, lista.length - 1);
        System.out.println(Arrays.toString(lista));

    }
}
