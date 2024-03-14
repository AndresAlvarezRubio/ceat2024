package Tema5.ActividadesRepaso;

import java.util.Arrays;
import java.util.Scanner;

/**Diseñar la función: int maximo(int t[]), que
 * devuelva el máximo valor contenido en la tabla t.*/

public class ActividadResuelta5_4 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int t[]=new int[5];
        int max=maximo(t);

        System.out.println("El número de mayor valor introducido es: " + max);

    }
    public static int maximo(int t[]) {

        for (int i = 0; i < 5; i++) {

            System.out.print("Introduzca el número " + (i + 1) + ": ");
            t[i] = sc.nextInt();

        }

        int max=t[0];

        for(int ele:t){
            if (ele > max){
                max = ele;
            }
        }
        return max;
    }

}
