

package Recursividad;

import java.util.Scanner;

public class Ejercicio11SumaVector {

    public static void llenar(int[] v, int i, Scanner sc) {
        if (i == v.length) {             // caso base
            return;
        }
        System.out.print("Valor " + (i + 1) + ": ");
        v[i] = sc.nextInt();
        llenar(v, i + 1, sc);
    }

    public static int sumar(int[] v, int i) {
        if (i == v.length) {             // caso base
            return 0;
        }
        return v[i] + sumar(v, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos valores desea ingresar? ");
        int n = sc.nextInt();
        int[] vector = new int[n];
        llenar(vector, 0, sc);
        System.out.println("La suma de los elementos es: " + sumar(vector, 0));
    }
}