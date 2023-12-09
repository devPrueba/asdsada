public class Main {
    public static void main(String[] args) {
        // Primera instancia
        Asignacion a1 = new Asignacion();
        a1.registrar("Pedro", 123, "Laboratorio Inti");
        System.out.println("Detalles: ");
        a1.mostrar();
        System.out.println("-------------------");

        // Segunda instancia
        Asignacion a2 = new Asignacion();
        a2.registrar("Maria ", 456, "Laboratorio VITA");
        System.out.println("Detalles: ");
        a2.mostrar();
    }
}
