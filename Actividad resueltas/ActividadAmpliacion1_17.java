import java.util.Scanner;

public class ActividadAmpliacion1_17 {

    public static void main(String[] args) {

        //Scanner
        Scanner medidas = new Scanner(System.in);

        //Inputs1
        System.out.println("");
        System.out.print("Introduce la primera medida en milímetros: ");
        float mm = medidas.nextInt();

        //Inputs2
        System.out.println("");
        System.out.print("Introduce la segunda medida en centímetros: ");
        float cm = medidas.nextInt();

        //Inputs3
        System.out.println("");
        System.out.print("Introduce la tercera medida en metros: ");
        int m = medidas.nextInt();

        //Cálculo
        cm = (float) ((mm/100) + cm + (m*100));
        System.out.println("Total: " + cm + "cm");
    }

}
