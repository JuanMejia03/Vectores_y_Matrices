package Parte_3._Ejercicios_con_matrices;

import java.util.Scanner;

public class Valor_mayor_y_su_posición {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresa el numero de filas: ");
        int filas = scan.nextInt();
        System.out.print("Ingresa el numero de columnas: ");
        int columnas = scan.nextInt();

        if (filas <= 0 || columnas <= 0) {
            System.out.println("Las dimensiones deben ser mayores a cero");
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

        int valorMayor = matriz[0][0];
        int filaMayor = 0;
        int columnaMayor = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if (matriz[i][j] > valorMayor) {
                    valorMayor = matriz[i][j]; // Actualizamos el mas alto
                    filaMayor = i;             // Guardamos la fila donde lo encontramos
                    columnaMayor = j;          // Guardamos la columna donde lo encontramos
                }

            }
        }

        System.out.println("\n==========================");
        System.out.println("El valor mas grande es: " + valorMayor);
        System.out.println("Se encuentra en la coordenada: [" + filaMayor + "][" + columnaMayor + "]");

        scan.close();
    }
}
