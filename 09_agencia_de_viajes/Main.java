public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Sara", "Descuento VIP");
        Viaje viaje = new Viaje("Cartagena", "2026-06-15", 1800000, cliente);

        viaje.crearReservaHotel("Hotel Mar Azul", 1, 3, 600000);
        viaje.crearActividad("2026-06-16", "Tour por la ciudad");

        viaje.printInfo();
    }
}
