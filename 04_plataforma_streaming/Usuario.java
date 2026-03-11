public class Usuario {
    private String nombre;
    private String contrasena;
    private Suscripcion suscripcion;

    public Usuario(String nombre, String contrasena, Suscripcion suscripcion) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.suscripcion = suscripcion;
    }

    // Agregación: la suscripción puede existir antes de asignarse al usuario.
    public void printInfo() {
        System.out.println("Usuario: " + nombre);
        suscripcion.printInfo();
    }
}
