import Utils.BancoException;
import controller.Banco;
import model.CuentaCorriente;

import java.util.Scanner;

public class MainBanco {
    public static void main(String[] args) {
        Banco bbva = new Banco(); // nombre bbva y cuenta corriente = null
        Scanner scanner = new Scanner(System.in);
        bbva.darAltaCuenta(new CuentaCorriente("Sanchez", 1000, 1111));
        /*try {
            bbva.ingresarDinero(1000, 1111, "Borja");
        } catch (Exception e){
            System.out.println("No hay cuenta en el banco");
        }
        /*
        //CuentaCorriente c1 = new CuentaCorriente("Borja", 1000, 1111);
        //CuentaCorriente c2 = new CuentaCorriente("Maria", 500, 0000);
        //CuentaCorriente c4 = new CuentaCorriente("Monica");
        //CuentaCorriente c3 = new CuentaCorriente();
        //CuentaCorriente c5 = new CuentaCorriente("Roberto", 1);
        //bbva.darAltaCuenta(new CuentaCorriente("Borja", 1000));
        // cuenta [Borja, 1000, 1111]
        //bbva.darAltaCuenta(new CuentaCorriente("Maria"));
        // cuenta [Maria, 0, 12426 ]*/
        // tienes tres intentos para ingresar dinero
        int intentos = 3;

        do {
            try {
                System.out.println("Dime el titular");
                String titular = scanner.next();
                System.out.println("Dime el pin de la cuenta");
                int pin = scanner.nextInt();
                System.out.println("Dime el monto de retiro");
                double saldo = scanner.nextInt();
                bbva.retirarSaldo(saldo, pin, titular);
                break;
            } catch (BancoException e) {
                System.out.println(e.getMessage());;
                intentos --;
                //System.out.println("Te queda un intento menos");
            }
        } while (intentos>0);
        System.out.println("La cuenta tien un saldo de " + bbva.getCuenta().getSaldo());
    }
}




