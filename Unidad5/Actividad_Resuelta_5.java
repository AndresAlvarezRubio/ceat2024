import java.util.Arrays;
import java.util.Scanner;

public class Actividad_Resuelta_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        mostrar("Indica la longitud de la tabla");
        int longitud= sc.nextInt();
        int pares[]=new int[longitud];
        mostrar("Indica el numero fin de los números aleatorios ->");
        int fin= sc.nextInt();
        for (int i=0;i<pares.length;i++){
            int num=(int) (Math.random()*fin+1);
            if (num%2==0){
                pares[i]=num;
            }else {
                --i;
            }
        }
        Arrays.sort(pares);
        mostrar("Tabla ordenada " + Arrays.toString(pares));
    }

    public static void mostrar(String texto) {
        System.out.println("\t"+texto);
    }
    public static void mostrarSinLn(String texto) {
        System.out.print("\t"+texto);
    }
}
