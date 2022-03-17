import java.time.LocalDate;

public class Cliente extends Persona{
    String idClient;

    public Cliente(String name, String nacionalidad, int id, LocalDate fechaNacimiento) {
        super(name, nacionalidad, id, fechaNacimiento);
        setIdClient();
    }

    public void setIdClient() {
        this.idClient = "CLI-" + contadorClient;
        super.contadorClient += 1;
    }

    public String getIdClient() {
        return idClient;
    }
}
