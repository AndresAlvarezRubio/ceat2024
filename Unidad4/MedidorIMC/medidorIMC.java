package MedidorIMC;

import java.util.Scanner;


public class medidorIMC {

  //Scanner General
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    userInterface();

  }

  static void userInterface() {

    //Título
    System.out.println("\n\n¿Cual es índice de masa corporal?\n");

    //Input1
    System.out.print("Introduce tu estatura en cm -> ");
    double estatura = sc.nextShort();
    estatura /= 100;

    //Input2
    System.out.print("Introduce tu peso en kg (no decimales) -> ");
    double peso = sc.nextShort();


    System.out.print("Sexo -> \n 1. Hombre \n 2. Mujer \n 3. Goku");
    System.out.print("\nElije: ");
    double sexo = sc.nextDouble();

    if (sexo <= 3 && sexo >= 1) {

      //Función de cálculo
      calculo(estatura, peso, sexo);

    } else {

      System.err.println("El número introducido está fuera de rango. Prueba otra vez.");

    }

  }

  static void calculo(double estatura, double peso,double sexo) {

//    IMC = peso (kg)/ [estatura (m)2]
//    % Grasa corporal = (1.20 x IMC) + (0.23 x Edad) – (10.8 x Genero*) – 5.4.
//    *Siendo Género: Hombre = 1, Mujer = 2.

    double imc = peso / (Math.pow(estatura,2));

    System.out.println("\n\nTu IMC es de: " + (double)Math.round(imc * 100d) / 100d + "%");

    comprobacion(imc, sexo);

  }

  static void comprobacion(double imc, double sexo) {

    switch ((int) sexo) {

      case 1 -> {

        if (imc < 17) {

          System.out.println("Desnutrición");

        } else if (imc >= 17 && imc < 20) {

          System.out.println("Bajo Peso");

        } else if (imc >= 20 && imc < 25) {

          System.out.println("Normal");

        } else if (imc >= 25 && imc < 30) {

          System.out.println("Ligero Sobrepeso");

        } else if (imc >= 30 && imc <= 40) {

          System.out.println("Obesidad Severa");

        } else if (imc > 40) {

          System.out.println("Obesidad Mórbida");

        }
      }
      case 2 -> {

        if (imc < 16) {

          System.out.println("Desnutrición");

        } else if (imc >= 16 && imc < 20) {

          System.out.println("Bajo Peso");

        } else if (imc >= 20 && imc < 24) {

          System.out.println("Normal");

        } else if (imc >= 24 && imc < 29) {

          System.out.println("Ligero Sobrepeso");

        } else if (imc >= 29 && imc <= 37) {

          System.out.println("Obesidad Severa");

        } else if (imc > 37) {

          System.out.println("Obesidad Mórbida");

        }
      }
      case 3 -> {

        System.out.println("Mis respetos, estás genial así como estás. Te amo");

      }
    }
  }
}
