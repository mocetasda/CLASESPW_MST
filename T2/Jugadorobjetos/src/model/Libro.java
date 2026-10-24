package model;

public class Libro {
    public String titulo, autor;
    public int paginas;

    public Libro (){
        this.titulo ="sin título";
        this.autor ="autor desconocido";
        this.paginas =0;
    }

    public Libro (String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
}
