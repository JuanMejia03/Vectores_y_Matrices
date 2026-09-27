package Parte_2._Ejercicios_con_vectores;

import java.util.Arrays;
import java.util.Scanner;

public class Leer_y_mostrar_un_vector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese el tamaño del vector: ");
        int tamañoVector = scan.nextInt();

        int[] vector = new int[tamañoVector];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("por favor ingrese un nuemro entero para la posicion #" + (i +1) + " :");
            int nuevoNumero = scan.nextInt();
            vector[i] = nuevoNumero;
        }
        System.out.println("=====Aquí esta el array completo=====");
        System.out.println(Arrays.toString(vector)); //le decimos que de array pase a string para mostrarlo en una linea

        scan.close();
    }
}
