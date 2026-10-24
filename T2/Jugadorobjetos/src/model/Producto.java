package model;

public class Producto {
    public String nombre;
    public double precio;

    public Producto (String nombre){
        this.nombre = nombre;
    }
    public Producto (String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}
