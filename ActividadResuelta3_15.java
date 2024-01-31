import java.util.Scanner;

public class ActividadResuelta3_15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el ancho que desea: ");
        int numUser = 5;

        for ( int row = 1 ; row <= numUser ; row++ ) {
            for (int col = row ; col <= numUser ; col++) {
                System.out.print("🗿");
            }
                System.out.println("");
        }
    }
}
