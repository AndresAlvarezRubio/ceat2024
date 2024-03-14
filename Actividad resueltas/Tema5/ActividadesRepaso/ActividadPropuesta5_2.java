package Tema5.ActividadesRepaso;

/**
 * Construye una tabla de 10 elementos del tipo que desees. Declara diferentes variables
 * de tabla que referenciarán la tabla creada. Comprueba, imprimiendo por pantalla, que todas
 * las variables contienen la misma referencia.
 * */
public class ActividadPropuesta5_2 {

    public static void main(String[] args) {

        int referencia1[],referencia2[];
        referencia1 = new int[90];
        referencia2=referencia1;

        System.out.println(referencia2 + ", " + referencia1);

    }

}
