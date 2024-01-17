import javax.swing.text.Style;
import java.util.Scanner;

public class Actividad1_12 {

    public static void main(String[] args) {

        //Scanner
        Scanner numUser = new Scanner(System.in);


        //Input User
        System.out.print("");
        System.out.print("Introduce un número aleatorio: ");
        double numeroAleatorio = numUser.nextDouble();
        System.out.print("");

        //Output
        String respuestaConsola= numeroAleatorio<0 ?"Tu número " + numeroAleatorio + " es negativo. Ahora tu número es: " + (numeroAleatorio*-1) : "Tu número ya es positivo: " + numeroAleatorio;
        System.out.println(respuestaConsola);


    }

}
