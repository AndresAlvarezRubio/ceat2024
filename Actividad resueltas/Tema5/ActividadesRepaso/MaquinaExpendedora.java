package Tema5.ActividadesRepaso;

import java.util.Arrays;
import java.util.Scanner;

/**@Description Array bidimensional de 4x4 con los nombres de las golosinas. Tener otro Array de 4x4 con los precios de las golosinas. Array de 4x4 del stock de cada golosina
 * @author Andrés Álvarez
 * @version 1.0 14/03/2024
 *
 * */
public class MaquinaExpendedora {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        maquinaExpend();

    }

    //Arrays
    static String[][] nombres = {{"KitKat", "Oreo", "Chips Ahoy", "Lays"}, {"KitKat White", "Oreo Choco Max", "Chips Ahoy Mini", "Lays +10Free"}, {"KitKat 1€", "Oreo Double Cream", "Chips Ahoy Flavour Cream", "Lays Spicy"}, {"Filete de KitKat", "Longaniza de Oreo", "Greenwich Chips Ahoy", "Mexican Lays"}};
    static double[][] precios = {{1.25, 2, 1.50, 1.95, 2.35}, {1.25, 2.50, 1.25, 1.50, 2.35},{1, 2.50, 1.50, 2, 2.50},{35, 27.50, 3205.29, 0.01}};
    static byte[][] stock = {{7,4,2,7,8}, {5,3,6,7,8},{2,4,3,7,3}, {1,1,5,7,88}};

    public static void maquinaExpend() {

        //Repetición de la interfaz ya que nunca debe apagarse
        int repetitiveInterfaz = 0;

        do {
            //Interfaz de calculadora
            maquinaInterf();

        } while (repetitiveInterfaz == 0);

    }
    public static void maquinaInterf(){

        //Interfaz de Usuario
        System.out.println("____________________________________________________________________________________________________________");
        System.out.println("-  \t 00.KitKat               01.Oreo                  02.Chips Ahoy                 03.Lays               -");
        System.out.println("-  \t 10.KitKat White         11.Oreo Choco Max        12.Chips Ahoy Mini            13.Lays +10Free       -");
        System.out.println("-  \t 20.KitKat 1€            21.Oreo Double Cream     22.Chips Ahoy Flavor Crem     23.Lays Spicy         -");
        System.out.println("-  \t 30.Filete de KitKat     31.Longaniza de Oreo     32.Greenwich Chips Ahoy       33.MexicanLays        -");
        System.out.println("____________________________________________________________________________________________________________");
        System.out.print("\t Introduce el número del producto deseado: ");


        inputUser(nombres);

    }
    public static void inputUser(String nombres[][]) {

        //Input del usuario y la separación de sus números
        int numUser = sc.nextInt();
        int decenas = numUser / 10;
        int unidades = numUser % 10;

        //Recorrido del bucle para comprobar el nombre y posición del producto.
        if(numUser==787849) {

            //Panel de administración para rellenar dulces
            panelAdmin();

        //Recorrido del input
        } else if ((decenas >=0 && decenas <= 3)&&(unidades >=0 && unidades <= 3)) {

            for (int i = 0; i < nombres.length; i++) {
                for (int j = 0; j < nombres.length; j++) {

                    //Comprobación de unidades y decenas
                    if (i == decenas && j == unidades) {

                        String prodUser = nombres[i][j];
                        comprobExist(prodUser,decenas,unidades);

                    }
                }
            }
        } else {System.err.println("\tEl producto está fuera de rango\n\n");}
    }
    public static void comprobExist(String prodUser, int decenas, int unidades) {

        //Comprobación de stock
        if (stock[decenas][unidades] == 0) {

            System.err.println("\t No hay stock suficiente");

        } else if (stock[decenas][unidades] > 0) {

            //Input dinero
            System.out.print("\t " + prodUser + " - " + precios[decenas][unidades] + "€.\n\t Introduce el dinero: ");
            double inputDineroUser = sc.nextDouble();

            //Comprobación dinero
            if (stock[decenas][unidades] > 0 && inputDineroUser >= precios[decenas][unidades]) {

                //Restar al stock de la unidad elegida
                stock[decenas][unidades]--;

                //Comprobación del cambio
                if (inputDineroUser - precios[decenas][unidades] > 0.00) {

                    double number = (inputDineroUser - precios[decenas][unidades]);

                    System.out.print("\t Cambio: ");
                    System.out.print((double)Math.round(number * 100d) / 100d);
                    System.out.println("€.\n");
                }
            } else if (inputDineroUser < precios[decenas][unidades])System.err.println("\tEl dinero introducido es insuficiente");
        }
    }
    public static void panelAdmin() {

        int numUser = 0;

        System.out.println("\t_____________________________________");
        System.out.println("\t Bienvenido al panel de administrador");
        System.out.println("\t_____________________________________");

        //Elección de producto a rellenar
        do {
            System.out.print("\t Elija el producto a rellenar: " + (numUser = sc.nextInt()) + "\n\t Pulse -1 para salir del modo administración");

            int decenas = numUser / 10;
            int unidades = numUser % 10;

            if ((decenas >= 0 && decenas <= 3) && (unidades >= 0 && unidades <= 3)) {

                for (int i = 0; i < nombres.length; i++) {
                    for (int j = 0; j < nombres.length; j++) {

                        //Comprobación de unidades y decenas
                        if (i == decenas && j == unidades) {

                            String prodUser = nombres[i][j];
                            System.out.print("\t Introduzca el nuevo stock total de " + prodUser + ": ");
                            stock[i][j] = sc.nextByte();
                        }
                    }
                }
            } else if (numUser==-1) {
                System.out.println("Cerrando panel de administración...");
            }else {
                System.err.println("\t Producto introducido fuera de rango");
            }
        } while (numUser!=-1);
    }
}