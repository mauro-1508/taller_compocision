public class Main {
    public static void main(String[] args) {
        Guardia guardia = new Guardia("G01", "Andres");
        Servicio servicio = new Servicio("2026-03-10", 30, "Banco Central");
        servicio.crearTurno("06:00", "14:00");

        Compania compania = new Compania("Proteccion Total");
        compania.agregarServicio(servicio);

        guardia.printInfo();
        servicio.printInfo();
        compania.printInfo();
    }
}
