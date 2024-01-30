import java.util.Scanner;

public class ActividadResuelta3_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte edadesUsers = 0;
        int numUsers = 0, totUsers=0, mayEdad = 0, sumTot=0;

        System.out.print("Introduzca la edad: ");
        edadesUsers = sc.nextByte();
        sumTot = edadesUsers;

        while (edadesUsers != -1 ) {
            System.out.print("Introduzca la edad: ");
            edadesUsers = sc.nextByte();
            sumTot += edadesUsers;
            numUsers++;
            if (edadesUsers >= 18) {
                mayEdad++;
            }
        }

        System.out.println("El total de usuarios es de: " + numUsers);
        System.out.println("El total de usuarios mayores de edad es de: " + mayEdad);
        System.out.println("La suma total de usuarios es de: " + (sumTot+=1));
        System.out.println("La media total de usuarios es de: " + totUsers/numUsers);
    }
}
