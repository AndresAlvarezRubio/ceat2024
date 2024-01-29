package Actividades_tema_2;

import java.util.Scanner;

public class ActividadAplicacion2_15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba la base del triángulo: ");
        double base = sc.nextDouble();

        System.out.print("Escriba la altura del triángulo: ");
        base *= sc.nextDouble();

        if(base>0) {
            System.out.println("El área total del triángulo es de: " + base / 2);
        } else {
            System.out.println("Algunas de las medidas introducidas no son permitidas.");
        }
    }
}
