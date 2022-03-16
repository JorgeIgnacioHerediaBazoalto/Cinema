import java.time.LocalDate;

public class Cliente {
    // Atributos
    private int AÑOACTUAL = LocalDate.now().getDayOfYear();

    private String name;
    private String nacionalidad;
    private int edad;
    private int id;
    private LocalDate fechaNacimiento;

    public Cliente(String name, String nacionalidad, int id, LocalDate fechaNacimiento){
        this.name = name;
        this.nacionalidad = nacionalidad;
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = getAÑOACTUAL() - fechaNacimiento.getDayOfYear();
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
