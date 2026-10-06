
package Recursividad;

import java.util.Scanner;

public class Ejercicio13Fibonacci {

    // Fib(0) = 0, Fib(1) = 1, Fib(n) = Fib(n-1) + Fib(n-2)
    public static long fib(int n) {
        if (n == 0) {                    // caso base 1
            return 0;
        }
        if (n == 1) {                    // caso base 2
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    // Imprime la serie desde Fib(i) hasta Fib(limite)
    public static void imprimirSerie(int i, int limite) {
        if (i > limite) {                // caso base
            return;
        }
        System.out.print(fib(i) + " ");
        imprimirSerie(i + 1, limite);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el límite de la serie: ");
        int limite = sc.nextInt();
        System.out.print("Serie de Fibonacci: ");
        imprimirSerie(0, limite);
        System.out.println();
    }
}
