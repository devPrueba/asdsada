
import java.util.Scanner;

public class E1 {
    static Scanner scanner = new Scanner(System.in);

    private static int[][] generarMatriz(int n, int m) {
        int[][] matriz = new int[n][m];
        int currentValue = 1;

        for(int i=0; i<m; i++) {
            if(i%2 == 0) {
                // Columna par: llenar de arriba a abajo
                for(int j=0; j<n; j++) {
                    matriz[j][i] = currentValue++;
                }
            } else {
                // Columna impar: llenar de abajo a arriba
                for(int j=n-1; j>=0; j--) {
                    matriz[j][i] = currentValue++;
                }
            }
        }
        return matriz;
    }

    private static void mostrarMatriz(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Por favor, ingresa el número de filas (n):");
        int n = scanner.nextInt();
        System.out.println("Por favor, ingresa el número de columnas (m):");
        int m = scanner.nextInt();

        int[][] matrix = generarMatriz(n, m);
        mostrarMatriz(matrix);
    }
}