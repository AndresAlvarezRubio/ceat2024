package ActividadesResueltas;

import java.util.Scanner;

public class ActividadResuelta_47 {

/**
* Escribir una función a la que se le pase
* un número entero y devuelva el número de
* divisores primos que tiene*/
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número entero: ");
    int n = sc.nextInt();
    int resPrim = esPrimo(n);

    System.out.println(resPrim);
  }

  public static int esPrimo(int n) {

    int calcPrim = 0;
    boolean prime = true;

      for(int j = 1; j <= n; j++) {
        if (n % j == 0) {
          prime = false;
          calcPrim += 1;

        }

      }

    return calcPrim;

  }

}
