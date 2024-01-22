package Actividades_tema_2;

import java.util.Scanner;

public class ActividadResuelta2_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número a comprobar: ");
        int numUser = sc.nextInt();

        numUser=numUser%2;
        if (numUser==0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

}
