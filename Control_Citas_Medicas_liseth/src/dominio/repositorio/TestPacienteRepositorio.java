public class TestPacienteRepositorio {
    public static void main(String[] args) {
        // Crear una instancia del repositorio
        PacienteRepositorioImpl repo = new PacienteRepositorioImpl();

        // Crear un paciente
        Paciente nuevoPaciente = new Paciente(0, "Juan Pérez", "Av. Siempre Viva", "123456789", "juan@mail.com");
        repo.crear(nuevoPaciente);
        System.out.println("Paciente creado: " + nuevoPaciente.getNombre());

        // Obtener lista de pacientes
        System.out.println("Lista de pacientes:");
        for (Paciente p : repo.obtenerTodos()) {
            System.out.println(p.getId() + " - " + p.getNombre());
        }

        // Buscar un paciente por ID
        int idBusqueda = 0; // Cambiar según el ID que desees buscar
        Paciente pacienteEncontrado = repo.obtenerPorId(idBusqueda);
        if (pacienteEncontrado != null) {
            System.out.println("Paciente encontrado: " + pacienteEncontrado.getNombre());
        } else {
            System.out.println("Paciente con ID " + idBusqueda + " no encontrado.");
        }

        // Actualizar un paciente
        nuevoPaciente.setNombre("Juan Actualizado");
        repo.actualizar(nuevoPaciente);
        System.out.println("Paciente actualizado: " + nuevoPaciente.getNombre());

        // Eliminar un paciente
        repo.eliminar(nuevoPaciente.getId());
        System.out.println("Paciente eliminado con ID: " + nuevoPaciente.getId());
    }
}

