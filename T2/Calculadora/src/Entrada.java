import model.Calculadora;
import model.Rectangulo;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        //ModelViewControl
        Calculadora calculadora = new Calculadora();
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el primer operando");
        int operando1 = lector.nextInt();
        System.out.println("Introduce el segundo operando");
        int operando2 = lector.nextInt();
        lector.close();
        // suma
        calculadora.sumar(operando1, operando2);
        System.out.println("El resutlado es " +calculadora.getResultado());
        //calculadora.sumar(operando1, operando2,10);
        // resta
        calculadora.resta(operando1, operando2);
        System.out.println("El resutlado es " +calculadora.getResultado());
        // multiplicación
        calculadora.multiplicacion(operando1, operando2);
        System.out.println("El resutlado es " +calculadora.getResultado());
        // , division
        calculadora.division(operando1, operando2);
        System.out.println("El resutlado es " +calculadora.getResultado());
        // el modulo
        calculadora.modulo(operando1, operando2);
        System.out.println("El resutlado es " +calculadora.getResultado());
        System.out.println("La última operación es de " + calculadora.getTipo());

        // ejercicio 7 - rectangulo y cuadrado
        Rectangulo rectangulo = new Rectangulo(5,3);
        System.out.printf("Rectángulo: base %.1f - altura %.2f\n",rectangulo.getBase(),rectangulo.getAltura() );
        rectangulo.arearectangulo(rectangulo.getBase(),rectangulo.getAltura());
        System.out.printf("Area del rectangulo:  %.1f \n",rectangulo.getResultado() );
        Rectangulo cuadrado = new Rectangulo (4)   ;
        System.out.printf("Cuadrado: base %.1f - altura %.2f\n",cuadrado.getAltura(),cuadrado.getBase());
        rectangulo.areacuadrado(cuadrado.getBase());
        System.out.printf("Area del cuadrado:  %.1f \n",cuadrado.getResultado());

    }
}
