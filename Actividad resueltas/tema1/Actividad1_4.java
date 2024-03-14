package tema1;

import java.util.Scanner;

public class Actividad1_4 {

    public static void main(String[] args) {

        Scanner formUser = new Scanner(System.in);

        //Input año de nacimiento//
        System.out.print("Por favor, introduzca su año de nacimiento: ");
        short anioNacimiento = formUser.nextShort();

        //Input año actual//
        System.out.print("Por favor, introduzca el año actual: ");
        short anioActual = formUser.nextShort();

        //Output Edad del Usuario//
        int edadUsuario = anioActual - anioNacimiento;
        System.out.print("Su actual edad es: " + edadUsuario);
    }
}
