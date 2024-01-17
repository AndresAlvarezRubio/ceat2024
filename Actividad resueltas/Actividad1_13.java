import java.util.Scanner;

public class Actividad1_13 {

    public static void main(String[] args) {


/** Escribir un programa que solicite las notas del primer,
 *  segundo y tercer trimestre (notas enteras que se solicitarán
 *  al usuario). El programa debe mostrar la nota media del curso
 *  como se utiliza en el boletín de calificaciones (solo la parte
 *  entera) y como se usa en el expediente académico (con decimales).
*/
        //Scanner
        Scanner notasUser = new Scanner(System.in);

        //Input1
        System.out.println("(Las notas deben ser introducidas sin decimales)");
        System.out.print("Nota primer trimestre: ");
        short notasTrimestres = notasUser.nextByte();

        //Input2
        System.out.println("");
        System.out.print("Nota segundo trimestre: ");
        notasTrimestres += notasUser.nextByte();

        //Input3
        System.out.println("");
        System.out.print("Nota Tercer trimestre: ");
        notasTrimestres += notasUser.nextByte();

        //Cálculo
        System.out.println("");
        double notaFinal = (double) notasTrimestres/3;

        //Output1 (número con decimales)
        System.out.println("Su nota de expediente académico es: " + notaFinal);

        //Conversión a entero
        notaFinal = (short) notaFinal;

        //Output2 (número entero)
        System.out.println("Su nota de boletín de calificaciones es: " + notaFinal);


    }

}
