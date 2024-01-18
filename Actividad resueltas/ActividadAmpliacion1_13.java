import java.util.Scanner;

public class ActividadAmpliacion1_13 {

    public static void main(String[] args) {

/**
 * Modifica la Actividad de Aplicación 1.12 para que,
 * indicando dos números n y m, diga qué cantidad hay
 * que sumarle a n para que sea múltiplo de m.
 */

        Scanner scanNum = new Scanner(System.in);

        //Input
        System.out.print("Introduce un número a comprobar -> ");
        System.out.print("");
        int n = scanNum.nextInt();

        //Input 2
        System.out.print("Introduce un el número multiplo -> ");
        System.out.print("");
        int m = scanNum.nextInt();


        //Cálculo
        double resto = (m - n%m);
        System.out.println("Faltan por sumar: " + resto);
    }


}
