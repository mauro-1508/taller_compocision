import java.util.ArrayList;
import java.util.List;

public class Rutina {
    private int duracion;
    private List<Ejercicio> ejercicios;

    public Rutina(int duracion) {
        this.duracion = duracion;
        this.ejercicios = new ArrayList<>();
    }

    // Composición: los ejercicios pertenecen a la rutina.
    public void crearEjercicio(String nombre, String maquina) {
        ejercicios.add(new Ejercicio(nombre, maquina));
    }

    public void printInfo() {
        System.out.println("Rutina: " + duracion + " min - Ejercicios: " + ejercicios.size());
    }
}
