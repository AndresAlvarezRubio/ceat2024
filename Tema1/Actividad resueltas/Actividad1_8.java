import java.util.Scanner;

public class Actividad1_8 {

    public static void main(String[] args) {

        //Scanner
        Scanner mayorEdad = new Scanner(System.in);

        //Input edad
        System.out.print("Por favor, indica tu edad para acceder: ");
        short edadUser = mayorEdad.nextShort();

        //Requerimiento de edad
        boolean paseUsuario = edadUser > 17;

        //Resultado del requerimiento
        System.out.println(paseUsuario);
    }

}
