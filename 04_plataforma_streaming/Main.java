public class Main {
    public static void main(String[] args) {
        Suscripcion suscripcion = new Suscripcion("Premium", 29900, "Pantallas simultaneas");
        Usuario usuario = new Usuario("Maria", "1234", suscripcion);

        Serie serie = new Serie("Codigo Azul");
        serie.crearTemporada("Temporada 1");
        Temporada temporada1 = serie.getTemporada(0);
        temporada1.crearCapitulo("Capitulo 1", 45);

        usuario.printInfo();
        serie.printInfo();
        temporada1.printInfo();
    }
}
