package ActividadesResueltas;

import java.util.Scanner;

/**
* Diseñar la función calculadora(), a la que se le pasan dos
* números reales (operandos) y qué operación se desea realizar
* con ellos. Las operaciones disponibles son: sumar, restar,
* multiplicar, dividir y salir. Estas se especifican mediante un
* número respectivamente (1-5). La función devolverá el resultado
* de la operación mediante un número real
* */
public class ActividadResuelta_48 {

  public static void main(String[] args) {

    System.out.println("\n**************************");
    System.out.println("***                    ***");
    System.out.println("***    Calculadora     ***");
    System.out.println("***                    ***");
    System.out.println("**************************");
    System.out.println("***                    ***");
    System.out.println("***   1. Suma          ***");
    System.out.println("***   2. Resta         ***");
    System.out.println("***   3. Multiplicar   ***");
    System.out.println("***   4. Dividir       ***");
    System.out.println("***   5. Salir         ***");
    System.out.println("***                    ***");
    System.out.println("**************************");

    Scanner sc = new Scanner(System.in);

    System.out.print("\nElije una opción: ");
    byte option = sc.nextByte();

    if (option <= 4 && option >=1) {

      do {

        double resFinal = 0;
        if (option <= 0 || option >= 6) {
          System.out.println("Opción no válida");
          break;
        }
        System.out.print("Introduzca un número: ");
        double num1 = sc.nextInt();

        System.out.print("Introduzca otro número: ");
        double num2 = sc.nextInt();

        switch (option) {
          case 1 -> {
            resFinal = num1 += num2;
            System.out.println(resFinal);

            System.out.print("Elije una opción: ");
            option = sc.nextByte();
          }
          case 2 -> {
            resFinal = num1 -= num2;
            System.out.println(resFinal);

            System.out.print("Elije una opción: ");
            option = sc.nextByte();
          }
          case 3 -> {
            resFinal = num1 *= num2;
            System.out.println(resFinal);

            System.out.print("Elije una opción: ");
            option = sc.nextByte();
          }
          case 4 -> {
            resFinal = num1 /= num2;
            System.out.println(resFinal);

            System.out.print("Elije una opción: ");
            option = sc.nextByte();
          }
          case 5 -> {System.out.println("Cerrando...");}
          default -> {System.err.println("Opción no valida");}
        }
      }
      while (option != 5);
      System.out.println("Cerrando...");
    }
    else if (option == 5){
      System.out.println("Cerrando...");
    }
    else {
      System.out.println("No valido");
    }
  }
}
