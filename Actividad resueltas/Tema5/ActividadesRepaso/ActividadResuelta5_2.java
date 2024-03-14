package Tema5.ActividadesRepaso;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadResuelta5_2 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        tablaPedida();

    }

    public static void tablaPedida(){

        double tabla[] = new double[5];

        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Introduzca el número con decimal " + (i+1) + ": ");
            tabla[i] = sc.nextDouble();
        }

        System.out.println(Arrays.toString(tabla));

    }
}
