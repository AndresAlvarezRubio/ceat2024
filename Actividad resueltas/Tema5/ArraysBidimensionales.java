package Tema5;
/**Solicitar al usuario que genere una tabla de 5x5
* */
import java.util.Arrays;
import java.util.Scanner;

public class ArraysBidimensionales {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(solicitarNum()));

    }
    public static int[][] solicitarNum(){

        int numeros[][]= new int[3][3];

        for (int i = 0; i < 3; i++) {

            System.out.println("");

            for (int j = 0; j < 3; j++) {

                System.out.print("Ingrese el número de la fila " + i + " y de la columna " + j + ": ");
                numeros[i][j] = sc.nextInt();

            }

        }

        return numeros;
    }
}
