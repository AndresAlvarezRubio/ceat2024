package Tema5.ActividadesRepaso;

import java.util.Scanner;

/**
 * Realiza la función: int[] buscarTodos(int t[], int clave), que crea y devuelve una tabla
 * con todos los índices de los elementos donde se encuentra la clave de búsqueda. En el
 * caso de que clave no se encuentre en la tabla t, la función devolverá una tabla vacía.
 * */

public class ActividadAplicacion5_11 {

    public static void main(String[] args) {

        mainAux();

    }

    static Scanner sc = new Scanner(System.in);
    public static void mainAux() {

        //Introducir num máximo de la tabla
        System.out.print("Introduzca el número máximo de dígitos en la tabla: ");
        int maxNums = sc.nextInt();

        //Dar de alta la tabla
        int t[] = new int[maxNums];

        //Input de número a buscar del usuario
        int clave = sc.nextInt();



    }

}
