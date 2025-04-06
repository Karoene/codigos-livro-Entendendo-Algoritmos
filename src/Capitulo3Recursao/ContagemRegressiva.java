/*  ALGORITMO RECURSIVO  - CONTAGEM REGRESSIVA

 */

package Capitulo3Recursao;
public class ContagemRegressiva {

    public static void contagemRegressiva(int i){
        System.out.print(i+" ");
        if (i<= 1){
            ;
        }else {
            contagemRegressiva(i-1);
        }
    }

    public static void main(String[] args) {
        contagemRegressiva(5);
    }
}
