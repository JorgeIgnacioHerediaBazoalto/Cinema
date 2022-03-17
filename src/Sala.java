import java.util.ArrayList;

public class Sala {
    String numerosala;
    Pelicula pelicula;
    ArrayList<Fila> capacidad;
    int numerofilas;
    public Sala(String numerosala,Pelicula pelicula,ArrayList<Fila> capacidad,int numerofilas){
        this.numerosala=numerosala;
        this.pelicula=pelicula;
        this.capacidad=capacidad;
        this.numerofilas=numerofilas;
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
    public String getInfoSala(){
        String info="";
        info += "Número de Sala:\t\t" + getNumerosala() + "\n";
        info += "Capacidad de sala:\t\t" + getCapacidad() + "\n";
        info += "Organización de sala:\t\t" + "\n";
        for (Fila fila:capacidad) {
            info+=fila.getInfoFila();
        }
        return info;
    }
    public void setFilas(ArrayList<Fila> filas) {
        if (capacidad.size()<=numerofilas){
            this.capacidad=capacidad;
        }
        else {return;}
    }
    public void addFila(Fila fila) {
        if (capacidad.size()<=numerofilas){
            capacidad.add(fila);
        }
        else {return;}
    }
}
