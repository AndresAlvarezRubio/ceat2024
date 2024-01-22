package Actividades_tema_2;

import java.util.Scanner;

public class ActividadPropuesta2_3 {

/**
* Escribe una aplicación que pida al usuario dos
* números enteros y muestre: true, si ambos números
* son distintos entre sí o alguno de ellos es cero;
* y false en caso contrario
 * */

    public static void main(String[] args) {

        Scanner numUser = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int primNum = numUser.nextInt();
        System.out.print("Introduzca un número: ");
        int segNum = numUser.nextInt();

        if (0 == segNum || 0 == primNum || primNum != segNum) {
            boolean result = true;
            System.out.println(result);
        } else {
            boolean result = false;
            System.out.println(result);
        }


    }

}
