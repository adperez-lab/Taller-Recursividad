
package Recursividad;

import java.util.Scanner;

public class Ejercicio03SumatoriaFracciones {

    // 1 + 1/2 + 1/3 + ... + 1/n
    public static double sumatoria(int n) {
        if (n == 1) {                    // caso base
            return 1;
        }
        return 1.0 / n + sumatoria(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de n (mayor o igual a 1): ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("n debe ser mayor o igual a 1.");
        } else {
            System.out.println("La sumatoria es: " + sumatoria(n));
        }
    }
}