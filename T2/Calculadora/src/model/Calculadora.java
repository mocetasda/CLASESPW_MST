package model;

public class Calculadora {
    // atributos
    // operador 1, operador2, tipo de operaciones, resultado
    private int operando1, operando2;
    private double resultado;
    private String tipo;

    // construcotres : el vacio lo tengo por defecto.

    public Calculadora (){}

    public void sumar (int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = this.operando1 + this.operando2;
        this.tipo ="suma";
        System.out.println("Suma terminada");
    }

    // sobrecarga
    /*public double sumar (int operando1, int operando2, int operando3){
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = this.operando1 + this.operando2 + operando3;
        this.tipo ="suma";
        System.out.println("Suma terminada");
        return resultado;
    }*/
    public void resta (int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = this.operando1 - this.operando2;
        this.tipo ="resta";
        System.out.println("Resta terminada");
    }

    public void multiplicacion (int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = this.operando1 * this.operando2;
        this.tipo ="multiplicacion";
        System.out.println("Multiplicacion terminada");
    }

    public void division (int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = (double)this.operando1 / this.operando2;
        this.tipo ="división";
        System.out.println("División terminada");
    }
    public void modulo (int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = this.operando1 % this.operando2;
        this.tipo ="modulo";
        System.out.println("Modulo terminada");
    }


// metodos

    public double getResultado() {
        return resultado;
    }

    public String getTipo() {
        return tipo;
    }


}
