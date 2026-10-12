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
            //1. según el dato que guarda: String:palabras, char:letras, int:numeros, double/float: decimales, boolean: true o false
            //2. según la forma de construirse: primitivo - valor (char, int, double), complejo - primera letra en mayúscula como funcionalidad
                // un primitivo puede ser complejo si le llamo por su nombre completo ejemplo: char como Character
                // para convertir un complejo en primitivo se escribe en minúscula la primera letra.
            //3. según su mutabilidad del dato: si cambia o no/ mutables / no mutables (constantes - altura, dni, se le ponte la palabra final, siempre mayusculas).
            //4. según el scope de la variable: según el metodo o clase.
        //definir una variable: tipo de dato, nombre y si quiere se les asigna un valor: String nombre ="Hello"
          // para definir una variable compleja es tipo de dato, nombre, new + tipo de dato y forma del valor
        String nombreLegal="Borja";
        final String DNI ="404703";
        char letra = 'A';
        Character letraCompleta ='a';
        int edad= 41;
        double altura =1.65;
        boolean acierto = true;
        //float alturaFloat = 1.74f;
        // orders
        System.out.println("Mi nombre es " +nombreLegal);
        System.out.println("Mi dni es " +DNI);
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

