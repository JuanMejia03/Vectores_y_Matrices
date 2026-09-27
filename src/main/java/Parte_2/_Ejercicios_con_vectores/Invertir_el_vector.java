package Parte_2._Ejercicios_con_vectores;

import java.util.Scanner;

public class Invertir_el_vector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("¿Cuántos elementos tendrá el vector? ");
        int tamaño = scan.nextInt();
        int[] vector = new int[tamaño];

        System.out.println("Ingresa los números:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Posición " + i + ": ");
            vector[i] = scan.nextInt();
        }

        System.out.println("-------------------------");
        System.out.println("Vector en orden inverso:");

        // Empezamos desde la ultima posición y restamos hasta llegar a 0
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.println("Posición " + i + ": " + vector[i]);
        }

        scan.close();
    }
}
