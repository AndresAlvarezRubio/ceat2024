import java.util.Scanner;

public class ActividadAmpliación1_14 {

    public static void main(String[] args) {

        //Scanner
        Scanner datosTriangulo = new Scanner(System.in);

        //Input1
        System.out.println("");
        System.out.print("Introduzca la base del triángulo: ");
        double baseYFinal = datosTriangulo.nextDouble();

        //Input2
        System.out.println("");
        System.out.print("Introduzca la altura del triángulo: ");
        double altura = datosTriangulo.nextDouble();

        //Cálculo y Outpu
        baseYFinal = (baseYFinal * altura)/2;
        System.out.println("El área del triángulo es: " + baseYFinal);

    }

}
