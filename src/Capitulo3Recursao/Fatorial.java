/* ALGORITMO RECURSIVO - CALCULO DE FATORIAL
Recursão é quando uma função chama a si mesma para resolver um problema menor até
chegar em um caso base, onde ela para de se chamar.

 */
package Capitulo3Recursao;
public class Fatorial {

    public static int fatorialRecursivo(int n){
        if (n == 0){
            return 1;
        }else {
            //System.out.print(n + " * ");
            return (n * fatorialRecursivo(n-1));
        }
    }
    public static void main(String[] args) {
        int fatorial = fatorialRecursivo(5);
        System.out.println();
        System.out.println("Fatorial de " + 5 + " = "+ fatorial);
    }
}
