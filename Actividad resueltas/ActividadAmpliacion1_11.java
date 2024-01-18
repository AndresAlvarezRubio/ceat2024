import java.util.Scanner;

public class ActividadAmpliacion1_11 {

    public static void main(String[] args) {

 /**
 *Un economista te ha encargado un programa para realizar cálculos con el IVA.
 * La aplicación debe solicitar la base imponible y el IVA que se debe aplicar.
 * Muestra en pantalla el importe correspondiente al IVA y al total.
 */
        //Scanner
        Scanner baseImponibleScan = new Scanner(System.in);

        //Input
        System.out.println("");
        System.out.print("Introduzca la base imponible: ");
        float baseImponible = baseImponibleScan.nextFloat();

        //Output Cálculo
        System.out.println("");
        System.out.println("El 21% de su base imponible es de: " + (baseImponible*=0.21));
        //System.out.println("El monto total que se queda es de: " + (baseImponible*=3.7619));
        System.out.printf("El monto total que se queda es de: %.2f" , (baseImponible*=3.7619));
        System.out.println("");
        /** Para limitar a 2 decimales:
         * https://es.stackoverflow.com/questions/29408/como-limitar-la-cantidad-de-decimales-de-un-double */

    }

}
