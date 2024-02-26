import java.util.Scanner;

public class Controller {

  public static void main(String[] args) {
    //Variables / tipos de datos -> Las declaraciones de las variables tienen que ser llamadas con su tipo de dato:
    int total = 0, cantidad; /**Se puede iniciar en el momento de la declaración o no*/
    String nombreUsuario, poblacion;



/**
* Solicita el Nombre, la población y el número de habitantes.
* Acumula hasta que sean 5 capitales de provincias de CLM
*
* Sumar el total de habitantes de las 5 capitales
* */


    //Scanner
    System.out.println();
    Scanner sc = new Scanner(System.in);

    //Bucles
    for (int i=1;i<=3;i++){

      System.out.print("Indica tu nombre ->");
      nombreUsuario=sc.nextLine();

      System.out.print("Indica tu Ciudad ->");
//    poblacion=sc.nextInt();sc.nextLine();

      System.out.print("Indica los habitantes ->");
      cantidad=sc.nextInt();
      // Condicional -> Si el número de habitantes es menor que 20.000.
      // Indicar que hay un error y restar 1 a i para que vuelva a solicitar la info.
      if (cantidad < 20000) {

        i--;
        System.out.println("La población de las capitales es superior.");

      } else {

      total+=cantidad;

      }

    }

    System.out.println("Número de habitnantes total es: " + total);

  }

}
