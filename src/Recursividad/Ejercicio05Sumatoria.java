
package Recursividad;

import java.util.Scanner;

public class Ejercicio05Sumatoria {

    // 1 + 2 + 3 + ... + n
    public static int sumatoria(int n) {
        if (n == 0) {                    // caso base
            return 0;
        }
        return n + sumatoria(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Ingrese un número positivo.");
        } else {
            System.out.println("La sumatoria hasta " + n + " es: " + sumatoria(n));
        }
    }
}