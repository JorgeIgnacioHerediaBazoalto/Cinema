import java.time.LocalDate;

public class Cliente extends Persona{
    String idClient;
    int puntos;

    public Cliente(String name, String nacionalidad, int id, LocalDate fechaNacimiento) {
        super(name, nacionalidad, id, fechaNacimiento);
        this.puntos = 0;
    }

    public void setIdClient(int numClient) {
        this.idClient = "CLI-" + numClient;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
