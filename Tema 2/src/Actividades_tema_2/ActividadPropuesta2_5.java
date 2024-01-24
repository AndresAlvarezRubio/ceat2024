package Actividades_tema_2;import java.util.Scanner;public class ActividadPropuesta2_5 {
    public static void main(String[] args) {
/**
 * Escribir un programa que calcule el dinero recaudado en un concierto.
 * La aplicación solicitará el aforo máximo del local, el precio por
 * entrada (suponemos que todas las entradas tienen el mismo precio) y
 * el número de entradas vendidas. Hay que tener en cuenta que si el
 * número de entradas vendidas no supera el 20 % del aforo del local,
 * se cancela el concierto. Si el número de entradas vendidas no supera
 * el 50 % del aforo del local, se realiza una rebaja del 25 % del
 * precio de la entrada*/

        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.print("Introduzca el aforo máximo del local -> ");
        int aforoMax = sc.nextInt();

        System.out.print("Introduzca el precio por entrada -> ");
        double precEnt = sc.nextInt();

        System.out.print("Introduzca el número de entradas vendidas -> ");
        int numEntV = sc.nextInt();
        System.out.println("");

        if (numEntV <= (aforoMax * .2)) {
            System.out.println("Lo sentimos, el concierto se cancela.");
        }
        else if (numEntV > (aforoMax * .2) && numEntV <= (aforoMax * .5)) {
            System.out.println("¡Las entradas bajaron en un 25%!");
            System.out.println("Ahora cada entrada vale -> " + (precEnt * .75)+ "€");
            System.out.println("El total recaudado es de = " + (precEnt*.75) * numEntV + "€");
        }
        else if ((numEntV <= aforoMax) && (numEntV > (aforoMax * .5))){
            System.out.println("El total recaudad es de = " + precEnt*numEntV + "€");
        } else if (numEntV > aforoMax || numEntV < 0){
            System.out.println("Pisha que me he hesho la pisha un lio");
        }
    }
}

