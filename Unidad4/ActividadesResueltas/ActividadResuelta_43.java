package ActividadesResueltas;

import java.util.Scanner;

public class ActividadResuelta_43 {

/**Realizar una función que calcule y muestre el área o el volumen de un cilindro,
* según se especifique. Para distinguier un caso de otro se le pasará como opción
* un número: 1 (para el área) o 2 (para el volumen). Además, hay que pasarle a la
* función el radio de la base y la altura.
*
* área = 2(pi) * radio * (altura + radio)
* volumen = (pi) * radio(al cuadrado)* altura
* */
    public static void main(String[] args) {
        eleccion();
    }
    public static void eleccion() {

      //Scanner
        Scanner sc = new Scanner(System.in);

      //Inputs
        System.out.print("Introduzca el radio del cilindro: ");
        double radio = sc.nextDouble();
        System.out.print("Introduzca la altura del cilindro: ");
        double altura = sc.nextDouble();
        System.out.print("\nEliga el cálculo mediante el número: \n1. Área\n2. Volumen \n\nEscriba su respuesta (1 o 2): ");
        byte eleccionCalc = sc.nextByte();

      //Comprobación
        if (eleccionCalc == 1) {
            area(radio, altura);
        } else if (eleccionCalc == 2) {
            volumen(radio, altura);
        } else {
            System.out.print("El número elegido no está en el rango.");
        }

    }

    public static void area(double radio, double altura) {

      double resFinal = 2 * Math.PI * radio * (altura + radio);
      System.out.println("El área total es: " + resFinal);

    }
    public static void volumen(double radio, double altura){

      double resFinal = Math.PI * Math.pow(radio,2) * altura;
      System.out.println("El área total es: " + resFinal);

    }

}
