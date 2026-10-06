
package Recursividad;

import java.util.Scanner;

public class Ejercicio06Potencia {

    public static double potencia(double base, int exponente) {
        if (exponente == 0) {            // caso base
            return 1;
        }
        if (exponente < 0) {
            return 1 / potencia(base, -exponente);
        }
        return base * potencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese el exponente (entero): ");
        int exponente = sc.nextInt();
        System.out.println(base + " elevado a " + exponente + " = " + potencia(base, exponente));
    }
}