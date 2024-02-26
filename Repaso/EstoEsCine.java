import java.util.Scanner;

public class EstoEsCine {

  public static void main(String[] args) {

/**
 *
 *Precio película para mayores: 6.00€
 *Precio película para menores: 4.50€
 *
 *Los miércoles todos pagan: 4.50€
 *
 *Cartelera -> Película -> Mayores de edad solo
 *Cartelera -> Película -> Todas las edades
 *
 *Carnet Joven -> 4.50€
 *
 * Ferrari (TP)
 * Priscilla (TP)
 * Pobres Criaturas (>18)
 * La piscina (>18)
 * Kimetsu No Yaiba (>18)
 * Peppa Pig (TP)
 *
 */

    Scanner sc = new Scanner(System.in);
    byte pelicula = 0;
    boolean diaSem = false;

    System.out.println("*************************************");
    System.out.println("***                               ***");
    System.out.println("***           Cartelera           ***");
    System.out.println("***                               ***");
    System.out.println("***    1. Ferrari                 ***");
    System.out.println("***    2. Priscilla               ***");
    System.out.println("***    3. Pobres Criaturas        ***");
    System.out.println("***    4. La Piscina              ***");
    System.out.println("***    5. Kimetsu No Yaiba        ***");
    System.out.println("***    6. Peppa Pig               ***");
    System.out.println("***    7. Fin                     ***");
    System.out.println("***                               ***");
    System.out.println("*************************************");


    do {
        System.out.println("Película que se quiere ver: ");
        pelicula = sc.nextByte();

        switch (pelicula) {

            case 1,2,6 -> {
              System.out.println("Número de entradas: ");
              byte entMen = sc.nextByte();
            }
            case 3,4,5 -> {

            }
            default -> {

            }

        }

    } while (pelicula != 7) ;


    System.out.println("¿Es miércoles?");
    if (diaSem=true) {

    } else {
      System.out.print("El precio total es: ");
    }
  }
}
