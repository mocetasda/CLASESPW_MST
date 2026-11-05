package controller;

import Utils.BancoException;
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
    public void retirarSaldo (double saldoretiro, int pin, String titular) throws BancoException{
        try {

        if (cuenta.getTitular().equalsIgnoreCase(titular) && cuenta.getPin() == pin ) {
            if(saldoretiro> cuenta.getSaldo()){
                throw new BancoException("Saldo insuficente");
            }

            //sacaras dinero
            cuenta.setSaldo(cuenta.getSaldo()-saldoretiro);
            System.out.println("Ingreso valido");
            //System.out.println("");
        } else {
            throw new BancoException("Error de validación");
        }
        }catch (NullPointerException e){
            System.out.println("No hay cuenta asociada en el banco");
        }
    }
    public void ingresarDinero(double SaldoIngreso, int pin, String titular) throws BancoException{
        // puendo ingresar el dinero -> coinciden el pin y el titular con lo que da
        try {
            if (cuenta.getTitular().equalsIgnoreCase(titular) && cuenta.getPin() == pin){
                //ingresar dinero
                cuenta.setSaldo(cuenta.getSaldo()+SaldoIngreso);
                System.out.println("Ingreso válido");
            }else{
               throw new BancoException ("Validación errónea");
            }
            // aviso que los datos no son datos
        } catch (NullPointerException e) {
            System.out.println("No hay cuenta asociada en el banco");
        }

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


