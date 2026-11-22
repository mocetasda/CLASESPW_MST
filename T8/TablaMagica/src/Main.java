import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        boolean esMagica;
        do {
            // Generar matriz aleatoria
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    matriz[i][j] = (int) (Math.random() * 5);
                }

            }
            esMagica = true;
            // Suma de referencia (primera fila)
            int referencia = 0;
            for (int j = 0; j < 4; j++) {
                referencia += matriz[0][j];
            }
            // Comprobar filas
            for (int i = 1; i < 4; i++) {
                int sumaFila = 0;
                for (int j = 0; j < 4; j++) {
                    sumaFila += matriz[i][j];
                }
                if (sumaFila != referencia) {
                    esMagica = false;
                }
            }
            // Comprobar columnas
            for (int j = 0; j < 4; j++) {
                int sumaColumna = 0;
                for (int i = 0; i < 4; i++) {
                    sumaColumna += matriz[i][j];
                }
                if (sumaColumna != referencia) {
                    esMagica = false;
                }
            }
            // Comprobar diagonal principal
            int diagonalPrincipal = 0;
            for (int i = 0; i < 4; i++) {
                diagonalPrincipal += matriz[i][i];
            }
            if (diagonalPrincipal != referencia) {
                esMagica = false;
            }
            // Comprobar diagonal secundaria
            int diagonalSecundaria = 0;
            for (int i = 0; i < 4; i++) {
                diagonalSecundaria += matriz[i][3 - i];
            }
            if (diagonalSecundaria != referencia) {
                esMagica = false;
            }
        } while (!esMagica);
        System.out.println("CUADRADO MAGICO ENCONTRADO");
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        int suma = 0;
        for (int j = 0; j < 4; j++) {
            suma += matriz[0][j];
        }
        System.out.println("\nSuma = " + suma);
    }
}

