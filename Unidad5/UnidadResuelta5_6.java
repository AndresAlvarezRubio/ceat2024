import java.util.Arrays;
import java.util.Scanner;

//Solicitar una apuesta de 6 números
public class UnidadResuelta5_6 {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int cominacionGanadora[] = new int[6];
    int numero;

    for (int i = 0; i < cominacionGanadora.length; i++) {

      numero = (int)(Math.random()*49+1);
      //Si se duplica un número, este no contará.
      if (numero==0) {



      }

    }

    mostrar(" <- Introduce tu apuesta -> ");
    int apuesta[] = new int[6];

    for (int i = 0; i < apuesta.length; i++) {

      mostrarSinLn("Número " + (i+1)+" : ");
      apuesta[i] = sc.nextInt();

    }

    mostrar(Arrays.toString(cominacionGanadora));

  }


  public static int primitiva(int apuesta[],int ganadora[]) {

    int aciertos = 0;


    return aciertos;


  }
  public static void mostrar(String texto) {
    System.out.println("\t"+texto);
  }
  public static void mostrarSinLn(String texto) {
    System.out.print("\t"+texto);
  }

}
