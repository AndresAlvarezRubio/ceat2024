package Tema5;

import java.util.Arrays;
import java.util.Scanner;

/*Vamos a realizar la cesta de la compra...
*Cada vez que compramos, variamos de productos, y cantidad.
*Crearemos un Array que crecerá a medida que insertemos productos,
* para ello utilizaremos un pequeño menú, y para la ejecución, funciones
* de búsequeda y de inserción.
*/
public class InsertarOrdenadaFunciones {

    static Scanner sc = new Scanner(System.in);
    static String[] cesta = new String[0];
    public static void main(String[] args) {

        userInterface();

    }

    public static String[] insertar(String[] cesta) {
        //pregunto producto a insertar
        mostrarSinLn("Indica el nombre del producto: ");
        String producto = sc.next();

        //Se busca producto con la función de buscarProducto()
        boolean existe = buscarProducto(cesta,producto);

        //Lo buscamos, si está, enviamos un mensaje, si no, lo insertamos...
        if (existe) {mostrarSinLn("El producto que indicas ya existe.");}
        else {
            //Agregar nuevo espacio en la lista
            cesta = Arrays.copyOf(cesta,cesta.length+1);

            //Agregar producto en ese espacio
            cesta[cesta.length-1]=producto;
        }

        //Se devuelve a la función menú
        return cesta;
    }

    public static boolean buscarProducto(String cesta[], String productoNuevo){

        boolean existe = false;
        int indice = 0;

        while (indice<cesta.length && !cesta[indice].equals(productoNuevo)) {  indice++;  }
        if (indice<cesta.length) {  existe=true;  }

        return existe;
    }

    public static String[] eliminar(String cesta[]) {

        //Pedir input a eliminar
        mostrarSinLn("Indica el nombre del producto a eliminar: ");
        String productoEliminar = sc.next();
        sc.nextLine();

        int indice = 0;

        for (int i = 0; i < cesta.length; i++) {

            if (cesta[i].equals(productoEliminar)) {
                indice = i;
            }
        }
            boolean existe = buscarProducto(cesta, productoEliminar);
            if (!existe) {
                mostrar("El producto introducido no está en la lista.");
            } else {
                cesta[indice] = cesta[cesta.length - 1];
                cesta = Arrays.copyOf(cesta, cesta.length - 1);
            }

        mostrar(Arrays.toString(cesta));
        return cesta;

    }

    public static void mostrar(String texto) {System.out.println("\t" + texto);}
    public static void mostrarSinLn(String texto) {System.out.print("\t" + texto);}
    public static void userInterface() {

        mostrar("\nCesta de la compra:");
        mostrar("1. Insertar");
        mostrar("2. Mostrar Cesta");
        mostrar("3. Eliminar Producto");
        mostrar("4. Imprimir y Salir");
        mostrarSinLn("\nIndica tu opción: ");

        byte opcion = sc.nextByte();

        switch (opcion) {
            case 1 -> {
                cesta=insertar(cesta);
                userInterface();
            }
            case 2 -> {
                mostrar(Arrays.toString(cesta));
                userInterface();
            }
            case 3 -> {
                cesta=eliminar(cesta);
                userInterface();

            }
            case 4 -> {
                mostrar(Arrays.toString(cesta));
            }
        }
    }
}