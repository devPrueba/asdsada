import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Celular {
    String nombreCliente;
    String modeloCelular;
    String imei;
    double precio;
    static String rutaArchivo = "celular.txt";

    public Celular(String nombreCliente, String modeloCelular, String imei, double precio) {
        this.nombreCliente = nombreCliente;
        this.modeloCelular = modeloCelular;
        this.imei = imei;
        this.precio = precio;
    }

    // Metodo para convertir los datos a cadena
    public String aCadena() {
        return nombreCliente + ", " + modeloCelular + ", " + imei + ", " + precio + ",\n";
    }
    public static void guardar(Celular celular) throws IOException {
        FileOutputStream salida = null;

        try {
            salida = new FileOutputStream(rutaArchivo, true);
            byte bytes[] = celular.aCadena().getBytes();

            for (byte b : bytes) {
                salida.write(b);
            }

            System.out.println("Datos escritos en el archivo.");
        } finally {
            if (salida != null) {
                salida.close();
            }
        }
    }

    // Metodo para leer el archivo y mostrar informacion
    public static void mostrar() throws IOException {
        FileInputStream entrada = null;

        try {
            entrada = new FileInputStream(rutaArchivo);
            int caracter;
            StringBuilder cadena = new StringBuilder();

            while ((caracter = entrada.read()) != -1) {
                cadena.append((char) caracter);
            }

            System.out.println(cadena.toString());

        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
    }
}
