package Actividades_tema_2;

import java.util.Scanner;

public class ActividadCalculadora {

    public static void main(String[] args) {

        Scanner calculator = new Scanner(System.in);

        System.out.println("****************************************");
        System.out.println("**********   Calculadora   *************");
        System.out.println("****************************************");
        System.out.println("**          1. Sumar                  **");
        System.out.println("**          2. Restar                 **");
        System.out.println("**          3. Multiplicar            **");
        System.out.println("**          4. Dividir                **");
        System.out.println("**          5. Elevar                 **");
        System.out.println("**          6. Raíz cuadrada          **");
        System.out.println("**          7. Salir                  **");
        System.out.println("**          8. Animar a Fran          **");
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("");
        System.out.print("Elija opción -> ");
        int numElecc = calculator.nextInt();
        switch (numElecc) {
            case 1:
                System.out.print("Introduzca el primer número -> ");
                double numInput = calculator.nextInt();
                System.out.print("Introduzca el segundo número -> ");
                double num2 = calculator.nextInt();
                num2 += numInput;
                System.out.println(num2);
                break;
            case 2:
                System.out.print("Introduzca el número a restar -> ");
                numInput = calculator.nextInt();
                System.out.print("Introduzca el número que resta -> ");
                num2 = calculator.nextInt();
                numInput -= num2;
                System.out.println(numInput);
                break;
            case 3:
                System.out.print("Introduzca el número a multiplicar -> ");
                numInput = calculator.nextInt();
                System.out.print("Introduzca el número a multiplicar -> ");
                num2 = calculator.nextInt();
                num2 *= numInput;
                System.out.println(num2);
                break;
            case 4:
                System.out.print("Introduzca el número a dividir -> ");
                numInput = calculator.nextInt();
                System.out.print("Introduzca el número divisor -> ");
                num2 = calculator.nextInt();
                numInput /= num2;
                System.out.println(numInput);
                break;
            case 5:
                System.out.print("Introduzca el número que será elevado -> ");
                numInput = calculator.nextInt();
                System.out.print("Introduzca el número que elevará -> ");
                num2 = calculator.nextInt();
                numInput=Math.pow(numInput, num2);
                System.out.println(numInput);
                break;
            case 6:
                System.out.print("Introduzca el número -> ");
                numInput = Math.sqrt(calculator.nextInt());
                System.out.println(numInput);
                break;
            case 7:
                System.out.println("╔═══╗ ♪" );
                System.out.println("║███║ ♫");
                System.out.println("║(●)║ ♫");
                System.out.println("╚═══╝ ♪♪");
                System.out.println("¡Adios!");
                break;
            case 8:
                System.out.println("No sufras, Fran");
                break;
            default:
                System.out.println("Tu número no concuerda, Ulises");
                break;

        }

    }


}
