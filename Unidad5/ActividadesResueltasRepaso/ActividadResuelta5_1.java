package ActividadesResueltasRepaso;

/**
 * Crear una tabla de longitud 10 que se inicializará con números
 * aleatorios comprendidos entre 1 y 100. Mostrar la suma de todos
 * los números aleatorios que se guarden en la tabla.
 * */
public class ActividadResuelta5_1 {

  public static void main(String[] args) {

    int[] numeros = new int[10];
    int sumTotal=0;

    for (int i = 0; i < numeros.length; i++) {

      numeros[i] = (int)(Math.random()*100+1);


    }

    System.out.println(sumTotal);

  }

}
