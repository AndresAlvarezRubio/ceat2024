package tema1;

import java.util.Scanner;
import java.lang.String;


public class Actividad1_2 {

    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);

        System.out.println("");
        System.out.print("Hola, hemos recibido una denuncia a su nombre, escriba su número para identificarse: ");

        int numeroDenunciado=entrada.nextInt();

        System.out.println("");
        System.out.println("Recibido, su número es: " + numeroDenunciado + ". En los siguientes días nos pondremos en contacto.");

    }

}
