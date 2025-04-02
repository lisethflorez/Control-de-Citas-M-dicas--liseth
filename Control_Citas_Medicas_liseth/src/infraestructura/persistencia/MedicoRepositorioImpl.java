import java.util.ArrayList;
import java.util.List;


public class MedicoRepositorioImpl {

    private List<Medico> medicos = new ArrayList<>();

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
        System.out.println("Médico agregado: " + medico);
    }

    public Medico obtenerPorId(int id) {
        for (Medico medico : medicos) {
            if (medico.getId() == id) {
                return medico;
            }
        }
        return null; // Retorna null si no se encuentra el médico
    }

    public Medico[] listarTodos() {
        return medicos.toArray(new Medico[0]);
    }

    public void crear(Medico nuevoMedico) {
        agregarMedico(nuevoMedico);
    }

    public void actualizar(Medico medicoActualizado) {
        for (int i = 0; i < medicos.size(); i++) {
            if (medicos.get(i).getId() == medicoActualizado.getId()) {
                medicos.set(i, medicoActualizado);
                System.out.println("Médico actualizado: " + medicoActualizado);
                return;
            }
        }
        System.out.println("Médico no encontrado para actualizar: " + medicoActualizado.getId());
    }

    public void eliminar(int id) {
        medicos.removeIf(medico -> medico.getId() == id);
        System.out.println("Médico eliminado con ID: " + id);
    }
}