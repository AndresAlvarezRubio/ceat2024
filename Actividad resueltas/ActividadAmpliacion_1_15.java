import java.util.Scanner;

public class ActividadAmpliacion_1_15 {

    public static void main(String[] args) {

        //Scanner
        Scanner datosPolinomio = new Scanner(System.in);

        //Input1
        System.out.println("");
        System.out.print("Introduce el dato a -> ");
        double a = datosPolinomio.nextDouble();

        //Input2
        System.out.println("");
        System.out.print("Introduce el dato b -> ");
        double b = datosPolinomio.nextDouble();

        //Input3
        System.out.println("");
        System.out.print("Introduce el dato c -> ");
        double c = datosPolinomio.nextDouble();

        //Input4
        System.out.println("");
        System.out.print("Introduce el dato x -> ");
        double x = datosPolinomio.nextDouble();

        //Cálculo
        double  resultado= a*(Math.pow(x,2))+b*x+c;

        System.out.println("");
        System.out.println("Su resultado es -> " + resultado);
    }

}
