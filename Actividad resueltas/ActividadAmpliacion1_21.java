import java.util.Scanner;

public class ActividadAmpliacion1_21 {

    public static void main(String[] args) {

        //Scanner
        Scanner numUser = new Scanner(System.in);

        //Inputs
        System.out.println("");
        System.out.print("Introduce el primer valor a comparar: ");
        int a = numUser.nextInt() ;
        System.out.print("Introduce el segundo valor a comparar: ");
        int b = numUser.nextInt() ;
        System.out.println("");

        //Output
        if (a==b) {
            System.out.println("True. Los números introducidos son iguales");
        } else if (a>b) {
            System.out.println("False. El primer número es mayor que el segundo.");
        } else {
            System.out.println("False. El primer número es menor que el segundo.");
        }


    }

}
