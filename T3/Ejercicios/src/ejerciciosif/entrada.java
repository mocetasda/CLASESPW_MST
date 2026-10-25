package ejerciciosif;

import java.util.Scanner;

public class entrada {
    public static void main(String[] args) {
        /*### Ejercicio 7
        Un número de 3 cifras es un número de Armstrong si la suma de sus
        dígitos elevado a 3 coincide con dicho número.
        Por ejemplo, 153 = 1+125+27.
        Dado un número de 3 cifras determinar si es o no un número Armstrong.
        Se comprobará previamente que el número introducido tiene 3 dígitos.
        En la salida se mostrará uno de los siguientes mensajes:
        1. “El número no tiene 3 dígitos”
        2. “Es un número Armstrong”
        3. “No es un número Armstrong”.
         */
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa un número que quiere evaluar");
        int numero = lector.nextInt();
        lector.close();
        if (numero < 100 || numero > 999) {
            System.out.println("El numero no tiene 3 dígitos");
        } else {
            int centenas = numero / 100;
            int decenas = ((numero % 100)) / 10;
            int unidades = numero % 10;
            int suma = (int) (Math.pow(centenas, 3) + Math.pow(decenas, 3) + Math.pow(unidades, 3));
            /* if normal
            if (suma == numero) {
                System.out.println("Es un número Armstrong");
            } else {
                System.out.println("No es un número Armstrong");
            } */
            /* Modo terniario
            String mensaje = suma == numero ? "Es Armstrong" :"No es Armstrong";
            System.out.println(mensaje);*/
            // Modo terniario mejorado
            System.out.println(suma == numero ? "Es Armstrong" :"No es Armstrong");

        }
    }
}
