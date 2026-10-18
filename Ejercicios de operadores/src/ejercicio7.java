import java.util.Arrays;
import java.util.Scanner;

public class ejercicio7 {
    public static void main (String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Qué radio tiene el círculo = ");
        double radio = lector.nextDouble();
        lector.close();
        double area = Math.PI*Math.pow(radio,2);
        double longitud = 2*Math.PI*radio;
        System.out.println("El area es  = " + area);
        System.out.println("La longitud es  = " + longitud);
    }
}
