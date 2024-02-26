package ActividadesResueltas;

import java.util.Scanner;

/**
* Diseñar la funcion eco() a la que se le pasa como
* parámetro un número n, y muestra por pantalla n
* veces el mensaje <Eco...>*/

public class ActividadResuelta_41 {

    public static void main(String[] args) {

        //Input
        System.out.println("Introduce un número para que aparezca el mensaje: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Recuperar función
        eco(n);

    }
    public static void eco(int numero) {

        for (int i = 1; i <= numero; i++) {

            System.out.println("Eco...");

        }

    }

}
