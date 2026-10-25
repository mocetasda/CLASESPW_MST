import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        //ejercicio 1
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = lector.nextInt();
        if (edad > 17) {
            System.out.println("Eres mayor de edad. Puedes votar");
        } else {
            System.out.println("No estas habilitado para votar");
        }

        //ejercicio 2
        //Scanner lector = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Introduce un numero");
        double numero = lector.nextDouble();
        lector.close();
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if ((numero < 0)) {
            System.out.println("El numero es negativo");
        } else
            System.out.println("El numero es cero");
    }
}

