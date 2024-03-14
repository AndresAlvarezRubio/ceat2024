package Tema5.ActividadesRepaso;

import java.util.Arrays;

/**Crea tres tablas de 5 elementos: la primera de enteros, la segunda
 * de double y la tercera de booleanos. Muestra las referencias en las
 * que sse encuentra cada una de las tablas anteriores*/
public class ActividadPropuesta5_1 {

    public static void main(String[] args) {

        altaArrays();

    }
    public static void altaArrays() {

        /**Alta de Arrays*/
        int[] numEnteros = {5,4,2,6,8,10,3455432};
        double[] numConDecim = {3,5.654,234.65,234,6.74,23};
        boolean[] datosTrueFalse = {true,false,true,true,false,false,false};

        /**Impresión de contenido*/
        System.out.println(numEnteros + "\n" + Arrays.toString(numEnteros) +"\n*****************\n" + numConDecim + "\n" + Arrays.toString(numConDecim) +"\n*****************\n" + datosTrueFalse + "\n" + Arrays.toString(datosTrueFalse) +"\n*****************\n");

    }
}

