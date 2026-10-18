import java.util.Arrays;
import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Por favor introduce un numero");
        int numero = lector.nextInt();

        boolean esPar = numero%2==0;
        boolean mayor50 = numero>50;
        System.out.println("Es par = " + esPar);
        System.out.println("Es mayor que 50 = " + mayor50);
        System.out.println("Es impar = " +!esPar);

        System.out.println(" ");
        System.out.println("Introduce cuanto dinero tengo");
        double dinero = lector.nextDouble();
        System.out.println("Introduce cuanto cuesta el primer artículo sin IVA");
        double articulo1 = lector.nextDouble();
        System.out.println("Introduce cuanto cuesta el segundo artículo sin IVA");
        double articulo2 = lector.nextDouble();
        System.out.println("Introduce el IVA");
        double IVA = lector.nextDouble()/100;
        lector.close();
        double articulo1conIVA = articulo1*(1+(IVA));
        double articulo2conIVA = articulo2*(1+(IVA));
        Double costototal = articulo1conIVA + articulo2conIVA;
        boolean comprararticulo1 =  articulo1conIVA <= dinero;
        boolean comprarrticulo2 = articulo2conIVA <= dinero;
        boolean comprarTodo = (articulo1conIVA + articulo2conIVA) <= dinero;
        System.out.println("Precio de articulo 1 con IVA " +articulo1conIVA);
        System.out.println("Precio de articulo 2 con IVA " +articulo2conIVA);
        System.out.println("Puedo comprar artículo 1 " +comprararticulo1);
        System.out.println("Puedo comprar artículo 2 " +comprarrticulo2);
        System.out.println("Puedo comprar todo " +comprarTodo);


    }
}
