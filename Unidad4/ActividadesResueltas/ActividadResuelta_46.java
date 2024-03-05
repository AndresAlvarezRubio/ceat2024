package ActividadesResueltas;

import java.util.Scanner;
/**Diseñar una función con el siguiente prototipo:
*   boolean esPrimo(int n)
*  que devolverá true si n es primo y false en caso contrario  */
public class ActividadResuelta_46 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean resPrim = esPrimo(n);

    if (resPrim) {
      System.out.println("El número es primo");
    }  else {
      System.out.println("El número no es primo");
    }
  }


  public static boolean esPrimo(int n) {

    boolean resFinal=true;

    for(int i = 2; i < n; i++) {
      if (n % i == 0) {
        resFinal = false;
        break;
      }
    }
    return resFinal;
  }
}
