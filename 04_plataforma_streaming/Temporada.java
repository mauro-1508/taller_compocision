import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private String nombre;
    private List<Capitulo> capitulos;

    public Temporada(String nombre) {
        this.nombre = nombre;
        this.capitulos = new ArrayList<>();
    }

    // Composición: los capítulos pertenecen a la temporada.
    public void crearCapitulo(String nombre, int duracion) {
        capitulos.add(new Capitulo(nombre, duracion));
    }

    public void printInfo() {
        System.out.println("Temporada: " + nombre + " - Capitulos: " + capitulos.size());
    }
}
