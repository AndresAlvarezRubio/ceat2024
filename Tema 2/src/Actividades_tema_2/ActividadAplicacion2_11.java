package Actividades_tema_2;

import java.util.Scanner;

public class ActividadAplicacion2_11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número entre 0 y 9999 -> ");
        short numUser = sc.nextShort();

        if (numUser >= 0 && numUser<=9999) {
            short a = (short) (numUser % 10);
            numUser /= 10;
            short b = (short) (numUser % 10);
            numUser /= 10;
            short c = (short) (numUser % 10);
            numUser /= 10;
            short d = (short) (numUser % 10);
            System.out.println(d + ", " + c + ", " + b + ", " + a);

            if (d == 0) {
                if (c == 0) {
                    if (b == 0) {System.out.println("Su número: " + a + ". No cuenta como capicúa.");}
                    else {
                        if (b == a){System.out.println("Su número es capicúa");}
                        else if (b != a) {System.out.println("Su número no es capicúa");}
                    }
                }
                else if (c == a) {System.out.println("Su número es capicúa");}
                else if (c != a) {System.out.println("Su número no es capicúa");}
            }
            else if (d == a) {
                if (b == c) {System.out.println("Su número es capicúa");}
                else if (b != c) {System.out.println("Su número no es capicúa");}
            }
            else if (d != a) {System.out.println("Su número no es capicúa");}
        }
        else {System.out.println("Número fuera de rango");}
    }
}
