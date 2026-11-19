import java.util.Arrays;

public class Operaciones {

    private int  [] numeros;

    public Operaciones (){}
    public Operaciones (int lon){
        numeros = new int[lon];
    }

    public void rotarDer() {
        int aux = numeros[numeros.length - 1];
        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = aux;
    }

        public void rotarIzq() {
        int primero = numeros[0]; // primer elemento
        for (int i = 0; i < numeros.length - 1; i++) {
            numeros[i] = numeros[i + 1];
        }
        numeros[numeros.length - 1] = primero;
    }

    public void invertir() {
        for (int i = 0; i < numeros.length / 2; i++) {
            int aux = numeros[i];
            numeros[i] = numeros[numeros.length-1-i];
            numeros[numeros.length-1-i] = aux;
        }
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
