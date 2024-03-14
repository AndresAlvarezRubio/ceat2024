package Tema5.ActividadesRepaso;

import java.util.Scanner;

public class ActividadPropuesta5_4 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        mainAux();

    }
    public static void mainAux() {

        int t[] = new int[] {545,63456,4,63,23,6,485};

        System.out.print("Introduce un número a buscar: ");
        int clave = sc.nextInt();

        buscar(t,clave);

    }
    public static int buscar(int t[],int clave) {

        int indiceBusqueda = 0;

        while(indiceBusqueda < t.length && t[indiceBusqueda] != clave) {

            indiceBusqueda++;

        }
        if (indiceBusqueda < t.length) {

            System.out.println("El número introducido está en la posición: " + (indiceBusqueda+1));

        } else {

            System.out.println("El número introducido no está en la tabla");

        }

        return indiceBusqueda;

    }

}
