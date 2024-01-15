import javax.swing.text.Style;
import java.util.Scanner;

public class Actividad1_9 {

    public static void main(String[] args) {

        //Scanner
        Scanner comprobacion = new Scanner(System.in);

        //Input
        System.out.print("Introduzca el número para comprobar: ");
        int numUser = comprobacion.nextInt();

        //Cálculo
        boolean comprobacionNumero = ( (numUser%2) == 0 );

        //Output
        System.out.println(comprobacionNumero);

    }

}
