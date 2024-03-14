package Tema5;

import java.util.Scanner;

public class ArraysAlumnos {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        mostrarAlumnos(alumnosDatos());

    }

    public static String[][] alumnosDatos() {

        String alumnos[][] = new String[3][4];
        /*Leemos los datos de los alumnos y lo guardamos en el array*/
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {

                //Si es la columna 0 -> Nombre
                if (j == 0) {

                    System.out.println("Introduzca su nombre: ");
                    alumnos[i][j] = sc.next();sc.nextLine();

                }

                //Si es la columna 1 -> Apellido
                if (j == 1){

                    System.out.println("Introduzca su apellido: ");
                    alumnos[i][j] = sc.next();sc.nextLine();

                }
                //Si es la columna 2 -> Profesión
                if (j==2) {

                    System.out.println("Introduzca su profesión: ");
                    alumnos[i][j] = sc.next();sc.nextLine();

                }
                //Si es la columna 3 -> Email
                if (j==3) {

                    System.out.println("Introduzca su email: ");
                    alumnos[i][j] = sc.next();sc.nextLine();

                }

            }

        }

        return alumnos;

    }
    /*Función que muestra l información ordenada por el nombre de los alumnos y en forma de tabla (foreach)*/
    public static void mostrarAlumnos(String alumnos[][]) {




    }

}
