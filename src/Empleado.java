import java.time.LocalDate;

public class Empleado extends Persona{
    String idEmpleado;

    public Empleado(String name, String nacionalidad, int id, LocalDate fechaNacimiento) {
        super(name, nacionalidad, id, fechaNacimiento);
        setIdEmpleado();
    }

    public void setIdEmpleado() {
        this.idEmpleado = "EMP-" + contadorClient;
        super.contadorClient += 1;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }
}
