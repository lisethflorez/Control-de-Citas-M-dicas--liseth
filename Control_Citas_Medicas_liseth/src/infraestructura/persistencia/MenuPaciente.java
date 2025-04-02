
import java.util.List;
import java.util.Scanner;

public class MenuPaciente {

    private static final PacienteRepositorioImpl repositorio = new PacienteRepositorioImpl();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- Menú Paciente ---");
            System.out.println("1. Crear paciente");
            System.out.println("2. Obtener paciente por ID");
            System.out.println("3. Obtener todos los pacientes");
            System.out.println("4. Actualizar paciente");
            System.out.println("5. Eliminar paciente");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1 -> crearPaciente();
                case 2 -> obtenerPacientePorId();
                case 3 -> obtenerTodosLosPacientes();
                case 4 -> actualizarPaciente();
                case 5 -> eliminarPaciente();
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);
    }

    private static <repositorio> void crearPaciente() {
        System.out.println("\n--- Crear Paciente ---");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Paciente paciente = new Paciente(0, nombre, direccion, telefono, email);
        repositorio.crear(paciente);
        System.out.println("Paciente creado exitosamente.");
    }

    private static <repositorio> void obtenerPacientePorId() {
        System.out.println("\n--- Obtener Paciente por ID ---");
        System.out.print("Ingrese el ID del paciente: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Paciente paciente = repositorio.obtenerPorId(id);
        if (paciente != null) {
            System.out.println("Paciente encontrado: " + paciente);
        } else {
            System.out.println("No se encontró un paciente con el ID proporcionado.");
        }
    }

    private static void obtenerTodosLosPacientes() {
        System.out.println("\n--- Obtener Todos los Pacientes ---");
        List<Paciente> pacientes = repositorio.obtenerTodos();
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
        } else {
            pacientes.forEach(System.out::println);
        }
    }

    private static void actualizarPaciente() {
        System.out.println("\n--- Actualizar Paciente ---");
        System.out.print("Ingrese el ID del paciente a actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Paciente pacienteExistente = repositorio.obtenerPorId(id);
        if (pacienteExistente == null) {
            System.out.println("No se encontró un paciente con el ID proporcionado.");
            return;
        }

        System.out.print("Nuevo nombre (actual: " + pacienteExistente.getNombre() + "): ");
        String nombre = scanner.nextLine();
        System.out.print("Nueva dirección (actual: " + pacienteExistente.getDireccion() + "): ");
        String direccion = scanner.nextLine();
        System.out.print("Nuevo teléfono (actual: " + pacienteExistente.getTelefono() + "): ");
        String telefono = scanner.nextLine();
        System.out.print("Nuevo email (actual: " + pacienteExistente.getEmail() + "): ");
        String email = scanner.nextLine();

        Paciente pacienteActualizado = new Paciente(id, nombre, direccion, telefono, email);
        repositorio.actualizar(pacienteActualizado);
        System.out.println("Paciente actualizado exitosamente.");
    }

    private static <repositorio> void eliminarPaciente() {
        System.out.println("\n--- Eliminar Paciente ---");
        System.out.print("Ingrese el ID del paciente a eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        repositorio.eliminar(id);
        System.out.println("Paciente eliminado exitosamente.");
    }
}


