import java.util.Scanner;

public class Actividad1_10 {

    public static void main(String[] args) {

        //Scanner
        Scanner datosUser = new Scanner(System.in);


        //Espacio
        System.out.println("");
        System.out.println("");


        //Input lluvia
        System.out.print("¿Está lloviendo?(true/false) -> ");
        boolean respuestaUserLluvia= datosUser.nextBoolean();
        System.out.println("Su respuesta es: " + respuestaUserLluvia);


        //Espacio
        System.out.println("");
        System.out.println("");


        //Input tarea
        System.out.print("¿Hiciste la tarea?(true/false) -> ");
        boolean respuestaUserTarea= datosUser.nextBoolean();
        System.out.println("Su respuesta es: " + respuestaUserTarea);

        //Espacio
        System.out.println("");
        System.out.println("");


        //Input librería
        System.out.print("¿Tienes que ir a la biblioteca?(true/false) -> ");
        boolean respuestaUserBiblio= datosUser.nextBoolean();
        System.out.println("Su respuesta es: " + respuestaUserBiblio);


        //Lógica cálculo
        boolean respuestaFinal = (respuestaUserBiblio || (respuestaUserTarea && !respuestaUserLluvia));
        System.out.println("");


        //Output
        if (respuestaFinal == false) {

            System.out.println("Hoy no sales");

        } else if (respuestaFinal == true) {

            System.out.println("Venga, hoy eres libre");

        }
//        else if respuestaFinal {
//
//            System.out.println("Buena suerte en la biblioteca");
//        }
    if ((respuestaUserBiblio)||(!respuestaUserTarea && respuestaUserLluvia)) {

            System.out.println("Buena suerte en la biblioteca");
        }

    }

}
