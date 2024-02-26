import java.util.Scanner;

public class Explicacion { /**Clase*/


  public static void main(String[] args) { /**Función Principal*/

      /**Solo se llaman a las funciones que se van a ejecutar*/
      tresSaludos(1);
      tresSaludos(2);
      tresSaludos(3);
      sumarEdad();

  }
  public static void tresSaludos(int veces) {

    System.out.println("Te van a saludar " + veces+ " veces, papasito.");

    for (int i=0; i < veces; i++) {

      System.out.println("Hola");

    }

  }

  public static void sumarEdad() {

    Scanner sc = new Scanner(System.in);

    System.out.print("\nEscribe tu nombre: ");
    String nombre = sc.nextLine();

    System.out.print("Escribe tu edad: ");
    byte edad = sc.nextByte();

    System.out.println("Dentro de 10 años, "+ nombre  + " tu edad será de: " + (edad+10) + " años.");

  }

}
