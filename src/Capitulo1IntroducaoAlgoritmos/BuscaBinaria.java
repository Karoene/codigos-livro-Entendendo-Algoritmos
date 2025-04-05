/*
O QUE É A BUSCA BINARIA?
Busca Binaria é um algoritmo de busca/pesquisa. Sua entrada deve ser uma lista ordenada.
Se o elemento que voce busca está na lista, o algoritmo retorna sua localizacao, Senão, retorna none.
    O algoritmo vai fazer a divisao do array em 2 partes, e o seu chute é o result da divisao (metade do array).
    Se acertar, ele retorna a posição.
    Se o chute for maior, ele atualiza o valor alto para o meio do array -1.
    Se for menor, ele att o valor baixo para o meio do array +1.
    Assim, na proxima iteração do while, a variavel meio será a nova metade do array.
Sempre dividindo o tamanho do array por 2.
TEMPO DE EXECUCAO EM NOTACAO BIG O = O(Log n)

*/
package Capitulo1IntroducaoAlgoritmos;

public class BuscaBinaria {
    public static int AlgoritmoBuscaBinaria (int[] lista, int valor){
        int baixo = 0;
        int alto = lista.length - 1;
        while (baixo <= alto){
            int meio = (baixo+alto)/2;
            int chute = lista[meio];
            if (chute == valor){
                return meio;
            }
            if (chute>valor){
                alto = meio -1;   //atualiza
            }else {
                baixo = meio +1;  //att
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(AlgoritmoBuscaBinaria(array, 5)); //esta na posicao 4
    }
}
