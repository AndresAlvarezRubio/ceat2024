package Actividades_tema_2;

import java.util.Scanner;

public class ActividadAplicacion2_17 {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int numAle, numAle2;
        System.out.println(numAle = (int)(Math.random() * 99));
        System.out.println((numAle2 = (int)(Math.random() * 99)) + " +");
        System.out.println("____________________________");
        int respuestaUser = sc.nextInt();
        if (respuestaUser == (numAle + numAle2)) {
            System.out.println("Su respuesta es correcta");
        } else {
            System.out.println("Respuesta incorrecta");
        }
    }
}
