package Actividades_tema_2;

import java.util.Scanner;

public class ActividadAplicacion2_18 {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int numAle1, numAle2, respuestaUser=0, correctCalc=0;
        numAle1 = (int)(Math.random() * 10+1);
        numAle2 = (int)(Math.random() * 10+1);

        int calcAle = (int) (Math.random() * 3) +1 ;
        System.out.println(numAle2);
        System.out.print(numAle1);
     //   System.out.println(calcAle);

        if (calcAle==1) {
            System.out.println(" +");
            correctCalc = numAle2 + numAle1;
        }
        else if (calcAle==2){
            System.out.println(" -");
            correctCalc = numAle2 - numAle1;
        }
        else if (calcAle==3) {
            System.out.println(" x");
            correctCalc = numAle2 * numAle1;
        }
        System.out.println("________________________");
        respuestaUser = sc.nextInt();

        if (correctCalc==respuestaUser) {
            System.out.println("Resultado Correcto");
        } else System.out.println("Respuesta Incorrecta");
    }
}
