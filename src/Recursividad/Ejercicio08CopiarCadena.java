
package Recursividad;

import java.util.Scanner;

public class Ejercicio08CopiarCadena {

    public static String copiar(String origen, int i) {
        if (i == origen.length()) {      // caso base: ya se recorrió toda la cadena
            return "";
        }
        return origen.charAt(i) + copiar(origen, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String origen = sc.nextLine();
        String destino = copiar(origen, 0);
        System.out.println("Cadena original: " + origen);
        System.out.println("Cadena copiada:  " + destino);
    }
}