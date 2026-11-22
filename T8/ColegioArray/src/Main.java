import controller.Colegio;
import model.Alumno;
import util.NotaException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Alumno a = new Alumno();
        Alumno alumno = new Alumno("Borja", "1234A"); // Borja 1234A -1
        Alumno alumno1 = new Alumno("Marta", "1234B"); // Marta 1234B-1
        alumno.mostrarDatos();*/
        // alumno.setNota(100);

        Colegio inmaculada = new Colegio("inmaculada"); // lista alumnos =5
        //Colegio asuncion = new Colegio ("Asunción",100);
        //inmaculada.listaAlumnos();
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Menú de ejecución");
            int opcion;
            do{
                System.out.println("1.Agregar");
                System.out.println("2.Expulsar");
                System.out.println("3.Calificar");
                System.out.println("4.Mostrar");
                System.out.println("5.Buscar");
                System.out.println("6.Ordenar");
                System.out.println("7.Salir");
                System.out.println("Dime qué quieres hacer");
                opcion = scanner.nextInt();
                switch (opcion){
                    case 1 ->{
                        System.out.println("Indica el nombre");
                        String nombre = scanner.next();
                        System.out.println("Indica el dni");
                        String dni = scanner.next();
                        Alumno alumno = new Alumno(nombre, dni);
                        if(inmaculada.inscribirAlumno(alumno)){
                            System.out.println("Agregado correctamente");
                        }else{
                            System.out.println("Fallo en inserción");
                        };
                    }
                    case 2 ->{
                        System.out.println("Indica el dni del alumno a expulsar");
                        String dni = scanner.next();
                        if (inmaculada.expulsarAlumno(dni)){
                            System.out.println("Expulsado");
                        }else{
                            System.out.println("No se ha podido expulsar");
                        };
                    }
                    case 3 ->{
                        System.out.println("Indica el dni del alumno a calificar");
                        String dni = scanner.next();
                        boolean fallo = false;
                        do {
                            System.out.println("Indica la nota a registrar");
                            double nota = scanner.nextDouble();
                            try {
                                if (inmaculada.calificarAlumno(dni, nota)){
                                    System.out.println("Calificado correctamente");
                                    fallo = false;
                                }else {
                                    System.out.println("No encontrado");
                                }
                            } catch (NotaException e) {
                                System.out.println(e.getMessage());
                                fallo = true;
                            }
                        }while (fallo);

                    }
                    case 4 ->{
                        inmaculada.mostrarDatos();
                        inmaculada.listaAlumnos();
                    }
                    case 5 -> {
                        System.out.println("Indica el dni que quiere buscar");
                        String dni = scanner.next();
                        Alumno encontrado = inmaculada.buscarAlumno(dni);
                        if (encontrado == null){
                            System.out.println("El dni no se encuentra en la lista");
                        }else{
                            encontrado.mostrarDatos();
                        }

                    }
                    case 6 -> {
                        // TODO ordenar por notas -> mayor a menor
                        // Arrays.sort(); // un array numeros -> numericamente
                        // un array string -> alfabeticamente
                        Arrays.sort(inmaculada.getListaAlumnos(), new Comparator<Alumno>() {
                            // TODO este metodo se ejecuta por pares -> Bubble sort
                            @Override
                            public int compare(Alumno o1, Alumno o2) {
                                // TODO solo se retorma 1 o -1 (orden de ordenacion)
                                return 0;
                            }
                        });

                    }


                }

            }while (opcion!= 7);
        }
      }
}
