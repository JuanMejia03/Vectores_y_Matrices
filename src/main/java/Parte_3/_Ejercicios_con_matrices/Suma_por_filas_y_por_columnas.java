package Parte_3._Ejercicios_con_matrices;

import java.util.Scanner;

public class Suma_por_filas_y_por_columnas {
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

        System.out.println("\n=== Suma por Filas ===");
        for (int i = 0; i < filas; i++) {
            int sumaFila = 0; // lo reiniciamos a 0 cada que entramos a una nueva fila

            for (int j = 0; j < columnas; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + i + ": " + sumaFila);
        }

        System.out.println("\n=== Suma por Columnas ===");
        for (int j = 0; j < columnas; j++) {
            int sumaColumna = 0; // lo mismo aca

            for (int i = 0; i < filas; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Columna " + j + ": " + sumaColumna);
        }

        scan.close();
    }
}
