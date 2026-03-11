import java.util.ArrayList;
import java.util.List;

public class Serie {
    private String nombre;
    private List<Temporada> temporadas;

    public Serie(String nombre) {
        this.nombre = nombre;
        this.temporadas = new ArrayList<>();
    }

    // Composición: las temporadas pertenecen a la serie.
    public void crearTemporada(String nombre) {
        temporadas.add(new Temporada(nombre));
    }

    public Temporada getTemporada(int index) {
        return temporadas.get(index);
    }

    public void printInfo() {
        System.out.println("Serie: " + nombre + " - Temporadas: " + temporadas.size());
    }
}
