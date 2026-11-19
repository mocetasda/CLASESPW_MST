import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //numeros = [0,0,0,0,0]

        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("De qué cantidad es el array de los numeros");
            int cantidad = scanner.nextInt();
            Operaciones operaciones = new Operaciones(cantidad);
            // si coloco la cantidad de 6, numeros =[0,0,0,0,0,0]
            int opcion = 0;
            do{
                System.out.println("1. Rellenar datos");
                System.out.println("2. Mostrar datos");
                System.out.println("3. Buscar datos");
                System.out.println("4. Modificar datos");
                System.out.println("5. Rotar datos");
                System.out.println("6. Invertir datos");
                System.out.println("7. Ordenar datos");
                System.out.println("8. Salir");
                System.out.println("Indica que quieres hacer");
                opcion = scanner.nextInt();
                switch (opcion){
                    case 1-> operaciones.rellenar();
                    case 2-> operaciones.mostrar();
                    case 3-> {
                        System.out.println("Indica un numero a buscar");
                        int numeroBuscar = scanner.nextInt();
                        System.out.println("La busqueda tiene como resultado "+operaciones.buscar(numeroBuscar));
                    }
                    case 4-> {
                        System.out.println("Indícame que número quieres modificar");
                        int numeroBuscar = scanner.nextInt();
                        if (operaciones.buscar(numeroBuscar)){
                            int numeroCambiar;
                            do{
                                System.out.println("Indicame el número a cambiar");
                                numeroCambiar= scanner.nextInt();
                            } while (operaciones.buscar(numeroCambiar));
                            operaciones.modificar(numeroBuscar,numeroCambiar);
                        }else {
                            System.out.println("El número no se encuentra en el array");
                        }
                    }
                    case 5-> {
                    }
                    case 7-> operaciones.ordenar();
                    case 8-> System.out.println("Saliendo...");
                }
            }while (opcion != 8);

        } catch (Exception e) {
            System.out.println("Error en las IO");
        }
    }
}
