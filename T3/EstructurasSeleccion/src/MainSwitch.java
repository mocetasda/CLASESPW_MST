import java.util.Scanner;

public class MainSwitch {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el número que quieres evaluar");
        int numero = lector.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Variable con valor 1");
                break;
            case 2:
                System.out.println("Variable con valor 2");
                break;
            case 3:
                System.out.println("Variable con valor 3");
                break;
            case 4:
                System.out.println("Variable con valor 4");
                break;
            default:
                System.out.println("Variable no contemplada");
                break;
        }
    }
}
