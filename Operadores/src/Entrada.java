import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Entrada {

    public static void main (String[] args) {
        System.out.println("Proyecto operadores");
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce tu  nombre");
        String nombre = lector.nextLine();
        System.out.println("Introduce el ciclo en el que esta matriculado");
        String ciclo = lector.nextLine();
        System.out.println("Nota que crees que sacarás al final del curso");
        int nota = lector.nextInt();
        System.out.println("Nombre: "+nombre);
        System.out.println("Ciclo: "+ciclo);
        System.out.println("Nota = " + nota);
        // OPERADORES = Realizar operaciones
        // aritméticos: Operaciones matemáticas (depende del tipo de dato) UNARIAS ++-- en 1 Y BINARIAS + - * / %
        int operando1=10;
        int operando2=5;
        operando1++;
        operando1++;
        operando1++;//13
        operando2--;
        operando2--;
        operando2--;//2
        operando2--;//1
        int suma=operando1 + operando2;//15
        int resta = operando1 - operando2; //11
        int multiplicacion = operando1*operando2;//26
        double division = (double) operando1/operando2; // 6.5
        int resto = operando1%operando2; // 13%2 ->
        System.out.println( "La suma " + suma);
        System.out.println( "La resta " + resta);
        System.out.println( "La multiplicación " + multiplicacion);
        System.out.println( "La división " + division);
        System.out.println("El resto " + resto);
        operando1 = 10;
        operando2 = 7;
        System.out.println("La suma de los operandos es "+ (operando1+operando2));
        String op1 ="5";
        String op2 ="15";
        System.out.println ("La suma de los ops es "+ (Integer.parseInt(op1)+Integer.parseInt(op2)));
        // asignación
        operando1=20;
        operando2=10;
        //operando1=operando1+14;//34
        operando1 +=14;// operando1+14;34
        operando1-=4; // 30
        operando1 *=2; // 60
        operando1 /=10; //6
        operando1 *=operando2;// 60
        operando1 %=2; //0
        // relaci0onales (siempre obtengo un boolean) > >= < <= 1=
        operando1= 10;
        operando2= 15;
        boolean comparacion = operando1>10; // false
        comparacion = operando1>=10; // true
        System.out.println("El resultado de la comparación es >= " +comparacion);
        comparacion = operando2<operando1;
        System.out.println("El resultado de la comparación es < " +comparacion);
        comparacion = operando2<=operando1;
        System.out.println("El resultado de la comparación es <=" +comparacion);
        comparacion = operando2 == operando1;
        System.out.println("El resultado de la comparación es = " +comparacion);
        comparacion = operando2<=operando1;
        System.out.println("El resultado de la comparación es != " +comparacion);
        comparacion = operando2<=operando1;
        // logicas - AND && ( shift 6) OR (alt 1) || (siempre se obtiene un boolean)
        // sueldo mas de 40000 y edad menor de 20
        // sueldo mas de 40000 y edad más de 20 y edad menos de 30 o pide < 20000
        operando1= 10;
        operando2=10;
        boolean resultadologico= operando1<10 && operando2*2>30; // false
        resultadologico = operando1<10 || operando2*2>30; // true

    }
}
