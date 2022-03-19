import java.util.ArrayList;
import java.util.Objects;

public class Cine {
    String nombre;
    Boleteria boleteria;
    ArrayList<Sala> salas;

    public Cine(String nombre){
        this.nombre = nombre;
        this.salas = new ArrayList<>();
        this.boleteria = null;
    }

    public Cine(String nombre, Boleteria boleteria) {
        this.nombre = nombre;
        this.salas = new ArrayList<>();
        this.boleteria = boleteria;
    }

    public ArrayList<Sala> getSalas() {return salas;}

    public void addSala(Sala sala){salas.add(sala);}

    public String getNombre() {return nombre;}

    public String infoCine(){
        StringBuilder info= new StringBuilder();
        info.append("Nombre del cine ").append(getNombre()).append("\n");
        for (Sala sala:salas) {
            info.append("Código de sala: ").append(sala.getCodigosala()).append("\n");
            info.append(sala.mostrarAsientos());
        }
        info.append("\n");
        return info.toString();
    }

    public void comprarbutaca(String codigosala,String codigofila,int numerobutaca){
        for (Sala sala:getSalas()) {
            if (Objects.equals(codigosala, sala.getCodigosala())){
                for (Fila fila:sala.getFilas()) {
                    if (Objects.equals(codigofila, fila.getCodigofila())){
                        for (Butaca butaca: fila.getButacas()) {
                            if (butaca.getNumero()==numerobutaca){
                                Butaca blanco = fila.getButacas().get(numerobutaca-1);
                                if (blanco.estaDisponible()){
                                    String c="";
                                    c+="Numero de sala: "+codigosala+"\n";
                                    c+="Numero de fila: "+codigofila+"\n";
                                    c+="Numero de butaca: "+numerobutaca+"\n";
                                    System.out.println(c);
                                    blanco.disponible=false;
                                    System.out.println(sala.mostrarAsientos());
                                }
                                else {
                                    System.out.println("Compra invalida");
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
