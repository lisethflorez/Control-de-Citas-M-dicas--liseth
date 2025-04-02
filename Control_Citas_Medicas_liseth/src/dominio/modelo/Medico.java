
public class Medico {
    private int id;
    private String nombre;
    private int especialidadId;
    private String horarioInicio;
    private String horarioFin;
    public Medico(int id, String nombre, int especialidadId, String horarioInicio, String horarioFin) {
        this.id = id;
        this.nombre = nombre;
        this.especialidadId = especialidadId;
        this.horarioInicio = horarioInicio;
        this.horarioFin = horarioFin;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEspecialidadId() {
        return especialidadId;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public int getId() {
        return id;
    }

    public String getHorarioFin() {
        return horarioFin;
    }

    // Constructor, getters y setters
}
