package Parte_2._Ejercicios_con_vectores;

import java.util.Scanner;

public class Suma_y_promedio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array: ");
        int tamaño = scan.nextInt();

        int[] vector = new int[tamaño];
        int suma = 0;

        System.out.println("Ingrese los numeros:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Numero " + (i + 1) + ": ");
            vector[i] = scan.nextInt();

            suma += vector[i];
        }

        double promedio = (double) suma / vector.length;

        System.out.println("======================");
        System.out.println("La suma total es: " + suma);
        System.out.println("El promedio es: " + promedio);

        scan.close();
    }
}
