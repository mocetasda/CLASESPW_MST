import model.*;

import java.util.Arrays;
import java.util.Scanner;

public class Entrada {
    //metodo main
    /* public es quienes pueden acceder, void (lo que me da el metodo
    si dice void es porque no hay retorno, (String arg son los argumentos
    que son los datos que necesita el metodo para que los utilice.
    se puede trabajar sin el String desde el git 23 en adelante
         */
    public static void main(String[] args) {
        System.out.println("Iniciemos el juego de los objetos");
        String nombre = "Sanchez";
        //Scanner scanner = new Scanner();
        Jugador jugador1 = new Jugador();
        // = correo = null nombre =null numeroVidas =0 habilidad =0 estrella = false
        //jugador1.nombre = "Monica";
        //jugador1.numeroVidas = 5;
        //jugador1.estrella = true;
        System.out.println(jugador1.getNombre());
        System.out.println(jugador1.getNumeroVidas());
        System.out.println(jugador1.isEstrella());
        System.out.println(jugador1.getHabilidad());

        System.out.println(" ");
        Jugador jugador2 = new Jugador("Maria", 5, 100, true);
        System.out.println(jugador2.getNombre());
        System.out.println(jugador2.isEstrella());
        System.out.println(jugador2.getNumeroVidas());
        System.out.println(jugador2.getHabilidad());

        System.out.println(" ");
        Jugador jugador3 = new Jugador("Roberto", 8);
        System.out.println(jugador3.getNombre());
        System.out.println(jugador3.getNumeroVidas());
        System.out.println(jugador3.isEstrella());
        System.out.println(jugador3.getHabilidad());

        System.out.println(" ");
        Jugador jugador4 = new Jugador("Joquin", "joasebac@gmail.com");
        jugador4.setNombre("Pepito");
        System.out.println(jugador4.getNombre());
        System.out.println(jugador4.getCorreo());
        System.out.println(jugador4.isEstrella());
        System.out.println(jugador4.getHabilidad());
        System.out.println(" ");

        jugador3.saludar();
        jugador3.recibirimpacto();
        jugador3.recibirimpacto();
        jugador3.recibirimpacto();
        jugador3.recibirimpacto();
        jugador3.recibirimpacto();
        jugador3.recibirimpacto();
        jugador3.recibirimpacto();
        jugador3.recibirimpacto();
        jugador3.recibirimpacto();
        jugador3.recibirimpacto();
        System.out.println("Despues de la guerra ....");
        jugador3.saludar();

        jugador3.saludar();
        jugador3.saludar(" soy Roberto");


        System.out.println("Despues de la guerra ....");

        // ejercicio 1//
        Persona persona1 = new Persona("Ana", 20);
        System.out.println("Nombre= " + persona1.nombre);
        System.out.println("Edad= " + persona1.edad);

        // ejercicio 2//
        System.out.println(" ");
        Mascota mascota1 = new Mascota ("Luna","Gato", 3);
        Mascota mascota2 = new Mascota ("Toby", "Perro", 5);
        System.out.printf ("Mascota 1= %s - %s - %d años\n",mascota1.nombre, mascota1.especie, mascota1.edad);
        System.out.printf ("Mascota 2= %s - %s - %d años\n",mascota2.nombre, mascota2.especie, mascota2.edad);

        // ejercicio 3//
        System.out.println(" ");
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("El principito","Antoine de Saint-Exupéry", 96);
        System.out.printf("Libro 1: %s - %s - %d páginas\n",libro1.titulo,libro1.autor,libro1.paginas);
        System.out.printf("Libro 2: %s - %s - %d páginas\n",libro2.titulo, libro2.autor,libro2.paginas);

        // ejercicio 4//
        System.out.println(" ");
        Producto producto1 = new Producto ("Cuaderno");
        Producto producto2 = new Producto ("Mochila", 25.5);
        System.out.printf("Producto 1: %s - %.2f dólares\n",producto1.nombre, producto1.precio);
        System.out.printf("Producto 2: %s - %.2f dólares\n",producto2.nombre, producto2.precio);

        // ejercicio 5//
        System.out.println(" ");
        Coche coche1 = new Coche ();
        Coche coche2 = new Coche ("Toyota", "Corolla");
        Coche coche3 = new Coche ("Seat", "Ibiza", 2020);
        System.out.printf("Coche 1: %s - %s - %d\n",coche1.marca, coche1.modelo, coche1.anio);
        System.out.printf("Coche 2: %s - %s - %d\n",coche2.marca, coche2.modelo, coche2.anio);
        System.out.printf("Coche 3: %s - %s - %d\n",coche3.marca, coche3.modelo, coche3.anio);




    }
}
