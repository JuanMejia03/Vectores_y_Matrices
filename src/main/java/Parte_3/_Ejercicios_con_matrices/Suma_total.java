package Parte_3._Ejercicios_con_matrices;

import java.util.Scanner;

public class Suma_total {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresa el numero de filas: ");
        int filas = scan.nextInt();
        System.out.print("Ingresa el numero de columnas: ");
        int columnas = scan.nextInt();

        int[][] matriz = new int[filas][columnas];

        System.out.println("\nIngresa los valores de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scan.nextInt();
            }
        }

        int sumaTotal = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaTotal += matriz[i][j]; // por celda vamos acumulando
            }
        }

        System.out.println("\n============================");
        System.out.println("La suma de todos los elementos de la matriz es: " + sumaTotal);

        scan.close();
    }
}
