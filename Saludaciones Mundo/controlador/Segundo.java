package controlador;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Segundo {

    public static void main(String[] args) {

        String nombrePersona="Andrés Álvarez";

        boolean nombrePersonaGrande=true;

        String ulisesMaximo="pedropicapiedra";

        //String toUpperCase(ulisesMaximo)=;

        System.out.println("El nombre del programador es " + nombrePersona);

        System.out.println("El apodo de este máquina es " + ulisesMaximo.toUpperCase());
        System.out.println("//////////////////////////////////////////////////////////////////////");
///////////////////*Variable*////////////////////////
        System.out.println("*Variable*");
        System.out.println("");
        int a = 2;
        int b = -5;
        int variable = (a-b-a+b+a+a+a+a+a);

        System.out.println("La variable es igual a "+ variable);
        System.out.println("//////////////////////////////////////////////////////////////////////");

///////////////////*Constante*////////////////////////
        System.out.println("*Constante*");
        System.out.println("");
        final int edadMaxima= 18;
        System.out.println(edadMaxima);
        System.out.println("//////////////////////////////////////////////////////////////////////");

///////////////////*Prueba Constante*/////////////////
        System.out.println("*Prueba Constante*");
        System.out.println("");
        int j =(edadMaxima + 1);
        System.out.println("La suma de edadMaxima + 1 es " + j);
        System.out.println("//////////////////////////////////////////////////////////////////////");

////////////////////*Prueba Hora y Tiempo*/////////////
        LocalDate dia=LocalDate.now();
        LocalTime hora=LocalTime.now();
        System.out.println("*Fecha y Hora*");
        System.out.println("");
        System.out.println("La fecha actual es " + dia + ". Pero, la hora actual es " + hora);
        System.out.println("//////////////////////////////////////////////////////////////////////");


///////////////////*Prueba Hora y Tiempo*/////////////
        System.out.println("*Raíz Cuadrada*");
        System.out.println("");

        Double raizCuadrada=Math.sqrt(25);
        System.out.println(raizCuadrada);
        System.out.println("//////////////////////////////////////////////////////////////////////");


///////////////////*Scanner*/////////////
        System.out.println("");
        System.out.println("Déjame analizarte, pibe");

        Scanner entrada = new Scanner(System.in); //System.in indica que captura los datos del teclado

        System.out.print("Escribe el nombre de tu mascota: ");
        String nombreMascota=entrada.nextLine();
        System.out.println("Que nombre más bonito, me gusta " + nombreMascota);
        System.out.println("");


        System.out.print("Escribe tu edad: ");
        byte edadPersona=entrada.nextByte();
        System.out.println("Que viejo eres con " + edadPersona + " años");
        System.out.println("");

        System.out.print("Año que naciste, cosa linda: ");
        short anioNac=entrada.nextShort();
        System.out.println("Tu, no tienes " + (2024 - anioNac));

        System.out.println("");

        System.out.print("Cuanto vale tu vida: ");
        double valorVida= entrada.nextDouble();
        System.out.println("Que barato eres cobrando tan solo " + valorVida);

        System.out.println("");
        System.out.println("//////////////////////////////////////////////////////////////////////");


    }

}