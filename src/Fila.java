import java.util.ArrayList;

public class Fila {
    String codigofila;
    ArrayList<Butaca>butacas;
    public Fila(String codigo){
        this.codigofila=codigo;
        this.butacas=new ArrayList<>();
    }

    public String getCodigofila() {
        return codigofila;
    }

    public ArrayList<Butaca> getButacas() {
        return butacas;
    }
    public void addbutaca(Butaca butaca){
        butacas.add(butaca);
    }

    public String infoFila(){
        StringBuilder info= new StringBuilder();
        info.append("Código de fila ").append(getCodigofila()).append("\n");
        info.append("Numero de butaca\t\tDisponibilidad\n");
        for (Butaca butaca:getButacas()) {
            info.append(butaca.getNumero()).append("\t\t\t\t\t\t").append(butaca.estaDisponible()).append("\n");
        }
        return info.toString();
    }
}
