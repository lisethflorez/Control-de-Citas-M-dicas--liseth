
import java.util.List;

public class MedicoServicio {
    private MedicoRepositorio medicoRepositorio;

    public MedicoServicio(MedicoRepositorio medicoRepositorio) {
        this.medicoRepositorio = medicoRepositorio;
    }

    public void registrarMedico(Medico medico) {
        medicoRepositorio.crear(medico);
    }

    public List<Medico> obtenerMedicos() {
        return medicoRepositorio.obtenerTodos();
    }
}
