import java.util.ArrayList;

public class Sala {
    String numerosala;
    Pelicula pelicula;
    ArrayList<Fila> capacidad;
    ArrayList<Fila> disponibles;
    int numerobutacas;
    public Sala(String numerosala,Pelicula pelicula){
        this.numerosala=numerosala;
        this.pelicula=pelicula;
        this.capacidad=new ArrayList<>();
        this.disponibles=new ArrayList<>();
    }
    public Pelicula getPelicula() {
        return pelicula;
    }
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    public void setCapacidad(ArrayList<Fila> capacidad) {
        this.capacidad = capacidad;
    }
    public String getNumerosala() {
        return numerosala;
    }
    public ArrayList<Fila> getCapacidad() {
        return capacidad;
    }
    public String InfoSala(){
        for (Fila fila:capacidad) {
            for (Butaca butaca: fila.butacas) {
                numerobutacas=numerobutacas+1;
            }
        }
        String info="";
        info += "Número de Sala:\t\t" + getNumerosala() + "\n";
        info += "Capacidad de sala:\t\t" + numerobutacas+" butacas" + "\n";
        info += "Organización de sala:\t\t" + "\n";
        for (Fila fila:capacidad) {
            info+=fila.getInfoFila();
        }
        return info;
    }
    public void setFilas(ArrayList<Fila> filas) {
        this.capacidad=capacidad;
    }
    public void addFila(Fila fila) {
        capacidad.add(fila);
    }
    public String infoFilasDisponibles(){
        String info="";
        ArrayList<Fila> filasdisponibles= getFilasDisponibles();
        if (filasdisponibles.size()>0){
            info += "La sala "+numerosala+" no tiene asientos disponibles";
        }
        else {
            info += "Número de Sala:\t\t" + getNumerosala() + "\n";
            for (Fila fila:capacidad) {
                info += " ".repeat(5)+fila.infoButacasDisponibles();
            }
        }
        return info;
    }
    public ArrayList<Fila> getFilasDisponibles(){
        for (Fila fila:capacidad) {
            if (fila.butacasdisponibles.size()>0){
                disponibles.add(fila);
            }
        }
        return disponibles;
    }
}
