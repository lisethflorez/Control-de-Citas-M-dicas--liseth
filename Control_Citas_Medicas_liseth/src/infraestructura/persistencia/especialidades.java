import java.util.ArrayList;
import java.util.List;

public class especialidades {
    private List<String> especialidades;

    public especialidades() {
        this.especialidades = new ArrayList<>();
    }

    // Método para registrar una nueva especialidad
    public void registrarEspecialidad(String especialidad) {
        if (!especialidades.contains(especialidad)) {
            especialidades.add(especialidad);
            System.out.println("Especialidad registrada: " + especialidad);
        } else {
            System.out.println("La especialidad ya está registrada.");
        }
    }

    // Método para consultar todas las especialidades
    public List<String> consultarEspecialidades() {
        return new ArrayList<>(especialidades);
    }
}
