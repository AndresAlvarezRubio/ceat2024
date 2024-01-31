import java.util.Scanner;

public class ActividadResuelta3_10 {

    public static void main(String[] args) {
        byte sumaAleatoria = 0;
        for (int i = 1; i <= 10; i++ ) {
            if (i%2==0) {
                continue;
            }
            sumaAleatoria +=i;
        }
            System.out.println(sumaAleatoria);
    }
}
