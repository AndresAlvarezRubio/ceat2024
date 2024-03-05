import java.util.Arrays;

public class BusquedaOrdenada {

  public static void main(String[] args) {

    //Alta de Array
     int numeros[] = {5,2,7,3,7,8,3,4,5,7,8};

     // Números sin ordenar
     mostrar("Longitud -> " + numeros.length);
      mostrar(Arrays.toString(numeros));

     // Números ordenados
     Arrays.sort(numeros);
      mostrar(Arrays.toString(numeros));

    //Después de ordenar el Array, se puede buscar un elemento
    //con la clase binarySearch(nombreArray,elementoABuscar)
    //El resultado de esta clase es un entero, si es positivo,
    //es el índice donde se encuentra. Si es negativo, es el
    //índice donde debería ir posicionado ese elemento buscado
    //que no se encuentra

    int pos = Arrays.binarySearch(numeros,5);
    mostrar("Posición -> " + pos);


  }
  public static void mostrar(String texto) {
    System.out.println("\t"+texto);
  }
  public static void mostrarSinLn(String texto) {
    System.out.print("\t"+texto);
  }
}
