import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {
    public static void main (String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime la cantidad de segundos = ");
        int numerosegundos = lector.nextInt();
        lector.close();
        int horas = numerosegundos/3600;
        System.out.println("horas = " +horas);
        int minutos = (numerosegundos%3600)/60;
        System.out.println("minutos = " +minutos);
        int segundos = (numerosegundos%3600)%60;
        System.out.println("segundos = " +segundos);



    }
}
