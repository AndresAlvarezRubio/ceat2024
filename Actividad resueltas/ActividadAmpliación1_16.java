import java.util.Scanner;

public class ActividadAmpliación1_16 {

    public static void main(String[] args) {

        //Scanner
        Scanner segundosUser = new Scanner(System.in);

        //Input segundos
        System.out.println("Introduce una cantidad de segundos: ");
        int segundos = segundosUser.nextInt();

        //Variable horas
        int horas = (segundos/3600);
        segundos = segundos%(horas*3600);

        //Variable minutos
        int minutos = (segundos/60);
        segundos = segundos%(minutos*60);

        //Output
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
        System.out.println("La cantidad de tiempo introducida es -> " + horas + ":" + minutos + ":" + segundos);

    }



}
