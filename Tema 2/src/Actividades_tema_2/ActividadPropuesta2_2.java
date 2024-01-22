package Actividades_tema_2;

import java.util.Scanner;

public class ActividadPropuesta2_2 {

    public static void main(String[] args) {

        Scanner comprobacion = new Scanner(System.in);

        System.out.println("");
        System.out.print("Introduce un número positivo: ");
        int respuestaUser = comprobacion.nextInt();

        if(respuestaUser < 0) {
            System.out.print("¿Sabes lo que es un número positivo? Prueba otra vez: ");
            respuestaUser = comprobacion.nextInt();
            if (respuestaUser < 0) {
                System.out.print("¿Es enserio? Es por encima del 0... Prueba otra vez: ");
                respuestaUser = comprobacion.nextInt();
                if (respuestaUser < 0) {
                    System.out.print("Déjalo estar... Ese número debería de ser " + (respuestaUser * -1) + "... Ya aprenderás.");
                }
                else {
                    System.out.println("Costó, pero lo conseguiste. Enhorabuena.");
                }
            }
            else {
                System.out.println("Genial, lo conseguiste.");
            }
        }
        else {
            System.out.println("¡Muy bien, acertaste!");
        }
    }

}
