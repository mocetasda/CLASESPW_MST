import java.util.Arrays;

/**
 * @author monica
 * @version 1.0
 */
public class Entrada {
    // aquí explicas BREVEMENTE algo para aclarar las ideas
    // TODO en esta otra línea hago una aclaración diferente
    /*
    Este comentario administe unas cuántas lineas
    Esta es una segunda línea
     */
    // TODO esta tarea la dejo pendiente para el lunes
    // mod acceso retorna nombre (args) {funcionalidad}

    public static void main (String [] args){
        //variables:
            //según el dato que guarda: String:palabras, char:letras, int:numeros, double/float: decimales, boolean: true o false
        //definir una variable: tipo de dato, nombre y si quiere se les asigna un valor: String nombre ="Hello"
        String nombreLegal="Borja M";
        char letra = 'A';
        int edad= 41;
        double altura =1.65;
        boolean acierto = true;
        //float alturaFloat = 1.74f;
        // orders
        System.out.println("Mi nombre es " +nombreLegal);
        System.out.println("La letra de mi DNI es " +letra);
        System.out.println("La letra de mi DNI es " +letra);
        System.out.println("El resultado de la evaluación es " +acierto);
        String nombre="Hello";
        System.out.println('a');
        System.out.println("Hola mundo");
        System.out.println(9*6);
        System.out.println(7.98);
        System.out.println(true);
        System.out.println("Segunda linea");
        System.out.println("Tercera linea\nCuarta linea\nQuinta Línea");
        System.out.print("\tSextalinea\n");
        System.out.println("La suma de "+9+" y "+6+" tiene como resultado " + (9+6));;
        System.out.println(nombre.length());

    }
    /**
     * @param arg explica el parametro
     * @return explicate el retorno
     */
    public int metodo (String arg) { return 1;}
}

