import java.util.Arrays;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = lector.nextLine();
        System.out.println("Introduce tu edad");
        int edad = lector.nextInt();
        System.out.println("En qué ciudad vives");
        String ciudad = lector.nextLine();
        // órdenes
        System.out.println("Nombre = " + nombre);
        System.out.println("Edad = " + edad);
        System.out.println("Ciudad = " + ciudad);
    }

}
