import java.util.Scanner;
public class ActividadResuelta3_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int heightTree = 0, bigTree= 0;

        while (heightTree != -1) {
            System.out.print("Introduzca la medida de los árboles en cm: ");
            heightTree = sc.nextInt();
            bigTree = (heightTree > bigTree)? bigTree = heightTree : bigTree;
        }
        System.out.println("El tamaño del árbol más grande es de " + bigTree + "cm");
    }
}
