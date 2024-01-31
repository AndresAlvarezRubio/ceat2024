import java.util.Scanner;

public class ActividadResuelta3_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte notaUser = 0, suspensos = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Introduzca la nota del alumno: ");
            notaUser = sc.nextByte();

            if (notaUser < 5) {

                suspensos++;

            }

        }

        if (suspensos > 0) {

            System.out.println("La cantidad de suspensos es de: " + suspensos);

        } else {

            System.out.println("¡Enhorabuena, nadie ha suspendido!");

        }

    }

}
