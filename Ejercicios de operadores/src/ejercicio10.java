import java.util.Arrays;
import java.util.Scanner;

public class ejercicio10 {
    public static void main (String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Coloca un número");
        int numero = lector.nextInt(); // 56756
        int dmillar = numero/10000;
        int umillar = (numero%10000)/1000;
        int centenas = (numero%1000)/100;
        int decenas= (numero%100)/10;
        int unidades=numero%10;
        System.out.println("Millar " +dmillar);
        System.out.println("umillar " +umillar);
        System.out.println("centenas " +centenas);
        System.out.println("decenas " +decenas);
        System.out.println("unidad " +unidades);

        System.out.println("dmillar");
        dmillar = lector.nextInt();
        System.out.println("umillar");
        umillar = lector.nextInt();
        System.out.println("centenas");
        centenas = lector.nextInt();
        System.out.println("decenas");
        decenas = lector.nextInt();
        System.out.println("unidades");
        unidades = lector.nextInt();
        lector.close();
        System.out.println("El número es " +dmillar+umillar+centenas+decenas+unidades);










            }
}
