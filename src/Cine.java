import java.util.ArrayList;

public class Cine {
    ArrayList<Sala> salas;
    String nombre;
    ArrayList<Sala> disponibles;
    public Cine(String nombre){
        this.nombre=nombre;
        this.salas=new ArrayList<>();
        this.disponibles=new ArrayList<>();
    }
    public void addSala(Sala sala){
        salas.add(sala);
    }
    public String infocine(){
        String info="";
        info += "Nombre del cine:\t\t" + nombre + "\n";
        info += "Organización de salas:\t\t"+"\n";
        for (Sala sala:salas) {
            info += sala.InfoSala();
        }
        return info;
    }
}
