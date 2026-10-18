import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    private static String system;

    public static void main (String[] args){
        final double PRECIO_BEBIDA = 1.25;
        final double PRECIO_BOCATA = 2.05;
        Scanner lector = new Scanner(System.in);
        System.out.println("Cantidad de bebidas = " );
        int nbebidas = lector.nextInt();
        System.out.println("Cantidad de bocatas = " );
        int nbocatas = lector.nextInt();
        lector.close();
        double preciobebidas = PRECIO_BEBIDA*nbebidas;
        double preciobocatas = PRECIO_BOCATA*nbocatas;
        double preciototal = + (preciobebidas+preciobocatas);
        System.out.println("El precio total de bebidas es = " +preciobebidas);
        System.out.println("El precio total de bebidas es = " +preciobocatas);
        System.out.println("El precio total de consumo es = " +preciototal);

    }
}
