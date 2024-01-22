package Actividades_tema_2;

import java.util.Scanner;

public class ActividadPropuesta2_1 {

    /**
     * Pedir al usuario que introduzca un número.
     * el output deberá decir si es par o impar.
     * */
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        System.out.println("");
        System.out.print("Introduzca un número entero: ");
        int numUser = entrada.nextInt();
        System.out.println("");

        if (numUser%2==1) {
            System.out.println("Su número es impar");
        } else {
            System.out.println("Su número es par");
        }


    }

}
