package Actividades_tema_2;

import java.util.Scanner;

public class ActividadAplicacion2_16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número entero aleatorio: ");
        int numUser = sc.nextInt();

        numUser = (numUser<0)? numUser*-1: numUser ;

        System.out.println(numUser);
    }

}
