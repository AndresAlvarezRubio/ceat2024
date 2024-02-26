package ActividadesResueltas;

import java.util.Scanner;

/**Diseñar una función que recibe como parámetros dos números enteros
 * y devuelve el máximo de ambos*/
public class ActividadResuelta_44 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el primer número: ");
    int num1 = sc.nextInt();

    System.out.print("Introduce el segundo número: ");
    int num2 = sc.nextInt();

    comparacion(num1, num2);

  }

  public static void comparacion(int num1, int num2) {

    if (num1 != num2) {
      int resFinal = (num1 < num2) ? num2 : num1;
      System.out.println("\nEl número de mayor tamaño es: " + resFinal);
    } else {
      System.out.println("\nAmbos números son iguales");
    }

  }

}
