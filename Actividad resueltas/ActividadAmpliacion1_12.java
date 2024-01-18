import java.util.Scanner;

public class ActividadAmpliacion1_12 {

    public static void main(String[] args) {

/**
  * Escribe un programa que tome como entrada un número entero
  * e indique qué cantidad hay que sumarle para que el resultado
  * sea múltiplo de 7. Un ejemplo:  A 2 hay que sumarle 5 para
  * que el resultado (2 + 5 = 7) sea múltiplo de 7.  A 13 hay que
  * sumarle 1 para que el resultado (13 + 1 = 14) sea múltiplo de 7.
  * Si proporcionas el número 2 o el 13, la salida de la aplicación
  * debe ser 5 o 1, respectivamente.
  */

        Scanner scanNum = new Scanner(System.in);

        //Input
        System.out.print("Introduce un número a comprobar -> ");
        System.out.print("");
        int comprobNum = scanNum.nextInt();

        //Cálculo
        double resto = (7 - comprobNum%7);
        System.out.println("Faltan por sumar: " + resto);

    }

}
