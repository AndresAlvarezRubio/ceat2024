import java.util.Scanner;

public class Actividad3_2P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce cuantas veces quieres que te salude: ");
        int veces = sc.nextInt();
        for (int i = 0; i <= veces; i++){
            System.out.println("¡Saludos!");
        }

    }
}
