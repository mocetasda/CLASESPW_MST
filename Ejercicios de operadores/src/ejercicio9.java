import java.util.Arrays;
import java.util.Scanner;

public class ejercicio9 {
    public static void main (String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuántas bebidas pides");
        int nbebidas = lector.nextInt();
        System.out.println("Cuánto valke cada bebida");
        double pbebida = lector.nextDouble();
        System.out.println("Cuántas bocatas pides");
        int nbocatas = lector.nextInt();
        System.out.println("Cuántas vale cada bocata");
        double pbocata = lector.nextDouble();
        System.out.println("Cuántas comentsales son");
        int comensales = lector.nextInt();
        lector.close();
        double costobebidas = nbebidas*pbebida;
        double costobocatas = nbocatas*pbocata;
        double costototal = costobebidas + costobocatas;
        double costoindividual = costototal/comensales;
        System.out.println("ARTICULO\t\t\tCANTIDAD\t\t\t\tPRECIO\t\t\t\t8TOTAL");
        System.out.printf("%s\t\t\t\t\t%d\t\t\t\t\t%.1f\t\t\t\t\t%.1f\n","Bebida",nbebidas,pbebida,costobebidas);
        System.out.printf("%s\t\t\t\t\t%d\t\t\t\t\t%.1f\t\t\t\t\t%.1f\n","Bocata",nbocatas,pbocata,costobocatas);
        System.out.printf("%s\t\t\t\t%d\t\t\t\t\t\t\t\t\t\t%.1f\n","Comensales",comensales,costoindividual);
        System.out.printf("%s\t\t\t\t\t%.1f\t\t\t\t\t%.1f\t\t\t\t\t%.1f\n","Total",1.0,1.0,costototal);
    }
}
