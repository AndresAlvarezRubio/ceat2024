import java.util.Scanner;

public class EjercicioDiscoteca {

/**
 * Pedir edad para poder entrar a discoteca solo si eres mayor de edad
 *
 * */
    public static void main(String[] args) {

        //Scanner
        Scanner scanEdad = new Scanner(System.in);

        //Input user
        System.out.print("Introduce tu edad: ");
        byte edadUser = scanEdad.nextByte();
        System.out.println("");

        //Output
        String edadUsuario = edadUser >= 18?"Adelante" : "No puedes pasar";
        System.out.println(edadUsuario);

    }
}
