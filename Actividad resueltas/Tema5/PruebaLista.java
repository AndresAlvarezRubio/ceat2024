import java.util.Scanner;

/**
* Nombre -> (10 elementos...)
* Teléfono -> (10 elementos...)
**/

public class PruebaLista {

  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {

    /**Alta de Arrays*/
    String nombreUser[] = new String[2];
    int telefono[] = new int[2];

    for (int i = 0; i < nombreUser.length; i++) {

      System.out.println("Indique su nombre: ");
      nombreUser[i] = sc.next();
      sc.nextLine();

      System.out.println("Indique su número: ");
      telefono[i] = sc.nextInt();

    }
    for (int i = 0; i < nombreUser.length; i++) {

      System.out.println(nombreUser[i] + " ->\t\t" + telefono[i] + "\n" + "****************");
    }


    System.out.println("Buscar nombre: ");
    String nombreBuscar = sc.next();
    sc.nextLine();
    int indiceNumero = buscarTexto(nombreUser, nombreBuscar);

    if (indiceNumero < nombreUser.length) {

      System.out.println("**** E N C O N T R A D O ****");
      System.out.println(nombreUser[indiceNumero] + "Teléfono: " + telefono[indiceNumero]);

      System.out.println("Deseas cambiar el número de teléfono?");
      System.out.println("1. Sí\n2. No");
      byte respuesta = sc.nextByte();
      if (respuesta == 1) {

        System.out.println("Introduzca el nuevo número: ");
        telefono[indiceNumero] = sc.nextInt();

      } else if (respuesta == 2) {

        System.out.println("Apagando...");

      } else {

        System.err.print("La opción introducida no existe. Pruebe de nuevo: ");
        telefono[indiceNumero] = sc.nextInt();

      }


    } else {

      System.out.println("No se encuentra el número de " + nombreBuscar);

    }
  }
    public static int buscarTexto(String texto[],String buscar){

      int indice = 0;

      while (indice<texto.length && !texto[indice].equals(buscar)){

        indice++;

      }

      return indice;

    }

  }
