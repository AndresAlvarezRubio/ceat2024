package PracticaConversion;

import java.util.Scanner;

public class ConversionEuros {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        userInterface();

    }

    public static void userInterface() {

        System.out.println("\nCambiador de Kilos a... ");
        System.out.println("\ta) Libra");
        System.out.println("\tb) Tonelada");
        System.out.println("\tc) Onza");
        System.out.println("\td) Miligramo");
        System.out.println("\tx) Salir");
        System.out.print("\nSelecciona la unidad de masa que será cambiada: ");

        char select = sc.next().charAt(0);

        if (select == 'a' || select == 'b' || select == 'c' || select == 'd' || select == 'x') {
            do {

                    conversion(select);

            } while (select != 'x');
        } else {

            System.err.print("El caracter introducido no es válido. Prueba otra vez: ");
            select = sc.next().charAt(0);

        }



    }


    public static void conversion(char select) {

        double kg;

        do {

            switch (select) {

                case 'a' -> {

                    System.out.print("Introduzca los kilos: ");
                    kg = sc.nextDouble();
                    System.out.println("El peso introducio en libras es de: " + kg*2.20462);

                }

            }

        } while (select != 'x');

        System.out.println("Cerrando...");

    }

}
