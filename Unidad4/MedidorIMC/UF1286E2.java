package MedidorIMC;

import java.util.Scanner;

public class UF1286E2 {

  /**
   * -----Instrucciones-----
   * Una empresa que se dedica a la venta de Aceite de Oliva
   * necesita una aplicación en java para gestionar las facturas.
   * En cada factura figura: el código del artículo, la cantidad
   * vendida en litros y el precio por litro.
   *
   *
   * Realizar un menú, con la siguiente estructura:
   *
   * 1.Facturar
   * 2.Salir
   *
   *
   * En facturar, solicitar el código que pueden ser
   * (01 de 1 litro, 02 de 3 litros y 03 de 5 litros)
   *
   * Según el formato, los precios son:
   *
   * 1 litro -> 9,99€
   *
   * 3 litros -> 29,99€
   *
   * 5 litros-> 49,95€
   */

  public static void main(String[] args) {

    //Alta Scanner
    Scanner sc = new Scanner(System.in);

    //UI
    System.out.println("\n¿Qué desea hacer?\n");

    System.out.println("███████████████████████");
    System.out.println("██                   ██");
    System.out.println("██    1. Facturar    ██");
    System.out.println("██    2. Salir       ██");
    System.out.println("██                   ██");
    System.out.println("███████████████████████");

    //Input User
    System.out.print("\n¿Qué desea hacer? -> ");
    byte selectMenu = sc.nextByte();

    //Elección menú principal
    mainMenu(selectMenu);

  }


  public static void mainMenu(byte selectMenu) {

    Scanner sc = new Scanner(System.in);

    do {

      if (selectMenu == 1) {

        switchUserMain();

        System.out.println("\n███████████████████████");
        System.out.println("██                   ██");
        System.out.println("██    1. Facturar    ██");
        System.out.println("██    2. Salir       ██");
        System.out.println("██                   ██");
        System.out.println("███████████████████████");
        System.out.print("\n¿Qué desea hacer? -> ");
        selectMenu = sc.nextByte();

      } else if (selectMenu!=1 && selectMenu != 2) {

        System.err.println("El número introducido no está dentro del rango. Pruebe otra vez");
        System.out.print("\nEscriba su respuesta: ");
        selectMenu = sc.nextByte();

      }

    } while(selectMenu != 2);

    System.out.print("\nApagando...\n");

  }


  public static void switchUserMain() {

    //Variables
    double botella = 9.99, garPeq = 29.99, garGra = 49.95;
    byte selProd;
    int numBotella=0, numGarPeq=0, numGarGra=0;

    //Alta Scanner
    Scanner sc = new Scanner(System.in);

    do {
      //UI
      uiProducts();

      System.out.print("\nElija el artículo: ");
      selProd = sc.nextByte();

      if (selProd <= 4 && selProd >=1) {

        switch (selProd) {

          case 1 -> {

            System.out.print("Introduce cuantas botellas quieres: ");
            numBotella = sc.nextInt();

          }
          case 2 -> {

            System.out.print("Introduce cuantas garrafas pequeñas quieres: ");
            numGarPeq = sc.nextInt();

          }
          case 3 -> {

            System.out.print("Introduce cuantas garrafas grandes quieres: ");
            numGarGra = sc.nextInt();

          }

        }

      } else {

        System.err.println("El número introducido no está dentro del rango. Pruebe otra vez");
        System.out.print("\nEscriba su respuesta: ");
        selProd = sc.nextByte();

      }

    } while (selProd != 4);
    System.out.println("\nImprimiendo Ticket: ");
    System.out.println(numBotella + " botella/s de aceite: "+ botella*numBotella + "€");
    System.out.println(numGarPeq + " garrafa/s de aceite: " + garPeq*numGarPeq   + "€");
    System.out.println(numGarGra + " botella/s de aceite: " + garGra*numGarGra   + "€");
    System.out.println("Total: " + ((botella*numBotella) + (garPeq*numGarPeq) + (garGra*numGarGra)) + "€");

  }
  public static void uiProducts() {

    System.out.println("\n███████████████████████████████████████████████████");
    System.out.println("██                                               ██");
    System.out.println("██    01.  (9.99€) Botella 1L de AOVE            ██");
    System.out.println("██    02. (29.99€) Garrafa Pequeña 3L AOVE       ██");
    System.out.println("██    03. (49.95€) Garrafa Grande 5L AOVE        ██");
    System.out.println("██    04. Imprimir ticket                        ██");
    System.out.println("██                                               ██");
    System.out.println("███████████████████████████████████████████████████");
  }
}

