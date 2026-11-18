import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        /* Desarrolla un programa que pida al usuario cuántos estudiantes hay en una clase. Crea un array
         para almacenar sus calificaciones (0-10). Usa un bucle while para rellenar el array con las notas.
         Luego, usa un bucle for para:
            1. Mostrar todas las calificaciones
            2. Calcular el promedio de la clase
            3. Contar cuántos estudiantes aprobaron (nota ≥ 5)
            4. Encontrar la nota más alta y la más baja
         */

        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Cuantos estuadiantes hay en clase");
            int nEstudiantes = scanner.nextInt(); //5
            int [] calificaciones = new int [nEstudiantes];// [0,0,0,0,0]
            int posicion = 0;
            for (int i=0; i<calificaciones.length;i++){
                System.out.println("Introduce la calificacion del estudiante" + (i+1));
                calificaciones [i] = scanner.nextInt();
            }
            /*for (int item: calificaciones){
                System.out.print(item + " ");
            }
            for (int i=0;i< calificaciones.length;i++){
                System.out.print(calificaciones[i]);
            }*/
            System.out.println(Arrays.toString(calificaciones));// imprime el contenido como string
            //System.out.println(calificaciones);// imprime la dirección de memoria
            // cierra los elementos definidos en el try ()
            int totalCalificaciones =0, nAprobados =0, nAlta = calificaciones [0], nBaja=calificaciones [0];
            for (int item:calificaciones){

                totalCalificaciones += item;
                //totalCalificaciones = totalCalificaciones + item;
                /*if (item>=5){
                    nAprobados++;
                }*/
                nAprobados = item>=5 ? nAprobados+1 : nAprobados;
                /*if (item>nAlta){
                    nAlta=item;
                }
                if (item<nBaja){
                    nBaja=item;
                }*/
                nAlta = item>nAlta ? item: nAlta;
                nBaja = item<nBaja ? item: nBaja;
                /* con arrrays
                nAlta = Arrays.stream(calificaciones).max().getAsInt();
                nBaja = Arrays.stream(calificaciones).min().getAsInt();
                */
            }
            //Arrays.stream(calificaciones).asDoubleStream().average().getAsDouble();
            System.out.println("La media de las calificaciones es de " + (double) totalCalificaciones/nEstudiantes);
            System.out.println("El numero de aprobados es de " +nAprobados);
            System.out.println("La calificación máximo es " + nAlta);
            System.out.println("La calificación mínima es " + nBaja);

        }catch (Exception e){
            System.out.println("Error en el programa");
        }
    }

}
