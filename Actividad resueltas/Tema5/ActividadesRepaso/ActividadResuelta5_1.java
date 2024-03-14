package Tema5.ActividadesRepaso;

import java.util.Arrays;

/**
 * Crea una tabla de longitud 10 que se inicializará
 * con números aleatorios comprendidos entre 1 y 100.
 * Mostrar todos los números aleatorios que se guarden
 * en la tabla y su suma.
 * */
public class ActividadResuelta5_1 {

    public static void main(String[] args) {

        calculo();

    }
    public static void calculo() {

        int tabla[] = new int[10];
        int numTot = 0;

        for (int i = 0; i < tabla.length; i++) {

            tabla[i] = (int)(Math.random()*100+1);
            numTot += tabla[i];

        }

        System.out.println(Arrays.toString(tabla));
        System.out.println(numTot);


    }
}
