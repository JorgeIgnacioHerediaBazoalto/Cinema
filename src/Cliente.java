import java.time.LocalDate;

public class Cliente {
    // Atributos
    protected int ANIOACTUAL = LocalDate.now().getYear();

    protected String name;
    protected String nacionalidad;
    protected int edad;
    protected int id;
    protected LocalDate fechaNacimiento;

    public Cliente(String name, String nacionalidad, int id, LocalDate fechaNacimiento){
        this.name = name;
        this.nacionalidad = nacionalidad;
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = ANIOACTUAL - fechaNacimiento.getYear();
    }

    public String getInfoClient() {
        String info = "";
        info += "Name:\t\t" + getName() + "\n";
        info += "Nacionalidad:\t" + getNacionalidad() + "\n";
        info += "ID\t\t" + getId() + "\n";
        info += "Edad:\t\t" + getEdad() + "\n";
        info += "Fecha de nacimiento:\t" + getFechaNacimiento() + "\n";

        return info;
    }

    public String getName() {
        return name;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}
