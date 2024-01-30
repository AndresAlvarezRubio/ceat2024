import java.util.Scanner;

public class ActividadResuelta3_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numIntrod = sc.nextDouble();
        while (numIntrod != 0) {

            if (numIntrod>0) {
                System.out.println("Su número es positivo");
            } else if (numIntrod < 0) {
                System.out.println("Su número es negativo");
            }
            if (numIntrod%2 == 0) {
                System.out.println("Su número introducido es par");
            } else if (numIntrod%2 == 1) {
                System.out.println("Su número introducido es impar");
            }
            System.out.println("El cuadrado de su número es: " + (Math.pow(numIntrod,2)));
            numIntrod = sc.nextDouble();
        }
    }

}
