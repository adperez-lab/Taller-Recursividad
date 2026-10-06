
package Recursividad;

import java.util.Scanner;

public class Ejercicio02InvertirNumero {

    public static int invertir(int n, int resultado) {
        if (n == 0) {                    // caso base
            return resultado;
        }
        return invertir(n / 10, resultado * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();
        int invertido = invertir(Math.abs(n), 0);
        if (n < 0) {
            invertido = -invertido;
        }
        System.out.println("Número invertido: " + invertido);
    }
}