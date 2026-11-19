import java.util.Arrays;

public class Operaciones {

    private int  [] numeros;

    public Operaciones (){}
    public Operaciones (int lon){
        numeros = new int[lon];
    }

    public void ordenar (){
        // TODO 3 -> invesigar los algoritmos de ordenacion existentes -> buble sort
        Arrays.sort(numeros);
    }
    public void modificar (int numeroBuscar, int modificar){
        for (int i=0; i< numeros.length; i++){
            if (numeros[i]==numeroBuscar){
                numeros [i] = modificar;
            }
        }
    }
    public boolean buscar (int numero){
        for (int item: numeros){
            if (item == numero){
                return true;
            }
        }
        return false;
    }
    public void mostrar (){
        System.out.println(Arrays.toString(numeros));
    }
    public void rellenar(){
        for (int i=0; i< numeros.length;i++){
            int aleatorio;
            do {
                aleatorio =(int) (Math.random() * 10);
            }while (buscar (aleatorio));
            numeros[i] = aleatorio;
        }
    }




    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

}
