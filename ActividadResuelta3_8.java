import java.util.Scanner;

public class ActividadResuelta3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numInput = 0;

        for (int i = 0; i <10; i++) {
            System.out.print("Introduzca un número -> ");
            numInput += sc.nextInt();
        }
        System.out.println("El resultado final es: " + numInput/10);
    }
}
