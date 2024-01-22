package Actividades_tema_2;

import java.util.Scanner;

public class ActividadPropuesta2_4 {

    public static void main(String[] args) {

        Scanner numUser = new Scanner(System.in);

        System.out.print("Introduzca num1: ");
        int numUser1 = numUser.nextInt();
        System.out.print("Introduzca num2: ");
        int numUser2 = numUser.nextInt();

        int resto = (numUser2 - numUser1%numUser2);

        if (resto == numUser2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
