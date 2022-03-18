import java.util.ArrayList;

public class Fila {
    String codigo;
    int capacidadfila;
    ArrayList<Butaca> butacas;
    ArrayList<Butaca> butacasdisponibles;
    public Fila(String codigo){
        this.codigo=codigo;
        this.butacas=new ArrayList<>();
        this.butacasdisponibles=new ArrayList<>();
    }
    public String getCodigo(){
        return codigo;
    }
    public String getInfoFila(){
        String info="";
        info += "Código de fila:\t\t" + getCodigo() + "\n";
        info += "Numero de butaca:\t\t" + "Disponibilidad:\t\t" + "\n";
        for (Butaca butaca:butacas) {
            info +=butaca.getNumero()+" ".repeat(23)+butaca.estaDisponible()+"\n";
        }
        return info;
    }
    public void setCapacidadfila(int capacidadfila) {
        this.capacidadfila = capacidadfila;
    }
    public void setButacas(ArrayList<Butaca> butacas) {
        this.butacas = butacas;
    }
    public void addButaca(Butaca butaca) {
        butacas.add(butaca);
    }

    public ArrayList<Butaca> getButacasdisponibles() {
        for (Butaca butaca:butacas) {
            if (butaca.estaDisponible()){
                butacasdisponibles.add(butaca);
            }
        }
        return butacasdisponibles;
    }
    public String infoButacasDisponibles(){
        String info="";
        ArrayList<Butaca> butacasdisponibles = getButacasdisponibles();
        if (butacasdisponibles.size()==0){
            info += "La fila "+codigo+" no tiene asientos disponibles";
        }
        else {
            info += "Codigo de fila: "+codigo+"\n";
            info += "Asientos disponibles: ";
            for (Butaca butaca:butacasdisponibles) {
                info += butaca.getNumero()+" ,";
            }
            info += "\n";
        }
        return info;
    }
}
