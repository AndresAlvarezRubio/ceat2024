package Tema5.ActividadesRepaso;

import java.util.Arrays;
import java.util.Scanner;

/**Escribir la función int[] rellenaPares(int longitud, int fin), que
 * crea y devuelve una tabla ordenada de la longitud específica, que
 * se encuentra rellena con números pares aleatorios comprendidos en
 * el rango desde 2 hasta fin (inclusive).*/
public class ActividadResuelta5_5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Introduzca la cantidad de número de la lista: ");
        int longitud = sc.nextInt();

        System.out.print("Introduzca el último número par de la lista que sea mayor o igual a 2: ");
        int fin = sc.nextInt();

        //Comprobación número par
        if (fin%2==0 && fin>=2) {
            rellenaPares(longitud, fin);
            System.out.println(Arrays.toString(rellenaPares(longitud,fin)));
        }
        else {
            System.out.println("El número introducido no es par o es menor a 2");
        }

    }

    public static int[] rellenaPares(int longitud, int fin) {

        int table[] = new int[longitud];

        for (int i = 0; i < longitud; i++) {

            int comprobationNum = (int)(Math.random()*fin+1);

            if (comprobationNum%2 == 0 && comprobationNum >= 2) {

                table[i] = comprobationNum;

            } else {

                i--;

            }
        }
        return table;
    }

}
