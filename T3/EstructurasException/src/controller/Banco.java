package controller;

import model.CuentaCorriente;

public class Banco {
    // dirección, nomre, numeroEntidad, caja
    // lista de cuentas (usuario, dinero, pin)

    private CuentaCorriente cuenta;
    private String nombre;

    // constructores

    public Banco() {
    }

    public Banco(String nombre) {
        this.nombre = nombre;
    }
    // funcionalidades - > darAltaCuenta,ingresarDinero, sacarDinero, consultarSaldo, resetearPin, transferirSaldo

    public void darAltaCuenta(CuentaCorriente cuenta) {
        this.cuenta = cuenta;
    }

    public void ingresarDinero(double SaldoIngreso, int pin, String titular) throws Exception {
        // puendo ingresar el dinero -> coinciden el pin y el titular con lo que da
        // try {
        if (cuenta.getPin() == pin && cuenta.getTitular().equalsIgnoreCase(titular)) {
            //ingresar dinero
        } else {
            // aviso que los datos no son datos
        }
        //} catch (NullPointerException e) {
        // System.out.println("No hay cuenta en el banco dada de alta");
    }


    public CuentaCorriente getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaCorriente cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
