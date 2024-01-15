import java.util.Scanner;

public class Actividad1_7 {

    public static void main(String[] args) {
        //Nombres y valores//
        Scanner inputRadio = new Scanner(System.in);
        double π = 3.141592;

        //Input Radio//
        System.out.println("");
        System.out.print("Introduzca el radio de la circunferencia -> ");
        System.out.println("");
        double radioCircunferencia = inputRadio.nextDouble();

        //Output pi con "Variable"//
        System.out.println("");
        System.out.println("Output pi con *Variable*");
        System.out.println("La Longitud de la circunferencia es: " + ((2*π)*radioCircunferencia));
        System.out.println("El Área de la circunferencia es: " + π*Math.pow(radioCircunferencia,2));


        //Output pi con "Math.PI"//
        System.out.println("");
        System.out.println("Output pi con *Math.PI*");
        System.out.println("La Longitud de la circunferencia es: " + ((2*Math.PI)*radioCircunferencia));
        System.out.println("El Área de la circunferencia es: " + Math.PI*Math.pow(radioCircunferencia,2));
    }

}
