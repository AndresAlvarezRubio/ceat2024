import java.util.Scanner;

public class ActividadAmpliacion1_19 {

    public static void main(String[] args) {
        //Scanner
        Scanner entradas = new Scanner(System.in);

        //Inputs1
        System.out.println("");
        System.out.print("¿Cuántas entradas de adulto desea? -> ");
        float entradasA = (entradas.nextShort())*20;

        //Inputs2
        System.out.print("¿Cuántas entradas de niño desea? -> ");
        entradasA += entradas.nextShort()*15.50;


        System.out.println("");
        System.out.println("Precio final= " + entradasA + "€");

        if (entradasA >= 100) {

            System.out.println("");
            float descuentoA= entradasA * 5 / 100;
            System.out.println("Tienes un descuento de -> " + descuentoA + "€.");
            entradasA = entradasA - descuentoA;
            System.out.println("El precio final es: " + entradasA + "€. ¡Enhorabuena!");

        }
    }

}
