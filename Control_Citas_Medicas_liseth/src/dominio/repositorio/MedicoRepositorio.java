
import java.util.List;

public interface MedicoRepositorio {
    void crear(Medico medico);
    Medico obtenerPorId(int id);
    List<Medico> obtenerTodos();
    void actualizar(Medico medico);
    void eliminar(int id);
}
