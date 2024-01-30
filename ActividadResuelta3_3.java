import java.util.Scanner;

public class ActividadResuelta3_3 {

    public static void main(String[] args) {

        byte numRandom = (byte) (Math.random()*99);

        System.out.println(numRandom);
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Acierta el número! ->");
        int numIntrod = sc.nextInt();

        if (numRandom!=numIntrod) {
            while ((numIntrod < 100 && numIntrod>0) && !(numIntrod <= 0)) {
                if (numRandom < numIntrod) {
                    System.out.println("El número a acertar es más pequeño");
                } else if (numRandom > numIntrod) {
                    System.out.println("El número a acertar es más grande");
                }
                numIntrod = sc.nextInt();

                if (numRandom == numIntrod) {
                    System.out.println("¡Acertaste!");
                    numIntrod= -1;
                }
            }
        } else {
            System.out.println("¡Acertaste!");
        }
    }
}
