package Parte_2._Ejercicios_con_vectores;

import java.util.Scanner;

public class Busqueda_de_un_valo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("¿Cuántos elementos tendrá el vector? ");
        int tamaño = scan.nextInt();
        int[] vector = new int[tamaño];

        System.out.println("Ingresa los números:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Posición " + (i + 1)+ ": ");
            vector[i] = scan.nextInt();
        }

        System.out.print("\nIngresa el número que deseas buscar: ");
        int valorBuscado = scan.nextInt();

        boolean encontrado = false;
        int posicion = -1; // -1 es para indicar "no encontrado"

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == valorBuscado) {
                encontrado = true;
                posicion = i;
                break;
            }
        }

        System.out.println("-------------------------");
        if (encontrado) {
            System.out.println("El número " + valorBuscado + " SÍ existe.");
            System.out.println("Se encontró por primera vez en la posición: " + posicion);
        } else {
            System.out.println("El número " + valorBuscado + " NO se encuentra en el vector.");
        }

        scan.close();
    }
}
