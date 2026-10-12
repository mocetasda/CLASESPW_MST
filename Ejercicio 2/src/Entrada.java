import java.util.Arrays;
import java.util.Scanner;

public class Entrada {
    public static void main (String[] args){
        int puntuacion = 0;
        int primeraracalificacion = puntuacion +5;//5
        int segundacalificacion= primeraracalificacion*2;//10
        int puntuacionfinal= primeraracalificacion+segundacalificacion;
        System.out.println("La puntuacion inicial es " + puntuacion);
        System.out.println("Mi primera calificacion es " + primeraracalificacion);
        System.out.println("Mi segunda calificacion es " + segundacalificacion);
        System.out.println("Mi calificación final es " + puntuacionfinal);

        // otra forma, se reemplaza el valor de las variables
        puntuacion =0;
        System.out.println("Puntuación inicial = " + puntuacion);
        puntuacion =5;
        System.out.println("Despues de primera modificacion = " + puntuacion);
        puntuacion =10;
        System.out.println("Despues de segunda modificacion = " + puntuacion);
        puntuacion =15;
        System.out.println("Puntuacion final = " + puntuacion);


    }
}
    /*public static void main (String[] args){
        int puntuacion =0;
        System.out.println("Puntuación inicial" + puntuacion);

        int puntuacion =5;
        System.out.println("Despues de primera modificacion" + puntuacion);

        int puntuacion =10;
        System.out.println("Despues de segunda modificacion" + puntuacion);

        int puntuacion =15;
        System.out.println("Puntuacion final" + puntuacion);*/
