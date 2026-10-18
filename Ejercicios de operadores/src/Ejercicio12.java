import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indique la primera palabra a compara = ");
        String palabra1 = lector.nextLine();
        System.out.println("Indique la segunda palabra a compara = ");
        String palabra2 = lector.nextLine();
        lector.close();
        //int largopalabra1 = palabra1.length();
        //int largopalabra2 = palabra2.length();
        boolean iguales = palabra1.equals(palabra2);
        boolean igualsincase = palabra1.equalsIgnoreCase(palabra2);
        boolean primeramenorsegunda = palabra1.length() < palabra2.length();
                System.out.println("Son iguales = " +iguales);
        System.out.println("Son iguales sin case = " +igualsincase);
        System.out.println("La primera es menor que la segunda = " +primeramenorsegunda);
        System.out.println("Son distintas = " +!iguales);

    }
}
