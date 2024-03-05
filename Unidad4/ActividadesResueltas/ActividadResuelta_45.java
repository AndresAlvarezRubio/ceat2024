package ActividadesResueltas;

import java.util.Scanner;

/**Crear una función que, mediante un booleano, indique si el carácter
* que se pasa como parámetro de entrada corresponde con una vocal*/
public class ActividadResuelta_45 {

  public static void main(String[] args) {
    System.out.println("Escribe una letra: ");
    Scanner sc = new Scanner(System.in);
    String resUser = sc.nextLine();

    if (primeraComprobacion(resUser.charAt(0)) == true) {

      System.out.println("La letra introducida es una vocal");

    } else {

      System.out.println("La letra introducida no es una vocal");

    }

  }

  public static boolean primeraComprobacion(char resUser) {

    boolean resFinUser;

    if (resUser == 'a' || resUser == 'e' || resUser == 'i' || resUser == 'o' || resUser == 'u' ||
        resUser == 'A' || resUser == 'E' || resUser == 'I' || resUser == 'O' || resUser == 'U') {

      resFinUser = true;

    } else {

      resFinUser = false;

    }
    return resFinUser;
  }

}
