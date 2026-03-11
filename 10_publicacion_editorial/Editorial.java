import java.util.ArrayList;
import java.util.List;

public class Editorial {
    private String nombre;
    private List<Autor> autores;

    public Editorial(String nombre) {
        this.nombre = nombre;
        this.autores = new ArrayList<>();
    }

    // Agregación: el autor existe fuera de la editorial y luego se registra.
    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }

    public void printInfo() {
        System.out.println("Editorial: " + nombre + " - Autores: " + autores.size());
    }
}
