import java.util.Arrays;

public class CopiarInsertar {

  public static void main(String[] args) {

    int[] numeros=new int[6];

    for (int i = 0; i < numeros.length; i++) {

      numeros[i] = (int) (Math.random() * 100 + 1);

    }

    //Array declarado
    mostrar("\nArray antes de crecer. Longitud -> " + numeros.length);
    mostrar(Arrays.toString(numeros));

    //Array declarado sobreescrito sumándole 1
    numeros = Arrays.copyOf(numeros, numeros.length+1);
    mostrar("\nArray antes de crecer. Longitud -> " + numeros.length);

    //El número(8) que se agrega en la posición final(length-1) del nuevo Array copiado
    numeros[numeros.length-1]=8;
    mostrar(Arrays.toString(numeros));


  }

  public static void mostrar(String texto) {
    System.out.println("\t" + texto);
  }

  public static void mostrarSinLn(String texto) {
    System.out.print("\t" + texto);
  }
}
