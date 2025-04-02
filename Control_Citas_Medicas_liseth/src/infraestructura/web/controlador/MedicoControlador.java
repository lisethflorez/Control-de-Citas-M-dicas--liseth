
import java.util.List;

public class MedicoControlador {
    private MedicoServicio medicoServicio;

    public MedicoControlador(MedicoServicio medicoServicio) {
        this.medicoServicio = medicoServicio;
    }

    public List<Medico> obtenerMedicos() {
        return medicoServicio.obtenerMedicos();
    }
}
