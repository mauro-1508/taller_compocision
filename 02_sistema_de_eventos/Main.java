public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana", "Corporativo");
        Evento evento = new Evento("Lanzamiento", "2026-04-01", "Centro de Convenciones", cliente);

        Proveedor sonido = new Proveedor("AudioPro", "Sonido");
        evento.agregarProveedor(sonido);
        evento.crearActividad("08:00", 60, "Moderador");
        evento.crearActividad("09:00", 45, "Invitado principal");

        evento.printInfo();
        sonido.printInfo();
    }
}
