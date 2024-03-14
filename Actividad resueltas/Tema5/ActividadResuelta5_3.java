import java.util.Scanner;

/**
 * Escribir una aplicación que solicite al usuario cuantos
 * números desea introducir. A continuación, introducir por
 * teclado esa cantidad de números enteros, y por último,
 * mostrar en el orden inverso al introducido.*/
public class ActividadResuelta5_3 {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    mostrar("Indique el número de elementos enteros a insertar->");
    int longitud= sc.nextInt();

    int numeros[]=new int[longitud];

    for (int i = 0 ; i < longitud; i++) {

      mostrar("Indique el número");
      numeros[i]=sc.nextInt();

    }
    mostrar("Muestra de forma inversa los números insertados");
    mostrar("...............................................");

    for (int i = numeros.length-1; i >=0 ; i--) {

      mostrar("-> "+numeros[i]);

    }

  }
  public static void mostrar(String texto) {

    System.out.println("" + texto);

  }
}
