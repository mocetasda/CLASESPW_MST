import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca op1=");
        int op1 = lector.nextInt();
        System.out.println("Introduzca op2=" );
        int op2 = lector.nextInt();
        lector.close();
        int suma = op1 + op2;
        int resta = op1 - op2;
        int multiplica = op1 * op2;
        int divide = op1/op2;
        int mod = op1%op2; // resto
        double divreal = (double) op1/ op2;
        double restreal = op1%op2;
        System.out.println("la suma es " + suma);
        System.out.println("la resta es " + resta);
        System.out.println("la multiplicacion es " + multiplica);
        System.out.println("la division es " + divide);
        System.out.println("el resto es " + mod);
        System.out.println("la division real es " + divreal);
        System.out.println("el resto real es " + restreal);
    }
}
