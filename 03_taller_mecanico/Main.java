public class Main {
    public static void main(String[] args) {
        Propietario propietario = new Propietario("Luis", "1001");
        Vehiculo vehiculo = new Vehiculo("ABC123");
        propietario.agregarVehiculo(vehiculo);

        vehiculo.crearOrden("2026-03-07", "Cambio de aceite");
        Orden orden = vehiculo.getOrden(0);
        orden.agregarTrabajo("Revision general", 80000);

        Mecanico mecanico = new Mecanico("Pedro", "Orden 1");

        propietario.printInfo();
        vehiculo.printInfo();
        orden.printInfo();
        mecanico.printInfo();
    }
}
