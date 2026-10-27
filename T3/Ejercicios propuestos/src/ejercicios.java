import java.util.Scanner;

public class ejercicios {
    public void ejerciciosAdivinacion() {
        /*Crea un programa que genere un número aleatorio
         (entre 0 y 20) de entrada y lo guarde en una variable.
          El sistema irá pidiendo números al usuario hasta que coincida
          con el aleatorio generado (en caso de no coincidir mostrará
          el mensaje "Lo siento, intentalo de nuevo"). Cuando coincida
          el sistema deberá mostar el mensaje "Enhorabuena, has acertado
          el número en 5 intentos" (Adivina)
            Parte 2: Modifica el ejercicio anterior para que una vez adivinado el
            número el sistema muestre el siguiente mensaje: "Quieres volver a jugar (S/N)":
            - En caso de introducir N la aplicación se detendrá
            - En caso de introducir S la aplicación empezará de nuevo
           (generando un aleatorio, pidiendo números hasta acertar el generado, etc...)
           Cuando el usuario acierte el número generado se mostrará un mensaje diciendo
           si ha superado el record de intentos (si ha hecho menos intentos que las veces
            anteriores) (AdivinaRecord)
         */
        Scanner lector = new Scanner(System.in);
        String respuesta;
        int record = Integer.MAX_VALUE;
        do {
            int aleatorio = (int) (Math.random() * 21);
            System.out.println(aleatorio);
            int numero, intentos = 0;
            do {
                intentos++;
                System.out.println("Introduce el número a adivinar");
                numero = lector.nextInt();
             } while (aleatorio != numero);
            System.out.printf("Enhorabuena,has acertado %d intentos\n", intentos);
            if(intentos < record){
                System.out.println("Record alcanzado, nuevo record");
                record = intentos;
            }
            System.out.println("Quieres volver a jugar S/N");
            respuesta = lector.next();
            }while (respuesta.equalsIgnoreCase("s"));
        System.out.println("El record de los intentos " +record);
    }
    public void ejercicioBanco (){
        /*Desarrolla un programa que simule un cajero automático.
         El saldo inicial es 1000€. Usa un bucle do-while para mostrar
          un menú con opciones: 1=Consultar saldo, 2=Retirar dinero,
          3=Depositar dinero, 4=Salir.
          Usa switch para cada opción. Para retirar dinero,
          usa un bucle while para validar que no se retire
           más del saldo disponible (si intenta retirar más, debe volver a pedir
            la cantidad). Para depositar, valida que sea una cantidad positiva.
         */
        Scanner lector = new Scanner(System.in);
        cajero Cajero = new cajero();
        System.out.println("El saldo del cajero es de " +Cajero.getSaldo());
        int opcion;
        do{

        System.out.println("1.Consultar saldo");
        System.out.println("2.Retirar saldo");
        System.out.println("3.Ingresar saldo");
        System.out.println("4.Salir");
        System.out.println("Que quieres hacer");
        opcion = lector.nextInt();
            switch (opcion){
                case 1 -> System.out.println("El saldo actual es de " +Cajero.getSaldo());
                case 2 -> {
                    System.out.println("Cuanto dinero quieres retirar");
                    int dinero = lector.nextInt();
                    if (dinero <1 || dinero > Cajero.getSaldo()){
                        System.out.println("No se puede completar la operacion");
                    }else {
                        Cajero.retirarDInero(dinero);
                    }
                }
                case 3 -> {
                    System.out.println("Cuanto dinero quieres ingresar");
                    int dinero = lector.nextInt();
                    if (dinero <1){
                        System.out.println("No se puede completar la operacion");
                    }else{
                        Cajero.ingresarDInero(dinero);
                    }
                }
                case 4 -> System.out.println("Saliendo.....");
                default -> System.out.println("No se contempla");
            }
        }while (opcion!=4);
    }

    public void ejercicioSueldo (){
        /*Pedir 10 sueldos por consola y  mostrar su suma, media
        y cuantos hay mayores de 1000€.
        */
        Scanner lector = new Scanner (System.in);
        int sumatorio =0, mayores=0;
        for (int i = 0; i<10; i++){
            int sueldo;
            do{
                System.out.println("Ingresa el sueldo");
                sueldo = lector.nextInt();
            }while (sueldo <1);
            sumatorio+=sueldo;
            if (sueldo >1000){
                mayores++;
            }

        }
        double media = (float) sumatorio/10;
        System.out.printf("El salario medio es de %.2f\n",media);
        System.out.printf("El numero de salarios mayores que mil %d\n",mayores);
    };
}
