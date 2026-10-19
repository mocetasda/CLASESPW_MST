import model.Jugador;

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
        Jugador jugador1 = new Jugador( );
        // = correo = null nombre =null numeroVidas =0 habilidad =0 estrella = false
        jugador1.nombre = "Monica";
        jugador1.numeroVidas = 5;
        jugador1.estrella = true;
        System.out.println(jugador1.nombre);
        System.out.println(jugador1.numeroVidas);
        System.out.println(jugador1.estrella);

        Jugador jugador2 = new Jugador("Maria", 5, 100, true);
        System.out.println(jugador2.nombre);
        System.out.println(jugador2.estrella);


    }
}