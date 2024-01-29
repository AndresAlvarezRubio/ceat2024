package Actividades_tema_2;

import java.util.Scanner;

public class ActividadAplicacion2_14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.print("Escriba un número entre 1 y 99-> ");
        byte numUser = sc.nextByte();
        String salida="";
        if (numUser > 0 && numUser < 100) {
            switch (numUser) {
                case 11-> salida="Once";
                case 12-> salida="Doce";
                case 13-> salida="Trece";
                case 14-> salida="Catorce";
                case 15-> salida="Quince";
                case 16-> salida="Dieciseis";
                case 17-> salida="Diecisiete";
                case 18-> salida="Dieciocho";
                case 19-> salida="Dicecinueve";
                case 20-> salida="Veinte";
                case 21-> salida="Veintiuno";
                case 22-> salida="Veintidos";
                case 23-> salida="Veintitres";
                case 24-> salida="Veinticuatro";
                case 25-> salida="Veinticinco";
                case 26-> salida="Veintieseis";
                case 27-> salida="Veintisiete";
                case 28-> salida="Veintiocho";
                case 29-> salida="Veintinueve";
                default-> {
                    byte u = (byte) (numUser % 10);
                    byte d = (byte) (numUser / 10);
                    switch (d) {
                        case 1 -> salida = "Diez";
                        case 2 -> salida = "Veinte";
                        case 3 -> salida = "Treinta";
                        case 4 -> salida = "Cuarenta";
                        case 5 -> salida = "Cincuenta";
                        case 6 -> salida = "Sesenta";
                        case 7 -> salida = "Setenta";
                        case 8 -> salida = "Ochenta";
                        case 9 -> salida = "Noventa";
                    }
                    if (d >= 3 && u != 0) {
                        salida += " y ";
                        switch (u) {
                            case 1 -> salida += "uno";
                            case 2 -> salida += "dos";
                            case 3 -> salida += "tres";
                            case 4 -> salida += "cuatro";
                            case 5 -> salida += "cinco";
                            case 6 -> salida += "seis";
                            case 7 -> salida += "siete";
                            case 8 -> salida += "ocho";
                            case 9 -> salida += "nueve";
                        }
                    }
                }
            }
            System.out.println("El número introducido es: " + salida);
        } else {
            System.out.println("El número introducido no está en rango");
        }
    }

}
/**
* 1-> Números especiales-> once, doce, trece... veintinueve. -> Todo esto es un switch.
* 2-> Calcular las decenas byte u=num%10   d=num/10 -> Switch con las decenas -> diez, veinte, treinta... noventa.
* 3-> Si u!=0 creamos condición que concatenará con "y".
* 4-> Switch de unidades del 1 al 9.
* */
