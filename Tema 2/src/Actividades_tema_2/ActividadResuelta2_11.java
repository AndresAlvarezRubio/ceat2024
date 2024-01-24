package Actividades_tema_2;

import java.util.Scanner;

public class ActividadResuelta2_11 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("***********************************************");
        System.out.println("*********** ¿Que día desea la cita? ***********");
        System.out.println("***********   (Introd. el número)   ***********");
        System.out.println("***********************************************");
        System.out.println("**              1. Lunes                     **");
        System.out.println("**              2. Martes                    **");
        System.out.println("**              3. Miércoles                 **");
        System.out.println("**              4. Jueves                    **");
        System.out.println("**              5. Viernes                   **");
        System.out.println("**              6. Sábado                    **");
        System.out.println("**              7. Domingo                   **");
        System.out.println("***********************************************");


        byte inputUser = sc.nextByte();
        switch (inputUser) {
            case 1:
                System.out.println("Su cita será el próximo Lunes");
                break;
            case 2:
                System.out.println("Su cita será el próximo Martes");
                break;
            case 3:
                System.out.println("Su cita será el próximo Miércoles");
                break;
            case 4:
                System.out.println("Su cita será el próximo Jueves");
                break;
            case 5:
                System.out.println("Su cita será el próximo Jueves");
                break;
            case 6:
                System.out.println("Su cita será el próximo Jueves");
                break;
            case 7:
                System.out.println("Su cita será el próximo Jueves");
                break;
            default :
                System.out.println("Non entendo");
                break;
        }
    }

}
