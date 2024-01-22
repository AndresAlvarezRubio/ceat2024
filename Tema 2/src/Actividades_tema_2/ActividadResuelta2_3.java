package Actividades_tema_2;

import java.util.Scanner;

public class ActividadResuelta2_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numUser1 = sc.nextInt();

        System.out.print("Introduce un número distinto al anterior: ");
        int numUser2 = sc.nextInt();

        if (numUser1 < numUser2) {
            System.out.println("El número " + numUser2 + " es mayor que el número " + numUser1);
        } else if (numUser1 > numUser2) {
            System.out.println("El número " + numUser1 + " es mayor que el número " + numUser2);
        } else {
            System.out.println("Dije números diferentes.");
        }


    }

}
