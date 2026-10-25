import java.util.Scanner;

public class MainSwitch {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        /* modo tradicional
        System.out.println("Indica el número que quieres evaluar");

        int numero = lector.nextInt();
        String mensaje;
        switch (numero) {
            // entre el switch y el case no se escribe nada, dentro de los case si
            case 1:
                System.out.println("Variable con valor 1");
                mensaje = "opción 1";
                break;
            case 2:
                System.out.println("Variable con valor 2");
                mensaje = "opción 2";
                break;
            case 3:
                System.out.println("Variable con valor 3");
                mensaje = "opción 3";
                break;
            case 4:
                System.out.println("Variable con valor 4");
                mensaje = "opción 4";
                break;
            case 5,6,7,8,9:
                System.out.println("Variable con valor conjunto");
                mensaje = "opción conjunta";
                break;
            default:
                System.out.println("Variable no contemplada");
                mensaje = "sin valor";

        }
        System.out.println("El mensaje es " + mensaje);*/
        /*modo moderno
        System.out.println("Introduce nombre");
        String nombre = lector.next();
        String mensaje;
        switch (nombre) {
            case "Monica" ->{
                mensaje = "nombre Monica";
                System.out.println("El nombre introducido es Monica");
            }
            case "Roberto" ->{
                mensaje = "nombre Roberto";
                System.out.println("El nombre introducido es Roberto");
            }
            case "Joaquin", "Luis" -> {
                mensaje = "nombre conjunto";
                System.out.println("El nombre introducido es conjunto");
            }
            default -> {
                mensaje = "nombre sin contemplar";
                System.out.println("Nombre no contemplado");
            }
        }
        System.out.println(mensaje);
       */
        // ejecicio 5 de los Swicth
        System.out.println("Introduce tu calificacion");
        char calificacion = lector.next().toUpperCase().charAt(0);//"Andar" = 'A'
        String mensaje = null;
        switch (calificacion) {
            case 'A' -> {
                mensaje ="Excelente";
                break;
            }
            case 'B' -> {
                mensaje ="Muy bien";
                break;
            }
            case 'C' -> {
                mensaje ="Bien";
                break;
            }
            case 'D' -> {
                mensaje = "Suficiente";
                break;
            }
            case 'F' -> {
                mensaje ="Insuficiente";
            }
            default -> {
                mensaje ="sin calificar";
            }
        }
        System.out.println("la calificación es " +mensaje);
        System.out.println("Terminada la evaluación");
    }
}
