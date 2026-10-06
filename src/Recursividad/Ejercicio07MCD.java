
package Recursividad;

import java.util.Scanner;

public class Ejercicio07MCD {

    // Algoritmo de Euclides:
    // MCD(M, N) = M si N = 0
    // MCD(M, N) = MCD(N, M % N) si N != 0
    public static int mcd(int m, int n) {
        if (n == 0) {                    // caso base
            return m;
        }
        return mcd(n, m % n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número (M): ");
        int m = sc.nextInt();
        System.out.print("Ingrese el segundo número (N): ");
        int n = sc.nextInt();
        System.out.println("El M.C.D. de " + m + " y " + n + " es: " + mcd(Math.abs(m), Math.abs(n)));
    }
}