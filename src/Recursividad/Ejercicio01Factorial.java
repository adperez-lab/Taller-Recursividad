
package Recursividad;

import java.util.Scanner;

public class Ejercicio01Factorial {

    public static long factorial(int n) {
        if (n == 0 || n == 1) {          // caso base
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            System.out.println("El factorial de " + n + " es: " + factorial(n));
        }
    }
}