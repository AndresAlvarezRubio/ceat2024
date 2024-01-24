package Actividades_tema_2;

import java.util.Scanner;

public class ActividadResuelta2_8 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.println("Introduce la incógnita *a*: ");
        double a = num.nextInt();
        System.out.println("Introduce la incógnita *b*: ");
        double b = num.nextInt();
        System.out.println("Introduce la incógnita *c*: ");
        double c = num.nextInt();

        if (((Math.pow(b,2))-(4*a*c)) > 0 ) {
            double x = (-b + (Math.sqrt(Math.pow(b,2) - (4*a*c))))/(2*a);
            double y = (-b - (Math.sqrt(Math.pow(b,2) - (4*a*c))))/(2*a);
            System.out.println("El resultado sumando es: " + x);
            System.out.println("El resultado restando es: " + y);
        } else if (((Math.pow(b,2))-(4*a*c)) == 0) {
            double x = (-b/(2*a));
            System.out.println("El resultado es: " + x);
        } else if (((Math.pow(b,2))-(4*a*c)) < 0) {
            System.out.println("No existe ningún posible resultado");
        }

    }

}
