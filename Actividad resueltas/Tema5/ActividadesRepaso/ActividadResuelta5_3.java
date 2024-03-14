package Tema5.ActividadesRepaso;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadResuelta5_3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Introduzca cuantos números desea introducir: ");
        int n = sc.nextInt();
        int[] numUser = new int[n];

        for (int i = 0; i < numUser.length; i++) {

            System.out.print("Introduzca el número " + (i+1) + ": ");
            numUser[i] = sc.nextInt();

        }
        System.out.print("El orden de los números es: ");
        System.out.println(Arrays.toString(numUser));


        System.out.print("El orden de los números invertidos es: ");
        for (int i = numUser.length - 1; i >= 0 ; i--) {

            System.out.print(numUser[i] + ", ");

        }
    }

}
