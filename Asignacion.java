public class Asignacion {
    String nombre_auxiliar;
    int carnet;
    String nombre_laboratorio;

    // Metodo registrar
    public void registrar(String nombre_auxiliar, int carnet, String nombre_laboratorio) {
        this.nombre_auxiliar = nombre_auxiliar;
        this.carnet = carnet;
        this.nombre_laboratorio = nombre_laboratorio;
    }

    // Metodo mostrar
    public void mostrar() {
        System.out.println("Nombre: " + this.nombre_auxiliar);
        System.out.println("Camet: " + this.carnet);
        System.out.println("Nombre del laboratorio: " + this.nombre_laboratorio);
    }
}