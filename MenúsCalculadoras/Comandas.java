import java.util.Scanner;

public class Comandas {


/**
* Crear un programa que permita a través de un menú.
* Indicar lo que el cliente solicita, y mostrar el total de su pedido.
*
* Tomando en cuenta, los precios:
* Tortilla: 2€
* Croquetas: 8€
* Jamón y Queso: 15€
* Todas las bebidas: 3€
*
*
* */

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int cuenta=0;
      byte opciones = 0, cantidadPedido= 0;
      String detallesPedido="";

        System.out.println("*************************************");
        System.out.println("***                               ***");
        System.out.println("***              Menú             ***");
        System.out.println("***                               ***");
        System.out.println("***    1. Tortilla..........2€    ***");
        System.out.println("***    2. Croquetas.........8€    ***");
        System.out.println("***    3. Jamón y Queso.....15€   ***");
        System.out.println("***    4. Bebidas...........3€    ***");
        System.out.println("***    5. Cuenta                  ***");
        System.out.println("***                               ***");
        System.out.println("*************************************");

      do {
        System.out.print("\nIndique su opción: ");
        opciones= sc.nextByte();
        switch (opciones) {
          case 1 ->{
            System.out.println("Indique la cantidad que quieres: ");
            cantidadPedido= sc.nextByte();
            detallesPedido += cantidadPedido + " Tortilla\n";
            cuenta+=(2 * cantidadPedido);
          }
          case 2 ->{
            System.out.println("Indique la cantidad que quieres: ");
            cantidadPedido= sc.nextByte();
            detallesPedido += cantidadPedido + " Croquetas\n";
            cuenta+=(8 * cantidadPedido);
          }
          case 3 ->{
            System.out.println("Indique la cantidad que quieres: ");
            cantidadPedido= sc.nextByte();
            detallesPedido += cantidadPedido + " Jamón y Queso\n";
            cuenta+=(15 * cantidadPedido);
          }
          case 4 ->{
            System.out.println("Indique la cantidad que quieres: ");
            cantidadPedido= sc.nextByte();
            detallesPedido += cantidadPedido + " Bebidas\n";
            cuenta+=(3 * cantidadPedido);
          }
          case 5 ->{
            System.out.println("");
          }
          default -> {
            System.err.println("Opción invalida");
          }
        }
      } while (opciones!=5);

      System.out.println("El total del pedido es de: " + cuenta + "€.");
      System.out.println("La lista de lo pedido es: \n" + detallesPedido);
      System.out.print("\nEl precio del IVA es de: ");
      double ivaTot = cuenta * 0.21;
      System.out.printf("%15.2f",ivaTot);

    }
}
