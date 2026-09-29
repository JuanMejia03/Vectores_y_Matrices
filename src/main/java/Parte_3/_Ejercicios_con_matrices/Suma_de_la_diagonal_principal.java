package Parte_3._Ejercicios_con_matrices;

import java.util.Scanner;

public class Suma_de_la_diagonal_principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresa el numero de filas: ");
        int filas = scan.nextInt();
        System.out.print("Ingresa el numero de columnas: ");
        int columnas = scan.nextInt();

        if (filas != columnas) {
            System.out.println("Error: La matriz debe ser cuadrada (mismo número de filas y columnas).");
            return;
        }

        int[][] matriz = new int[filas][columnas];

        System.out.println("\nIngresa los valores de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scan.nextInt();
            }
        }

        int sumaDiagonal = 0;

        // con un solo ciclo!
        for (int i = 0; i < filas; i++) {
            sumaDiagonal += matriz[i][i];
        }

        System.out.println("\n-------------------------");
        System.out.println("La suma de la diagonal principal es: " + sumaDiagonal);

        scan.close();
    }
}
