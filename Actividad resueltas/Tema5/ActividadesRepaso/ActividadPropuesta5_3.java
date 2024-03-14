package Tema5.ActividadesRepaso;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Introduce por teclado un número n; a continuación, solicita al usuario
 * que teclee n números positivos, la media de los negativos y cuenta el
 * número de ceros introducidos.
 * */
public class ActividadPropuesta5_3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        prueba();

    }
    public static void prueba() {

        //Se pide la cantidad de números a introducir
        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();

        //Se pide la cantidad de números equivalente al número introducido antes
        System.out.println("Introduzca un número entero " + n + " veces");
        int[] numIntrod = new int[n];

        int zeroCounter = 0, negativeCounter = 0, positiveCounter = 0,negativeTotal = 0, positiveTotal = 0;
        double mediaNegative0,mediaPositive=0;

        //Se pide la cantidad de números equivalente al número introducido antes
        for (int i = 0; i < n; i++) {

            System.out.print("Introduce el número " + (i+1) + ": ");
            int inputUser = sc.nextInt();
            numIntrod[i] = inputUser;

            if (inputUser==0) {
                zeroCounter++;
            } else if (inputUser < 0) {
                negativeTotal+=inputUser;
                negativeCounter++;
            } else {
                positiveTotal+=inputUser;
                positiveCounter++;
            }
        }

        System.out.println(Arrays.toString(numIntrod));
        if(zeroCounter > 0) {System.out.println("El número total de ceros es de: " + zeroCounter);}
        if (positiveCounter > 0) {System.out.println("La media total de positivos es de: " + (double)(positiveTotal/positiveCounter));}
        if (negativeCounter > 0) {System.out.println("La media total de positivos es de: " + (double)(negativeTotal/negativeCounter));}

    }

}
