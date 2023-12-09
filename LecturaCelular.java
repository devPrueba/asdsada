import java.io.IOException;

public class LecturaCelular {
    public static void main(String args[]) throws IOException {
        Celular celular1 = new Celular("Juan", "Samsung 5-22", "12365448", 980);
        Celular.guardar(celular1);
        Celular celular2 = new Celular("Pedro", "Iphone 15", "14789245", 500);
        Celular.guardar(celular2);
        Celular celular3 = new Celular("Marla", "Honor 8", "781245369", 1400);
        Celular.guardar(celular3);

        Celular.mostrar();
    }
}

