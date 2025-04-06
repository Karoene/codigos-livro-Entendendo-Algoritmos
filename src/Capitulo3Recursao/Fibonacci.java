package Capitulo3Recursao;

public class Fibonacci {
    public static int sequenciaFibonacci(int n){
        //System.out.println(n);
        if (n == 0) return 0;
        if (n == 1) return 1;
        return sequenciaFibonacci(n-1)+sequenciaFibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(sequenciaFibonacci(7));
    }
}
