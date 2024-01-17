import java.util.Scanner;

public class Actividad1_11 {

    public static void main(String[] args) {

/**Un frutero necesita calcular los beneficios anuales
* que obtiene de la venta de manzanas y peras. Por este
* motivo, es necesario diseñar una aplicación que solicite
* las ventas (en kilos) de cada semestre para cada fruta.
* La aplicación mostrará el importe total sabiendo que el
* precio del kilo de manzanas está fijado en 2,35 € y el
* kilo de peras en 1,95 €. */


        //Scanner
        Scanner precioVenta = new Scanner(System.in);


        //Constantes
        final double PRECIO_MANZANA = 2.35;
        final double PRECIO_PERAS = 1.95;
        System.out.println("");
        System.out.println("");
        System.out.print("El precio de venta de la manzana en el periodo fue de: " + PRECIO_MANZANA + "€ el kilo. " + "Y el precio de venta de la pera en el periodo fue de: " + PRECIO_PERAS + "€ el kilo.");


        //Espacio
        System.out.println("");
        System.out.println("");


        //Pedir inputs peras
        System.out.print("Introduce el número de kilos de peras vendidas entre Enero y Junio: ");
        double kilosPerasSemestre = precioVenta.nextDouble();
        System.out.print("Introduce el número de kilos de peras vendidas entre Julio y Diciembre: ");
        kilosPerasSemestre += precioVenta.nextDouble();
        kilosPerasSemestre *= PRECIO_PERAS;
        System.out.println("Vendiste un total de " + kilosPerasSemestre + "€ en peras este año");
        System.out.println("");


        //Pedir inputs manzanas
        System.out.println("");
        System.out.print("Introduce el número de kilos de manzana vendidas entre Enero y Junio: ");
        double kilosManzanaSemestre = precioVenta.nextDouble();
        System.out.print("Introduce el número de kilos de manzana vendidas entre Julio y Diciembre: ");
        kilosManzanaSemestre += precioVenta.nextDouble();
        kilosManzanaSemestre *= PRECIO_MANZANA;
        System.out.println("Vendiste un total de " + kilosManzanaSemestre + "€ en peras este año");


        //Cálculo matemático
        System.out.println("");
        kilosManzanaSemestre += kilosPerasSemestre;
        System.out.println("El beneficio total es de "+ kilosManzanaSemestre +"€");

    }

}
