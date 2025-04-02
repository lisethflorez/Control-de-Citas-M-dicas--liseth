import java.util.Scanner;

public class MenuCitasApp {
    public static void main(String[] args) {
        menucitas menuCitas = new menucitas();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Citas Médicas ---");
            System.out.println("1. Agendar cita");
            System.out.println("2. Modificar cita");
            System.out.println("3. Cancelar cita");
            System.out.println("4. Mostrar citas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del paciente: ");
                    String paciente = scanner.nextLine();
                    System.out.print("Ingrese el nombre del médico: ");
                    String medico = scanner.nextLine();
                    System.out.print("Ingrese la fecha (dd/mm/aaaa): ");
                    String fecha = scanner.nextLine();
                    System.out.print("Ingrese la hora (hh:mm): ");
                    String hora = scanner.nextLine();
                    menuCitas.agendarCita(paciente, medico, fecha, hora);
                    break;

                case 2:
                    System.out.print("Ingrese el ID de la cita a modificar: ");
                    int idModificar = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Ingrese la nueva fecha (dd/mm/aaaa): ");
                    String nuevaFecha = scanner.nextLine();
                    System.out.print("Ingrese la nueva hora (hh:mm): ");
                    String nuevaHora = scanner.nextLine();
                    menuCitas.modificarCita(idModificar, nuevaFecha, nuevaHora);
                    break;

                case 3:
                    System.out.print("Ingrese el ID de la cita a cancelar: ");
                    int idCancelar = scanner.nextInt();
                    menuCitas.cancelarCita(idCancelar);
                    break;

                case 4:
                    System.out.println("\n--- Lista de Citas ---");
                    menuCitas.mostrarCitas();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
