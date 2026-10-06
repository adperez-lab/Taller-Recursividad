
package Recursividad;

import java.util.Scanner;

public class Ejercicio12SumaMatriz {

    public static void llenar(int[][] mat, int f, int c, Scanner sc) {
        if (f == mat.length) {           // caso base: ya se llenaron todas las filas
            return;
        }
        if (c == mat[0].length) {        // fin de fila: pasa a la siguiente
            llenar(mat, f + 1, 0, sc);
            return;
        }
        System.out.print("Elemento [" + f + "][" + c + "]: ");
        mat[f][c] = sc.nextInt();
        llenar(mat, f, c + 1, sc);
    }

    public static int sumar(int[][] mat, int f, int c) {
        if (f == mat.length) {           // caso base
            return 0;
        }
        if (c == mat[0].length) {        // fin de fila: pasa a la siguiente
            return sumar(mat, f + 1, 0);
        }
        return mat[f][c] + sumar(mat, f, c + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de filas (m): ");
        int m = sc.nextInt();
        System.out.print("Número de columnas (n): ");
        int n = sc.nextInt();
        int[][] matriz = new int[m][n];
        llenar(matriz, 0, 0, sc);
        System.out.println("La suma de los elementos de la matriz es: " + sumar(matriz, 0, 0));
    }
}