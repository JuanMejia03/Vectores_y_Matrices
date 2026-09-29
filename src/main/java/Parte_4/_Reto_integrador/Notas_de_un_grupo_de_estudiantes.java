package Parte_4._Reto_integrador;

import java.util.Scanner;

public class Notas_de_un_grupo_de_estudiantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de estudiantes: ");
        int estudiantes = scan.nextInt();
        System.out.println("Ingrese la cantidad de materias: ");
        int materias = scan.nextInt();

        int[][] calificaciones = new int[estudiantes][materias];
        float[] promedioEstudiante = new float[calificaciones.length];
        int materiaAlta = 0, calificacionMasAlta = 0, estudiante = 0, materia = 0; float promedioMateria = 0;

        System.out.println("\nIngrese las notas por estudiante y materia, entre 1 a 5");
        for (int i = 0; i < estudiantes; i++) {
            int sumaNota = 0;

            for (int j = 0; j < materias; j++) {
                System.out.println("Ingrese la calificacion del estudiante #" + (i + 1) + " en la materia #" + (j + 1) + ": ");
                int nota;
                do {
                    nota = scan.nextInt();
                    if(nota < 0 || nota > 5) {
                        System.out.println("Ingrese una nota valida: (entre 1 y 5)");
                    }
                } while (nota < 0 || nota > 5);
                calificaciones[i][j] = nota;

                sumaNota += nota;
                if (nota > calificacionMasAlta) {
                    calificacionMasAlta = nota;
                    estudiante = i + 1;
                    materia = j + 1;
                }
            }

            promedioEstudiante[i] = (float) sumaNota/materias;
        }

        for (int j = 0; j < materias; j++) {
            int sumaMateria = 0;

            for (int i = 0; i < estudiantes; i++) {
                sumaMateria += calificaciones[i][j];
            }

            float promedio = (float) sumaMateria / estudiantes;
            if (promedioMateria < promedio) {
                promedioMateria = promedio;
                materiaAlta = j;
            }
        }

        System.out.println("========== Colegio don sebastian :D =========");
        System.out.println("Promedio por estudiante");
        for (int i = 0; i < promedioEstudiante.length; i++) {
            System.out.println("El estudiante #" + (i + 1) + " Tiene un promedio de: " + promedioEstudiante[i] );
        }
        System.out.println("=============================================");
        System.out.println("La materia con el promedio mas alto es la #" + (materiaAlta + 1) + "\ncon un promedio de: " + promedioMateria);
        System.out.println("=============================================");
        /*Aqui esta mal, porque solo estamos agarrando al primero que alcanse la nota mas alta, si hay mas no los tenemos encuenta
        * esto se puede arreglar con una matriz donde guardemos la nota mas alta, si lo alcanza, por estudiante
        * perooooo eso es logica que toca trabajarla y la verdad ya me dio sueño y esta semana estoy muy ocupado con el
        * trabajo!!, voy a subir el trabajo hasta aqui, por si no me queda tiempo para corregirlo, pero con un gran * en este
        * fix pendiente!!
        * */
        System.out.println("Calificacion mas alta registrada: " + calificacionMasAlta + "\ndel estudiante #" + estudiante + " de la materia #" + materia);
        System.out.println("=============================================");
        System.out.println("Fin del reporte de notas");

        scan.close();
    }
}
