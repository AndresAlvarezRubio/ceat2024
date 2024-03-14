import java.util.Scanner;

/**
 * Búsquedas en Arrays no Ordenados
 * La búsqueda se hace por medio de un algoritmo utilizando un
 * bucle para encontrar el primer elemento coincidente del,
 * array, mostrando su índice
 *
 * */
public class BusquedaNoOrdenada {

  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {

    int[] numeros = {5,3,7,977,3,6,8,1,4,90,44};
    mostrar("Longitud de la tabla -> "+numeros.length);

    int indice=0;//Se declara el índice en 0 para que comience el bucle desde esa posición
    int numeroBuscado=44;//Ejemplo de un número a buscar.

    while(indice<numeros.length && numeros[indice]!=numeroBuscado){

      indice++; //Se incrementa el índice para recorrer las posiciones del array

    }

    if (indice<numeros.length) { //Confirmamos que el índice no se ha salido del rango
      mostrarSinLn("La posición del número buscado es ->");
      System.out.print((indice+1));
    }
    else {//Si es mayor o igual que la longitud, quiere decir que no se ha encontrado el elemento
      mostrar("El número buscado no está en la tabla");
    }

    //Ejemplo de búscquedas utilizando una función con cadena de caracteres
    String nombre[]={"María","Pedro","Juan","Irene","Isabel","José","Alba"};
    busarTexto(nombre, "Irene");
  }

    public static void busarTexto(String texto[],String buscar){

      int indice=0;

      while(indice<texto.length && !texto[indice].equals(buscar)){

        indice++;

      }
      if (indice<texto.length) { //Confirmamos que el índice no se ha salido del rango
        mostrarSinLn("La posición del nombre buscado es ->");
        System.out.print((indice+1));
      }
      else {//Si es mayor o igual que la longitud, quiere decir que no se ha encontrado el elemento
        mostrar("El nombre buscado no está en la tabla");
      }

    }

    public static void mostrar(String texto){
      System.out.println("\t" + texto);
    }
    public static void mostrarSinLn(String texto){
      System.out.print("\t" + texto);
    }

}
