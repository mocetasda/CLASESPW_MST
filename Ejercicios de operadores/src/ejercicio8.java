import java.util.Arrays;
import java.util.Scanner;

public class ejercicio8 {
    public static void main (String[] args){
        final double FACTORCORRECTOR = 273.15;
        Scanner lector = new Scanner(System.in);

        System.out.println("Cantidad de grados C a pasar");
        double gradosC = lector.nextDouble();
        double gradosF = (9*gradosC/5)+32;
        double gradosK = gradosC+FACTORCORRECTOR;
        System.out.println("Las conversiones de C son");
        System.out.printf("%.2f°C equivalen a %.2f°F y %.2f°K\n",gradosC,gradosF,gradosK);

        System.out.println("Cantidad de grados F a pasar");
        gradosF = lector.nextDouble();
        gradosC = (5*(gradosF-32))/9;
        gradosK = gradosC+FACTORCORRECTOR;
             System.out.println("Las conversiones de F son");
        System.out.printf("%.2f°F equivalen a %.2f°C y %.2f°K\n",gradosF,gradosC,gradosK);

        System.out.println("Cantidad de grados K a pasar");
        gradosK = lector.nextDouble();
        lector.close();

        gradosC = gradosK - FACTORCORRECTOR;
        gradosF = (9*(gradosC)/5)+32;
        System.out.println("Las conversiones de K son");
        System.out.printf("%.2f°K equivalen a %.2f°C y %.2f°F",gradosK,gradosC,gradosF);




    }
}
