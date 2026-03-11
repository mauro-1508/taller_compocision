public class Main {
    public static void main(String[] args) {
        Constructora constructora = new Constructora("Obras del Huila");
        Proyecto proyecto = new Proyecto("Torre Central", "Neiva", 500000000);
        Ingeniero ingeniero = new Ingeniero("Camilo", "ING01");

        proyecto.agregarIngeniero(ingeniero);
        proyecto.crearEtapa("Cimentacion");
        Etapa etapa = proyecto.getEtapa(0);
        etapa.crearActividad("Excavacion", 10);

        constructora.agregarProyecto(proyecto);

        constructora.printInfo();
        proyecto.printInfo();
        ingeniero.printInfo();
        etapa.printInfo();
    }
}
