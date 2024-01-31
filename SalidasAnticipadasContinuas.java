import java.util.Scanner;

public class SalidasAnticipadasContinuas {
/**
 * Hacer una lista de la clase, y saltar a los
 * que se llamen "Manuel".
 * */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String nombresEscritosInp = "", todosNombres= "";

        for (byte i=1; i<=14; i++) {
            System.out.print("Introduce tu nombre: ");
            nombresEscritosInp=sc.nextLine();
            if (nombresEscritosInp.equals("Manuel") || nombresEscritosInp.equals("manuel") ) {
                continue;
            }
            todosNombres+=nombresEscritosInp+"\n";
        }
    System.out.println("***Alumnos***\n" + todosNombres);
    }
}
