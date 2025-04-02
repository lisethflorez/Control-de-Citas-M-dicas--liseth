
import java.util.List;

public class PacienteServicio {
    private PacienteRepositorio pacienteRepositorio;

    public PacienteServicio(PacienteRepositorio pacienteRepositorio) {
        this.pacienteRepositorio = pacienteRepositorio;
    }

    public void registrarPaciente(Paciente paciente) {
        pacienteRepositorio.crear(paciente);
    }

    public List<Paciente> obtenerPacientes() {
        return pacienteRepositorio.obtenerTodos();
    }
}
