package ActividadesResueltas;

import java.util.Scanner;

public class ActividadResuelta_42 {
/**Escribir una función en la que se le pasen dos enteros
* y muestre todos los números comprendidos entre ellos*/
  public static void main(String[] args) {

    System.out.print("Introduce un número: ");

    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    System.out.print("Introduce otro número: ");
    int num2 = sc.nextInt();

    comparacionNums(num1,num2);
  }

  public static void comparacionNums(int num1, int num2) {

    if (num1 >= num2) {

      for (int i = num2 ; i <= num1; i++) {

        System.out.println(i);

      }

    } else {

      for (int i = num1 ; i <= num2; i++) {

        System.out.println(i);

      }

    }

  }

}
