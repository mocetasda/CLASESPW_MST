import java.util.Arrays;
import java.util.Scanner;

public class EjercicioBonoloto {
    public static void main(String[] args) {
        // [1,23,56,98,423] -> cartón sistema
        // TODO -> pedir al usuario 5 números y comprobar cuantos
        // han sido acertados (numero y posición)
        // [1,15,23,458,423] -> cartón del sistema
        int [] cartonSistema = new int [5];
        for (int i=0; i<cartonSistema.length; i++){
            int aleatorio =0;
            do {
                aleatorio = (int) (Math.random()*10)+1;
            }while (estaNumero(aleatorio,cartonSistema));
            cartonSistema[i]=aleatorio;
        }
        System.out.println("Carton del sistema " +Arrays.toString(cartonSistema));

        int [] cartonUsuario = new int [5];
        try (Scanner scanner = new Scanner(System.in)){

            //los numeros no se pueden repetir / no se indicar numeros menores q 1 y mayores q 10
            for (int i=0; i< cartonUsuario.length;i++){
                int numeroUsuario;
                do {
                    System.out.println("Introducto numero " +(i+1));
                    numeroUsuario = scanner.nextInt();
                }while (estaNumero(numeroUsuario,cartonUsuario) || numeroUsuario>10 || numeroUsuario <1);
                cartonUsuario[i] = numeroUsuario;
            }
            System.out.println("Carton del usuario " +Arrays.toString(cartonUsuario));

            int aciertos = 0;
            for (int i=0; i< cartonUsuario.length;i++){
                /*if (cartonUsuario [i] == cartonSistema [i]) {
                    aciertos++;
                }*/
                //operador ternario (? :), que es una forma abreviada de escribir un if-else.
                aciertos = cartonUsuario [i] == cartonSistema[i] ? aciertos+1 : aciertos;
            }
            System.out.println("El numero de aciertos es " +aciertos);
        } catch (Exception e) {
            System.out.println("Error en el tratamiento I/O");;
        }
    }

    public static boolean estaNumero (int numero, int [] carton){
        for (int item:carton){
            if(numero==item){
                //System.out.println("repetido el número" +numero);
                return true;
            }
        }
        return false;

    }
}
