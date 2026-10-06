
package Recursividad;

import java.util.Scanner;

public class Ejercicio09Cociente {

    // Cociente de la división entera usando restas sucesivas
    public static int cociente(int dividendo, int divisor) {
        if (dividendo < divisor) {       // caso base
            return 0;
        }
        return 1 + cociente(dividendo - divisor, divisor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el dividendo (positivo): ");
        int a = sc.nextInt();
        System.out.print("Ingrese el divisor (mayor que 0): ");
        int b = sc.nextInt();
        if (a < 0 || b <= 0) {
            System.out.println("Ingrese un dividendo positivo y un divisor mayor que 0.");
        } else {
            System.out.println("El cociente es: " + cociente(a, b));
        }
    }
}
