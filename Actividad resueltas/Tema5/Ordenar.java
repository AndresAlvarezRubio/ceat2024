package Tema5;

import java.util.Arrays;

public class Ordenar {

  public static void main(String[] args) {

    //Ordenar un Array, se modifica el Array...
    //Se ordena de forma creciente
    //Los datos pueden ser primitivos (numéricos)


    int[] numeros = {5,8,7,1,3,9,15};
    System.out.println(Arrays.toString(numeros));

    //La función para ordenar es Arrays.sort(nombreDelArray)
    Arrays.sort(numeros);
    System.out.println(Arrays.toString(numeros));

    // Ordenar tipos no primitivos (String)
    String nombres[]={"María","Ana","Beatriz","Federica","ana"};
    System.out.println(Arrays.toString(nombres));
    Arrays.sort(nombres);
    System.out.println(Arrays.toString(nombres));

  }

}
