package Parte_2._Ejercicios_con_vectores;

import java.util.Scanner;

public class Valor_mayor_y_valor_menor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("¿Cuántos elementos tendrá el array? ");
        int tamaño = scan.nextInt();

        if (tamaño <= 0) {
            System.out.println("El vector debe tener al menos 1 elemento.");
            return;
        }

        int[] numeros = new int[tamaño];

        System.out.println("Ingresa los números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("# " + (i + 1) + ": ");
            numeros[i] = scan.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        //como inciamos desde la posicion 0, empezamos a comparar desde la posicion 1
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("======================");
        System.out.println("El valor más grande es: " + mayor);
        System.out.println("El valor más pequeño es: " + menor);

        scan.close();
    }
}
