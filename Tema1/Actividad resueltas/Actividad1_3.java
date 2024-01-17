import java.time.LocalDateTime;
import java.util.Scanner;

public class Actividad1_3 {

    public static void main(String[] args) {

        Scanner formularioDeScan= new Scanner(System.in);

        //Input de edad
        System.out.print("Por favor, introduzca su edad: ");
        byte edadUsuario = formularioDeScan.nextByte();
        System.out.println("");

        //Respuesta
        System.out.println("Su edad actual es: " + edadUsuario + " años");
        System.out.println("");

        //Edad siguiente año
        System.out.println("El año que viene, tendrás " + ++edadUsuario);
    }

}
