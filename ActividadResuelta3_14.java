import java.util.Scanner;

public class ActividadResuelta3_14 {

    public static void main(String[] args) {
        System.out.println("*********** Tabla de multiplicar ***********");
        for (byte i=1;i<=10;i++) {
 Scanner sc = new Scanner(System.in);


            for (byte y=1;y<=10;y++) {
                System.out.println(i + "x" + y + "=" + y*i);
            }
        }
    }
}