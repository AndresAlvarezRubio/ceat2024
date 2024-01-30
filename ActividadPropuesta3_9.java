import java.util.Scanner;

public class ActividadPropuesta3_9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba un número comprendido entre el 1 y el 10: ");

        byte numInput = sc.nextByte();

        if (numInput <=10 && numInput > 0) {

            for (int i = 1; i <=10 ; i++) {

                System.out.println(i + " x " + numInput + " = " + i * numInput);

            }


        } else {

            System.out.println("El número introducido no concuerda con la instrucción.");

        }

    }

}
