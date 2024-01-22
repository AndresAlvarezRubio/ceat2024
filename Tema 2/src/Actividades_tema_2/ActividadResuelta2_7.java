package Actividades_tema_2;

import java.util.Scanner;

public class ActividadResuelta2_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.print("Introduce el primer número: ");
        int n1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int n2 = sc.nextInt();
        System.out.print("Introduce el tercer número: ");
        int n3 = sc.nextInt();
        System.out.println("");

        if ((n1 > n2) && (n1 > n3) && (n2>n3)) {
            System.out.println("El orden es: " + n1 + ", " + n2 + ", " + n3);
        } else if ((n1 > n2) && (n1 > n3) && (n3>n2)) {
           System.out.println("El orden es: " + n1 + ", " + n3 + ", " + n2);
        } else if ((n2 > n1) && (n2 > n3) && (n1>n3)) {
           System.out.println("El orden es: " + n2 + ", " + n1 + ", " + n3);
        } else if ((n2 > n1) && (n2 > n3) && (n3>n1)) {
           System.out.println("El orden es: " + n2 + ", " + n3 + ", " + n1);
        } else if ((n3 > n1) && (n3 > n2) && (n2>n1)) {
           System.out.println("El orden es: " + n3 + ", " + n2 + ", " + n1);
        } else if ((n3 > n1) && (n3 > n2) && (n1>n2)) {
           System.out.println("El orden es: " + n3 + ", " + n1 + ", " + n2);
        }

    }

}
