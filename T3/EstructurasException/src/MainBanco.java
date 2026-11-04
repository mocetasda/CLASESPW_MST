import controller.Banco;
import model.CuentaCorriente;

public class MainBanco {
    public static void main(String[] args) {

        Banco bbva = new Banco("BBVA"); // nombre bbva y cuenta corriente = null
        try {
            bbva.ingresarDinero(1000, 1111, "Borja");
        } catch (Exception e){
            System.out.println("No hay cuenta en el banco");
        }
        //CuentaCorriente c1 = new CuentaCorriente("Borja", 1000, 1111);
        //CuentaCorriente c2 = new CuentaCorriente("Maria", 500, 0000);
        //CuentaCorriente c4 = new CuentaCorriente("Monica");
        //CuentaCorriente c3 = new CuentaCorriente();
        //CuentaCorriente c5 = new CuentaCorriente("Roberto", 1);
        //bbva.darAltaCuenta(new CuentaCorriente("Borja", 1000));
        // cuenta [Borja, 1000, 1111]
        //bbva.darAltaCuenta(new CuentaCorriente("Maria"));
        // cuenta [Maria, 0, 12426 ]
    }
}




