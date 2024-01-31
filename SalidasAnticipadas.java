import java.util.Scanner;

public class SalidasAnticipadas {
/** Ejemplo: Indica la edad para entrar al pub. Solo
 * pueden entrar los mayores de 18. Y quiero saber
 * cuantas personas han entrado al local, porque el
 * aforo es de 100 personas.
 *
 * Indica la edad, y si es menor de 18, no entra y no
 * cuenta.
 *
 * Si es mayor, y el aforo es menor de 100, entra. Si
 * no, el programa se interrumpe porque no puedo tener
 * más de 100 personas.
 * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte edad;

        for (byte i= 1; i<=5; i++) {
            System.out.println("Introduzca su edad: ");
            edad = sc.nextByte();
            if (edad <18) {
                System.out.print("No tienes permitido el acceso.");
                i--;
            } else System.out.println("El aforo actual es " + i);

            if (i==5) {
                System.out.println("Aforo máximo alcanzado. Deteniendo programa.");
                break;
            }

        }

    }
}
