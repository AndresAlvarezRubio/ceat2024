package Actividades_tema_2;

import java.util.Scanner;

public class ActividadesAplicacion2_13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba el total de la comida diaria que se comprará -> ");
        double comDiar = sc.nextDouble();
        System.out.print("Escriba el total de animales habitantes -> ");
        int numAnim = sc.nextInt();
        System.out.print("Escriba la comida diaria que cada animal come -> ");
        double kilosPA = sc.nextDouble();

        double kilosTotalA = kilosPA * numAnim;
        if (kilosTotalA <= comDiar) {System.out.println("¡Existe comida suficiente para todos!");}
        else {comDiar /= numAnim;System.out.println("No hay comida suficiente. Cada animal puede comer como máximo: " + comDiar + "K");
}

    }

}
