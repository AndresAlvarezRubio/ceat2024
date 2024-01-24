package Actividades_tema_2;

import java.util.Scanner;

public class ActividadResuelta2_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("************************************");
        System.out.print("** Introduzca la nota del usuario **");
        System.out.println("************************************");
        System.out.println("");
        System.out.print("-> ");
        float notaUsuario = sc.nextInt();


        if (notaUsuario >= 0 && notaUsuario<5) {
            System.out.println("Estás suspenso");
        }else if (notaUsuario >= 5 && notaUsuario<6) {
            System.out.println("Pasaste con suficiente");
        }else if (notaUsuario >= 6 && notaUsuario<7) {
            System.out.println("Bien");
        }else if (notaUsuario >= 7 && notaUsuario<9) {
            System.out.println("Notable");
        }else if (notaUsuario >= 9 && notaUsuario<10) {
            System.out.println("Sobresaliente");
        }else {
            System.out.println("El input recibido no existe");
        }
    }

}
