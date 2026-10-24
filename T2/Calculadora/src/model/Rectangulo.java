package model;

public class Rectangulo {
    private double base;
    private double altura;
    private double resultado;

    public Rectangulo (double base, double altura){
        this.altura = altura;
        this.base = base;
    }

    public Rectangulo (double base){
        this.base = base;
        this.altura = this.base;

    }

    public void arearectangulo (double base, double altura){
        this.base = base;
        this.altura=altura;
        this.resultado = this.base*this.altura;

    }

    public void areacuadrado (double base){
        this.base = base;
        this.resultado = Math.pow(this.base,2);

    }

    public double getResultado() {
        return resultado;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }


}

