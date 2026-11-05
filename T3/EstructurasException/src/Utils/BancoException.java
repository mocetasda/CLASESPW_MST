package Utils;

public class BancoException extends Exception{
    // heredado de Exception -> tengo todas las características yfuncionalidades de la clase padres
    // constructores => solo tengo el por defecto, si quieres el de la calase padre lo pides

    public BancoException(){}

    public BancoException (String data){
        // llamada al constructor de la clase padre
        super (data);
        //System.out.println("Cosas nuevas de la clase BancoException");


    }



}
