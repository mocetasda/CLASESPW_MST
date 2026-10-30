import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Programa exceptions");
       int resultado = 0;
        boolean fallo = false;
        /*
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Introduce el primer número");
                int op1 = scanner.nextInt();
                System.out.println("Introduce el segundo número");
                int op2 = scanner.nextInt();
                resultado = op1 / op2;
                fallo = false;
            } catch (InputMismatchException e) {
                System.out.println("Algun dato de los introducidos no es correcto");
                fallo = true;
            } catch (ArithmeticException e) {
                fallo = true;
                System.out.println("El operando 2 no es válido, por favor introduce otro número");
            }
        } while (fallo);
        System.out.println("El resultado de la división es " + resultado);

         */
        /*
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

         */
        try (Scanner scanner = new Scanner (System.in)){
            System.out.println("Intruce el valor del numero 1");
            int op1= scanner.nextInt();
            System.out.println("Intruce el valor del numero 2");
            int op2= scanner.nextInt();
            // < >yo como programador puede señalar cuando algo tiene un error
            if (op1 <0 || op2 < 0) {
                throw new Exception ("Fallo,numeros muy pequeños");
            }else if (op1>100 || op2 >100 ){
                throw new RuntimeException("Fallo, numeros muy grandes");
            }
            resultado = op1/op2;
            System.out.println("El resultado es " +resultado);
        } catch (InputMismatchException | ArithmeticException e){
            System.out.println("Error en la lecutra de los operados o resultado");
            fallo = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //System.out.println("El resultado de la operación es " +resultado);
        System.out.println("Ejecutamos al final del programa");
    }
}