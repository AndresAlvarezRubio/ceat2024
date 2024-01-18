import java.util.Scanner;

public class ActividadAmpliacion1_20 {

    public static void main(String[] args) {

        //Scanner
        Scanner numRaiz = new Scanner(System.in);

        //Input
        System.out.println("");
        System.out.println("Introduce un número aleatorio para hacer su raíz cuadrada -> ");
        double calculo = numRaiz.nextDouble();

        //Cálculo
        calculo = Math.sqrt(calculo); //Math.sqrt("""Número al que se le hará su raíz cuadrada""")

        //Output
        System.out.println("");
        System.out.println("El resultado es: " + calculo);

    }

}
