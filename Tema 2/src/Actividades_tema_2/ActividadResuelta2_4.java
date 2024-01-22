package Actividades_tema_2;

import java.util.Scanner;

public class ActividadResuelta2_4 {

/**
 * Implementar un programa que pida por teclado
 * un número decimal e indique si es un número
 * casi-cero, que son aquellos, positivos o negativos,
 * que se acercan a 0 por menos de 1 unidad, aunque
 * curiosamente el 0 no se considera un número casi-cero.
 * Ejemplos de números casi-cero son el 0.3, el −0.99 o el 0.123;
 * algunos números que no se consideran casi-ceros son: el 12.3,
 * el 0 o el −1.*/


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su número a clasificar: ");
        double numUser = sc.nextDouble();

        if ((numUser < 1 && numUser > 0) || (numUser < 0 && numUser > -1 )) {
            System.out.println("Su número es casi-cero");
        } else  {
            System.out.println("Su número NO es casi-cero");
        }

    }

}
