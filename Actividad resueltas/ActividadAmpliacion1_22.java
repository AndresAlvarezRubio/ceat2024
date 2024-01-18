import java.util.Scanner;

public class ActividadAmpliacion1_22 {

    public static void main(String[] args) {

        //Scanner
        Scanner longitud = new Scanner(System.in);

        //Input
        System.out.println("");
        System.out.print("Introduce la distancia recorrida en metros -> ");
        double distanciaLanzamiento = longitud.nextDouble();

        //Cálculo
        int distanciaFinal =(int) (distanciaLanzamiento * 100);
        System.out.println("La distancia final en cm es de: " + distanciaFinal + " cm.");


    }

}
