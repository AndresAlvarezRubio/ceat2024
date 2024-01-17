import javax.swing.text.Style;
import java.util.Scanner;

////////////////////////////////////////////////// Enunciado //////////////////////////

//Solicita al usuario que ingrese 2 números enteros. Luego, muestra la suma de estos dos números con un mensaje y su resultado.


///////////////////////////////////////////////////////////////
public class EnunciadoSuma {

    public static void main(String[] args) {

        Scanner sumaMatematica = new Scanner(System.in);

        //Input 1
        System.out.println("Por favor, introduzca el primer número para la suma: ");
        int primerNumero = sumaMatematica.nextInt();
        System.out.println("");

        //Input 2
        System.out.println("Por favor, introduzca el segundo número para la suma: ");
        int segundoNumero = sumaMatematica.nextInt();

        //Suma Matemática
        int sumaTotal = (primerNumero + segundoNumero);

        //Resultado Final
        System.out.println("El total de la suma entre "+ primerNumero +" y "+ segundoNumero +" es: " + sumaTotal);

    }

}
