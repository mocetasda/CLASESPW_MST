import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Entrada {

    public static void main (String[] args) {
        System.out.println("Proyecto operadores");
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce tu  nombre");
        String nombre = lector.nextLine();
        System.out.println("Introduce el ciclo en el que esta matriculado");
        String ciclo = lector.nextLine();
        System.out.println("Nota que crees que sacarás al final del curso");
        int nota = lector.nextInt();
        System.out.println("Nombre: "+nombre);
        System.out.println("Ciclo: "+ciclo);
        System.out.println("Nota = " + nota);
    }


}
