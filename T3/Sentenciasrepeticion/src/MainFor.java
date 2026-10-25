import java.sql.SQLOutput;
import java.util.Scanner;

public class MainFor {
    public static void main(String[] args) {
       /* for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                System.out.println("Ejecución numero " + (i));
            } else {
                System.out.println("Impar");
            }


        for (int i = 9; i>=0; i--) {
            System.out.println("Ejecucion "+i);
        }*/
        Scanner lector = new Scanner(System.in);
        //System.out.println("Indica el número para ver su tabla");
        //int numero = lector.nextInt();
        int numero = 10;
        int n1 = 7, n2=20;
        if (numero < 0) {
            System.out.println("Numero negativo, no se puede");
        } else {
            for (int i = n1; i <= n2; i++) {
                System.out.println("Tabla del " +i);{
                    for (int j=0; j < 11; j++){
                        System.out.printf("\tLa multiplicación del %d * %d = %d\n", i, j, i*j);
                    }
                }
                //System.out.printf("La multiplicación del %d * %d = %d\n", numero, i, numero * i);
            }

        }

    }
}