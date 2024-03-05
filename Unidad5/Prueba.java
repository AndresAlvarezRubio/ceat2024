import java.util.Arrays;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {

        Scanner sn= new Scanner(System.in);

        //La declaración de un array o tabla debe contener 3 elementos
        //1. El tipo de edad
        //2. El nombre de la variable
        //3. La longitud

        //Declaración array
//        int[] edad = new int[5];
//
//        //Valores del array
//        edad[0]=23;
//        edad[1]=52;
//        edad[2]=18;
//        edad[3]=32;
//        edad[4]=45;
//        System.out.println(Arrays.toString(edad));


        //Ejemplo soloicitar con Scanner las edades
        //solicitar 1º cuantas edades se van a insertar
        Scanner sc = new Scanner(System.in);
        mostrar("Indique el número de edades a insertar");

        int longitud = sc.nextInt();
        byte[] edades = new byte[longitud];

        for (int i=0; i < longitud; i++) {

            mostrar("Indique la Edad Nº " + (i+1));
            edades[i]=sn.nextByte();

        }

        //Mostrar entre corchetes
        System.out.println(Arrays.toString(edades));

        //bucle foreach: bucle para recorrer tablas
        for(int ed:edades) { //se declara una variable llamada elemento y que recorre el array

          System.out.println("Edad insertada-> " + ed);

        }
        //Métodos de la API de Java sobre los arrays
        //Conocer la longitud de un array
        mostrar("Longitud del Array Edad->" + edades.length);

    }
    public static void mostrar(String texto){

        System.out.print("\t" + texto + ": ");

    }
}
