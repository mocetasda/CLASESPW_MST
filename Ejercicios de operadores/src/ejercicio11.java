import java.util.Arrays;
import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Por favor introduce un numero");
        int numero = lector.nextInt();
        lector.close();
        boolean esPar = numero%2==0;
        boolean mayor50 = numero>50;
        System.out.println("Es par = " + esPar);
        System.out.println("Es mayor que 50 = " + mayor50);
        System.out.println("Es impar = " +!esPar);
    }
}
