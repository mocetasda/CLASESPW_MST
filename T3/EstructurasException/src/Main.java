import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Programa exceptions");
        System.out.println("Procedemos a ejecutar errores de código");
        int resultado = 1000000;
        String nombre = null;
        //Aritmetic exception
        try {
            System.out.println("Indica un operando 1");
            int op1 = scanner.nextInt ();
            System.out.println("Indica un operando 2");
            int op2 = scanner.nextInt ();
            //int op1 = 12;
            //int op2 = 0;
            resultado = op1 / op2; // no existe division entre cero.
            System.out.println("El resultado es " +resultado);
        } catch (ArithmeticException e) {
            System.out.println("El op2 ha producido fallo");
            resultado = 0;
        } catch (NullPointerException e) {
            System.out.println("Fallo en la variable nombre");
        } catch (Exception e) {
            System.out.println("Cualquier fallo que no sea de los anteriores");
        }finally {
            //cerrar streams
            System.out.println("El resultado es " + resultado);
        }
        System.out.println("Ejecutamos al final del programa");
    }
}