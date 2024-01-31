import java.util.Scanner;

public class ActividadResuelta3_13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte notaUser = 0, suspensos = 0, condicionado = 0;

        for (int i = 1; i <= 6; i++) {

            System.out.print("Introduzca la nota del alumno: ");
            notaUser = sc.nextByte();

            if (notaUser < 4) {

                suspensos++;

            } else if (notaUser == 4 ) {

                condicionado++;

            }
        }

        System.out.println("La cantidad de suspensos es de: " + suspensos);
        System.out.println("La cantidad de condicionados es de: " + condicionado);
        System.out.println("La cantidad de aprobados es de: " + (6-suspensos-condicionado));

    }

}
