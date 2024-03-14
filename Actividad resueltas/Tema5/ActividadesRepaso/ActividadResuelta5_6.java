package Tema5.ActividadesRepaso;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

/**Definir una función que tome como parámetros dos tablas, la primera
 * con los 6 números de una apuesta de la primitiva, y la segunda
 * (ordenada) con los 6 números de la combinación ganadora. La función
 * devolverá el número de aciertos*/
public class ActividadResuelta5_6 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        primitiva();

    }
    public static void primitiva() {

       int numsUser[] = new int[6];


        for (int i = 0; i < numsUser.length; i++) {

            System.out.print("Introduzca un número: ");
            int numNew = sc.nextInt();

            if (numNew < 39) {

                 int indiceBusqueda = 0;

                 while(indiceBusqueda < numsUser.length && numsUser[indiceBusqueda] != numNew) {

                     indiceBusqueda++;

                     if (indiceBusqueda < numsUser.length) {
                         numsUser[i] += numNew;
                     } else {
                         System.err.println("\nEl número introducido ya está en la lista.");
                         i--;
                     }
                 }
            } else {
                System.err.println("El número introducido no está dentro del rango");
                i--;
            }
        }
        sort(numsUser);
        System.out.println("Su apuesta es: " + Arrays.toString(numsUser));

        comparativeUsers(numsUser);

    }
    public static void comparativeUsers(int[] numsUser) {



    }

}
