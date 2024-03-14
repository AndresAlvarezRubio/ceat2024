//Comprueba que produce la comparacion con el operador == de dos tablas
//de mismo tipo, la misma longitud y los mismos valores
import java.util.*;
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
public class Florin__ComparacionDeLaTablas_AP_5_8 {
    public static void main(String[] args) {
        System.out.println("\n✫✫✫✫✫ Comparacion de dos tablas ✫✫✫✫✫");
        int t1[] = {7, 9, 20};
        System.out.println("\nPrimera tabla t1 ➣ 7,9,20");
        int t2[] = {7, 9, 20};//t1 y t2 tienen los mismos elementos
        System.out.println("Segunda tabla t2 ➣ 7,9,20");
        System.out.println("\nUsando el operador ==:");
        System.out.println(t1 == t2);//sin embargo muestra false
        System.out.println("\nUsando Arrays.equals():");
        System.out.println(Arrays.equals(t1, t2));//muestra true

    }
/* ➣➣➣ La razón por la que la comparación utilizando el operador == devuelve false mientras que Arrays.equals() devuelve true
 se debe a la forma en que Java maneja los arreglos.

➣➣➣Cuando usas el operador == para comparar dos arreglos en Java, estás comparando las referencias de memoria de los arreglos,
 es decir, estás verificando si ambos arreglos son el mismo objeto en memoria. En este caso, aunque los arreglos t1 y t2
 tienen los mismos elementos, son dos objetos diferentes en la memoria, por lo que la comparación con == devuelve false.

➣➣➣Por otro lado, el método Arrays.equals() compara los contenidos de los arreglos, verificando si los elementos en las
 mismas posiciones son iguales. En este caso, como los elementos en las mismas posiciones de t1 y t2 son los mismos, la
 comparación devuelve true.*/


}