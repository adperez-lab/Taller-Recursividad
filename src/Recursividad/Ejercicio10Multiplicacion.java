
package Recursividad;

import java.util.Scanner;

public class Ejercicio10Multiplicacion {

    // a * b = a + a + ... + a (b veces)
    public static int multiplicar(int a, int b) {
        if (b == 0) {                    // caso base
            return 0;
        }
        if (b < 0) {
            return -multiplicar(a, -b);
        }
        return a + multiplicar(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();
        System.out.println(a + " x " + b + " = " + multiplicar(a, b));
    }
}