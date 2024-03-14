import java.util.Arrays;

public class CopiarInsertarOrdenada {

    public static void main(String[] args) {

        int[] t = {1,2,3,4,6,7,8};//Tabla donde se insertará el número
        int nuevo=5;
        int indiceInsercion = Arrays.binarySearch(t,nuevo);

        if (indiceInsercion<0) {indiceInsercion=-indiceInsercion-1;}

        int[] copia = new int[t.length+1];
        System.arraycopy(t,0,copia,0,indiceInsercion);

        mostrar(Arrays.toString(copia));
        copia[indiceInsercion]=nuevo;
        mostrar(Arrays.toString(copia));
        System.arraycopy(t,indiceInsercion,copia,indiceInsercion+1,t.length-indiceInsercion);
        mostrar(Arrays.toString(copia));

        t=copia;
        mostrar(Arrays.toString(t));
    }

    public static void mostrar(String texto) {
        System.out.println("\t" + texto);
    }

    public static void mostrarSinLn(String texto) {System.out.print("\t" + texto);}

}