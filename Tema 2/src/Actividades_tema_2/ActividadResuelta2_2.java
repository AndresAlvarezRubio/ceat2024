package Actividades_tema_2;

import java.util.Scanner;

public class ActividadResuelta2_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numUser1 = sc.nextInt();
        System.out.println("");
        System.out.print("Introduce otro número: ");
        int numUser2 = sc.nextInt();

        if (numUser2==numUser1) {
            System.out.println("Los números son iguales");
        } else {
            System.out.println("Los números son distintos");
        }

    }

}
