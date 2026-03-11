import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nombre;
    private List<Libro> libros;

    public Autor(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // Agregación: el libro puede existir y luego asociarse al autor.
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void printInfo() {
        System.out.println("Autor: " + nombre + " - Libros: " + libros.size());
    }
}
