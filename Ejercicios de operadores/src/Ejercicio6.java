import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main (String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el precio de compra con IVA = ");
        double preciocompraconiva = lector.nextDouble();
        System.out.println("Que IVA se te aplica = ");
        double iva = lector.nextDouble()/100.00;
        lector.close();
        double preciosiniva = preciocompraconiva/(1+iva);
        double montoiva = preciocompraconiva - preciosiniva;
        System.out.println("Detalle del precio");
        System.out.printf("Has pagado un total de monto de iva de %.2f de un precio de compra de %.2f\n",montoiva,preciocompraconiva);
        System.out.printf("Has pagado un articulo por %.2f cuyo precio sin IVA de %.2f\n",preciocompraconiva,preciosiniva);

    }
}
