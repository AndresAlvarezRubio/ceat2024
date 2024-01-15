import java.util.Scanner;

public class EnunciadoPrecio {

    public static void main(String[] args) {

    Scanner descuento = new Scanner(System.in);

        //Primer input
        System.out.println("");
        System.out.print("Introduce el precio total del producto a aplicar descuento: ");
        double precioProducto = descuento.nextDouble();

        //Segundo input
        System.out.println("");
        System.out.print("Introduce el porcenta de descuento a aplicar: ");
        double porcentajeDescuento = descuento.nextDouble();

        //Cálculo matemático
        System.out.println("");
        double descuentoTotal = ((precioProducto * porcentajeDescuento) / 100);
        double precioFinal = precioProducto - descuentoTotal;

        //Output
        System.out.println("");
        System.out.println("El descuento que se le aplica es de " + descuentoTotal + "€");
        System.out.println("El precio final con descuento incluído son: " + precioFinal + "€");

    }

}
