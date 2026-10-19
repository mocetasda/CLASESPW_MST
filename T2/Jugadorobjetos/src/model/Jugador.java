package model;
//importaciones, es el molde de un jugador
public class Jugador {
    // atributos - variables que cualifican
    public String nombre, correo;
    public int numeroVidas, habilidad;
    public boolean estrella;

    // constructores = hace realidad el objeto. 1 a n. Si no escribo nada por defecto es 1
    public Jugador (){} // Constructor vacio
    public Jugador (String nombreParametro, int numeroVidasParametro, int habilidadParametro, boolean estrellaParametro){
        nombre=nombreParametro;
        numeroVidas=numeroVidasParametro;
        habilidad=habilidadParametro;
        estrella=estrellaParametro;
    }

    // metodos = funcionalidades, que puede hacer el jugador
}
