package Actividades_tema_2;

import java.util.Scanner;

public class ActividadResuelta2_9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número real: ");
        int numUser = sc.nextInt();
        System.out.println("");
        if (numUser >= 0 && numUser <= 9) {
            System.out.println("Su número es de 1 cifra");
        }else if (numUser >= 10 && numUser <= 99) {
            System.out.println("Su número es de 2 cifras");
        }else if (numUser >= 100 && numUser <= 999) {
            System.out.println("Su número es de 3 cifras");
        }else if (numUser >= 1000 && numUser <= 9999) {
            System.out.println("Su número es de 4 cifras");
        }else if (numUser >= 10000 && numUser <= 99999) {
            System.out.println("Su número es de 5 cifras");
        } else {
            System.out.println("Su número no entra en rango");
        }

    }
}
