import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        // Crear scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la dimensión de los vectores (un número entero):");
        int n = scanner.nextInt();

        int[] vectorA = new int[n];
        int[] vectorB = new int[n];
        int[] vectorC = new int[n];

        // Carga de datos en vectorA
        System.out.println("Introduce " + n + " números primos para el vector A:");
        for (int i = 0; i < n; i++) {
            vectorA[i] = obtenerPrimoDesdeTeclado(scanner);
        }

        // Carga de datos en vectorB
        System.out.println("Introduce " + n + " números primos para el vector B:");
        for (int i = 0; i < n; i++) {
            vectorB[i] = obtenerPrimoDesdeTeclado(scanner);
        }

        // Creación del vectorC a partir de vectorA y vectorB
        for (int i = 0; i < n; i++) {
            int ultimoDigitoA = vectorA[i] % 10;
            int ultimoDigitoB = vectorB[i] % 10;
            vectorC[i] = ultimoDigitoA * 10 + ultimoDigitoB;  // Combinamos los últimos dígitos de A y B
        }

        // Impresión del vectorC
        System.out.println("El vector C generado es:");
        for (int valor : vectorC) {
            System.out.print(valor + " ");
        }

        // No olvidar cerrar el scanner al final
        scanner.close();
    }

    private static int obtenerPrimoDesdeTeclado(Scanner scanner) {
        int numero;
        do {
            System.out.println("Introduce un número primo:");
            numero = scanner.nextInt();
        } while (!esPrimo(numero));
        return numero;
    }

    private static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}