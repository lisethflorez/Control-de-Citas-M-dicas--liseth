
import java.util.List;

public class PacienteControlador {
    private PacienteServicio pacienteServicio;

    public PacienteControlador(PacienteServicio pacienteServicio) {
        this.pacienteServicio = pacienteServicio;
    }

    public List<Paciente> obtenerPacientes() {
        return pacienteServicio.obtenerPacientes();
    }
}
