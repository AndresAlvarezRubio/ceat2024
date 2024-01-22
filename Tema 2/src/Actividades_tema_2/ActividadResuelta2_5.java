package Actividades_tema_2;

import java.util.Scanner;

public class ActividadResuelta2_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        double numUser1 = sc.nextDouble();

        System.out.println("Introduce otro número: ");
        double numUser2 = sc.nextDouble();

        if (numUser1>numUser2) {
            System.out.println("El orden a seguir es: " + numUser1 + ", " + numUser2);
        }  else if(numUser2>numUser1) {
            System.out.println("El orden a seguir es: " + numUser2 + ", " + numUser1);
        }

    }

}
