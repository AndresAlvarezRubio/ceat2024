import java.util.Scanner;

public class ActividadResuelta3_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número -> ");
        int numUser = sc.nextInt();
        for (int i=(numUser-1); i>=1 ; i--) {
            numUser*=i;
        }
            System.out.println(numUser);
    }
}
