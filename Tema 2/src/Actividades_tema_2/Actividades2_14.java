package Actividades_tema_2;

import java.util.Scanner;

public class Actividades2_14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.print("Escriba un número entre 1 y 99: ");
        byte numUser = sc.nextByte();

        if (numUser > 0 && numUser < 100) {

        } else {
            System.out.println("El número introducido no está en rango");
        }
    }

}
