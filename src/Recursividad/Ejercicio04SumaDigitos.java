
package Recursividad;

import java.util.Scanner;

public class Ejercicio04SumaDigitos {

    public static int sumaDigitos(int n) {
        if (n == 0) {                    // caso base
            return 0;
        }
        return n % 10 + sumaDigitos(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        System.out.println("La suma de los dígitos es: " + sumaDigitos(Math.abs(n)));
    }
}