package Tema5;

import java.util.Arrays;
import java.util.Scanner;

public class allalasdlfas {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int combiGanadora[]=new int[6];
        int numero;
        for (int i=0;i<combiGanadora.length;i++){
            numero=(int) (Math.random()*46+1);
            int indice=0;
            while (indice<combiGanadora.length && combiGanadora[indice]!=numero){
                indice++;
            }
            if (indice>= combiGanadora.length){
                combiGanadora[i]=numero;
            }else {
                i--;
            }

        }
        mostrar("- Indica tu apuesta - ");
        int apuesta[]=new int[6];
        for (int i=0;i<6;i++){
            mostrar("Número "+ (i+1)+"->");
            apuesta[i]=sc.nextInt();
        }
        mostrar("Tu apuesta es -> " + Arrays.toString(apuesta));
        mostrar("Número de aciertos en tu apuesta " + primitiva(apuesta,combiGanadora));
        mostrar("La combinación ganadora es -> "+ Arrays.toString(combiGanadora));

    }

    public static int primitiva(int apuesta[], int ganadora[]) {
        int aciertos=0;
        Arrays.sort(apuesta);
        Arrays.sort(ganadora);
        for (int elemento:apuesta){
            if (Arrays.binarySearch(ganadora,elemento)>0){
                aciertos++;
            }
        }
        return aciertos;
    }
    public static void mostrar (String texto){
        System.out.println("\t" + texto);
    }
    public static void mostrarLn (String texto){
        System.out.print("\n\t" + texto);
    }
}
