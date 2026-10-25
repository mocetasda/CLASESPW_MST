package ejerciciosfor;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        /* ejercicio 7:
        ### Ejercicio 7
            Simúlese el lanzamiento de un dado.
            Se introducirá el número de veces que se lanza
            el dado (de no ser positivo, se establecerá a 100) y
            se mostrará el resumen de los lanzamientos.
            Se mostraán cuantas veces ha salido cada número. (Dado)
         */
        Scanner lector = new Scanner(System.in);
        System.out.println("Introducir numero de veces a lanzar");
        int lanzamientos = lector.nextInt();
        lector.close();
        if (lanzamientos<0){
            lanzamientos = 100;
        }
        int vecescara1=0, vecescara2=0, vecescara3=0, vecescara4=0, vecescara5=0, vecescara6=0;
        for (int i = lanzamientos; i>0; i--){
            int aleatorio = (int)(Math.random()*6)+1;
            switch (aleatorio){
                case 1 -> vecescara1++;
                case 2 -> vecescara2++;
                case 3 -> vecescara3++;
                case 4 -> vecescara4++;
                case 5 -> vecescara5++;
                case 6 -> vecescara6++;
            }
        }
        System.out.println("El total de vecescara 1 " +vecescara1);
        System.out.println("El total de vecescara 2 " +vecescara2);
        System.out.println("El total de vecescara 3 " +vecescara3);
        System.out.println("El total de vecescara 4 " +vecescara4);
        System.out.println("El total de vecescara 5 " +vecescara5);
        System.out.println("El total de vecescara 6 " +vecescara6);
    }
}
