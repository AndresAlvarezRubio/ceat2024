package Actividades_tema_2;

import java.util.Scanner;

public class ActividadResuelta2_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la actual hora -> "); {
            int hora = sc.nextInt();
            if (hora >= 0 && hora <=23) {
                System.out.print("Introduzca los minutos actuales -> ");
                int minutos = sc.nextInt();
                if (minutos >= 0 && minutos <=59) {
                    System.out.print("Introduzca los segundos actuales -> ");
                    int segundos = sc.nextInt();
                    if (segundos >= 0 && segundos <=59) {
                        System.out.println("La hora introducida es: " + hora + ":" + minutos + ":" + segundos);
                        segundos +=1;
                        if (segundos == 60) {
                            minutos +=1;
                            segundos = 0;
                            if (minutos == 60) {
                                hora +=1;
                                minutos = 0;
                                if (hora == 24) {
                                    hora = 0;
                                    System.out.print("La hora introducida al segundo después es: " + hora + ":" + minutos + ":" + segundos);
                                } else {
                                    System.out.print("La hora introducida al segundo después es: " + hora + ":" + minutos + ":" + segundos);
                                }
                            } else {
                                System.out.print("La hora introducida al segundo después es: " + hora + ":" + minutos + ":" + segundos);
                            }
                            } else {
                            System.out.print("La hora introducida al segundo después es: " + hora + ":" + minutos + ":" + segundos);
                        }
                    } else {
                        System.out.println("Los segundos introducidos no existen");
                    }
                } else {
                        System.out.println("Los minutos introducidos no existen");
                    }
            } else {
                System.out.println("La hora introducida no existe.");
            }
        }

    }

}
