import java.util.ArrayList;
import java.util.List;

public class consultahistorial {
    private List<String> historialCitas;

    public consultahistorial() {
        this.historialCitas = new ArrayList<>();
    }

    // Método para agregar una cita al historial
    public void agregarCita(String cita) {
        historialCitas.add(cita);
    }

    // Método para obtener el historial de citas
    public List<String> obtenerHistorial() {
        return historialCitas;
    }

    // Método para mostrar el historial de citas
    public void mostrarHistorial() {
        if (historialCitas.isEmpty()) {
            System.out.println("No hay citas en el historial.");
        } else {
            System.out.println("Historial de citas:");
            for (String cita : historialCitas) {
                System.out.println("- " + cita);
            }
        }
    }
}
