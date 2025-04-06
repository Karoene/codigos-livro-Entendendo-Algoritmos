package Capitulo3Recursao;

public class Fibonacci {
    public static int sequenciaFibonacci(int n){
        //valores base
        if (n == 0) return 0;
        if (n == 1) return 1;
        /* formula (n-1)+(n-2) */
        return sequenciaFibonacci(n-1)+sequenciaFibonacci(n-2);
    }
    public static void main(String[] args) {

        int valorMax = 7;
        for (int i = 0; i <= valorMax; i++) {
            System.out.print("(" + i + "):" + sequenciaFibonacci(i) + "\t");
        }//imprime a sequencia ate o valor max
    }
}
