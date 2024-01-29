package Actividades_tema_2;

import java.util.Scanner;

public class ActividadAplicacion2_19 {

/**
* Crea una aplicación que solicite al usuario cuántos grados
* tiene un ángulo y muestre el equivalente en radianes. Si el
* ángulo introducido por el usuario no se encuentra en el rango
* de 0° a 360°, hay que transformarlo a dicho rango.
*
* Nota: El  * operador módulo puede ayudarnos a convertir un ángulo
* a su  * equivalente en el rango comprendido de 0° a 360°.
* */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double radTot=0;
        System.out.print("Introduzca los grados: ");
        double degUser = sc.nextDouble();

        degUser = degUser>360 || degUser < -360? degUser%360: degUser;

        radTot = (degUser * ((Math.PI )/180));

        System.out.println("Los radianes son: " + radTot);
    }

}
