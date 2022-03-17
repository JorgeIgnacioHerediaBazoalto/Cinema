import java.util.ArrayList;

public class Fila {
    String codigo;
    ArrayList<Butaca> butacas;
    int capacidadfila;
    public Fila(String codigo){
        this.codigo=codigo;
        this.butacas=new ArrayList<>();
        this.capacidadfila=capacidadfila;
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
}
