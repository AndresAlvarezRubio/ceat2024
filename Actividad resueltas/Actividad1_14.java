import java.util.Scanner;

public class Actividad1_14 {

    public static void main(String[] args) {

        //Scanner
        Scanner inputNumero = new Scanner(System.in);

        //Input
        System.out.println("");
        System.out.println("Introduce el número: ");
        double numUser = inputNumero.nextDouble();

        //Aproximación
        System.out.println("");
        int variable = (int)Math.round(numUser);

        //Output
        System.out.println("Su actualizada es: " + variable);

    }

}
