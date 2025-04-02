import java.util.Scanner;

public class MenuMedicoRepositorio {
    private static final MedicoRepositorioImpl medicoRepositorio = new MedicoRepositorioImpl();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) {
        int opcion;

        do {
            System.out.println("\n--- Menú de Gestión de Médicos ---");
            System.out.println("1. Crear médico");
            System.out.println("2. Obtener médico por ID");
            System.out.println("3. Listar todos los médicos");
            System.out.println("4. Actualizar médico");
            System.out.println("5. Eliminar médico");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    crearMedico();
                    break;
                case 2:
                    obtenerMedicoPorId();
                    break;
                case 3:
                    listarMedicos();
                    break;
                case 4:
                    actualizarMedico();
                    break;
                case 5:
                    eliminarMedico();
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 6);
    }

    private static void crearMedico() {
        System.out.print("Ingrese el nombre del médico: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el ID de la especialidad: ");
        int especialidadId = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el horario de inicio: ");
        String horarioInicio = scanner.nextLine();
        System.out.print("Ingrese el horario de fin: ");
        String horarioFin = scanner.nextLine();

        Medico nuevoMedico = new Medico(0, nombre, especialidadId, horarioInicio, horarioFin);
        medicoRepositorio.crear(nuevoMedico);
        System.out.println("Médico creado exitosamente.");
    }

    private static void obtenerMedicoPorId() {
        System.out.print("Ingrese el ID del médico: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        Medico medico = medicoRepositorio.obtenerPorId(id);
        if (medico != null) {
            System.out.println("Médico encontrado: " + medico);
        } else {
            System.out.println("No se encontró un médico con el ID proporcionado.");
        }
    }

    private static void listarMedicos() {
        System.out.println("Lista de médicos:");
        for (Medico medico : medicoRepositorio.listarTodos()) {
            System.out.println(medico);
        }
    }

    private static void actualizarMedico() {
        System.out.print("Ingrese el ID del médico a actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el nuevo nombre del médico: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el nuevo ID de la especialidad: ");
        int especialidadId = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el nuevo horario de inicio: ");
        String horarioInicio = scanner.nextLine();
        System.out.print("Ingrese el nuevo horario de fin: ");
        String horarioFin = scanner.nextLine();

        Medico medicoActualizado = new Medico(id, nombre, especialidadId, horarioInicio, horarioFin);
        medicoRepositorio.actualizar(medicoActualizado);
        System.out.println("Médico actualizado exitosamente.");
    }

    private static void eliminarMedico() {
        System.out.print("Ingrese el ID del médico a eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        medicoRepositorio.eliminar(id);
        System.out.println("Médico eliminado exitosamente.");
    }
}