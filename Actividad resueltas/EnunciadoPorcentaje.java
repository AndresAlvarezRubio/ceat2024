import java.util.Scanner;

public class EnunciadoPorcentaje {

    public static void main(String[] args) {

        //Scanner
        Scanner inputNinios = new Scanner(System.in);

        //Input Niños
        System.out.print("Introduce el número de niños que hay en el colegio: " );
        int numNinios = inputNinios.nextInt();


        //Input Niñas
        System.out.print("Introduce el número de niñas que hay en el colegio: " );
        int numNinias = inputNinios.nextInt();

        //Cálculo Total
        int numTotal = numNinios + numNinias;
        System.out.println("El número total de niños que hay en el colegio es de " + numTotal);

        //Cálculo porcentual
        System.out.println("El porcentaje de niños es de un: " + numNinios*100/numTotal+"%");
        System.out.println("El porcentaje de niñas es de un: " + numNinias*100/numTotal+"%");


    }

}
