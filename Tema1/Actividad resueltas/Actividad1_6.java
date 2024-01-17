import java.util.Scanner;

public class Actividad1_6 {

    public static void main(String[] args) {

        Scanner calculoMedia = new Scanner(System.in);

        //Primer input//
        System.out.println("");
        System.out.print("Primera nota de Manolo: ");
        byte primeraNota = calculoMedia.nextByte();

        //Segundo input//
        System.out.println("");
        System.out.print("Segunda nota de Manolo: ");
        byte segundaNota = calculoMedia.nextByte();

        //Cálculo//
        double notaMediaManolo = (primeraNota + segundaNota)/2.0;

        //Output//
        System.out.println("");
        System.out.println("La nota de Manolo es: " + notaMediaManolo);

    }

}
