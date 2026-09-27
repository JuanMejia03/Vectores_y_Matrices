package Parte_2._Ejercicios_con_vectores;

import java.util.Scanner;

public class Contar_pares_e_impares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor ingrese el tamaño del vector: ");
        int tamaño = scan.nextInt();

        int[] vector = new int[tamaño];

        int cantidadPares = 0;
        int cantidadImpares = 0;

        System.out.println("Ingresa los números:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Posición " + i + ": ");
            vector[i] = scan.nextInt();

            if (vector[i] % 2 == 0) {
                cantidadPares++;
            } else {
                cantidadImpares++;
            }
        }

        System.out.println("========================");
        System.out.println("Total de números pares: " + cantidadPares);
        System.out.println("Total de números impares: " + cantidadImpares);

        scan.close();
    }
}
