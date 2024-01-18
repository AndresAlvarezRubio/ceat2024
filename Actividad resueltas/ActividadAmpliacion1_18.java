import java.util.Scanner;

public class ActividadAmpliacion1_18 {

    public static void main(String[] args) {

        Scanner insectos = new Scanner(System.in);

        //Input1
        System.out.println("");
        System.out.print("Introduce el número de hormigas capturadas -> ");
        int patasHormigas = ((insectos.nextInt())*6);

        //Input2
        System.out.print("Introduce el número de arañas capturadas -> ");
        int patasArañas = patasHormigas+((insectos.nextInt())*8);

        //Input3
        System.out.print("Introduce el número de arañas capturadas -> ");
        int patasCochinillas = patasArañas+((insectos.nextInt())*14);

        //Output
        System.out.println("");
        System.out.println("Los insectos tienen un total de: " + patasCochinillas + " patas.");

    }

}
