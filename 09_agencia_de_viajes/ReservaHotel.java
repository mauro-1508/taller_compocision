public class ReservaHotel {
    private String nombre;
    private int habitaciones;
    private int duracion;
    private double costo;

    public ReservaHotel(String nombre, int habitaciones, int duracion, double costo) {
        this.nombre = nombre;
        this.habitaciones = habitaciones;
        this.duracion = duracion;
        this.costo = costo;
    }

    public void printInfo() {
        System.out.println("Reserva hotel: " + nombre + " - Habitaciones: " + habitaciones);
    }
}
