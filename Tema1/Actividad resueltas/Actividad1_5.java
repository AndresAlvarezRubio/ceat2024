import java.util.Scanner;

public class Actividad1_5 {

    public static void main(String[] args) {

    //Nombre de Scanner
    Scanner comprobacionLimite = new Scanner(System.in);

    //Input
    System.out.println("");
    System.out.print("Introduce el número 32767 para continuar el ciclo -> ");
    short valorIntroducir = comprobacionLimite.nextShort();

    //Output
    System.out.print((short)(++valorIntroducir));
    System.out.println("");
    }


}
