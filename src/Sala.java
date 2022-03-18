import java.util.ArrayList;

public class Sala {
    String codigosala;
    ArrayList<Fila> filas;
    public Sala(String codigosala){
        this.codigosala=codigosala;
        this.filas=new ArrayList<>();
    }
    public String getCodigosala() {return codigosala;}
    public void addfila(Fila fila){filas.add(fila);}
    public ArrayList<Fila> getFilas() {return filas;}

    public String infoSala(){
        StringBuilder info= new StringBuilder();
        info.append("Codigo de Sala ").append(getCodigosala()).append("\n");
        for (Fila fila:filas) {
            info.append(fila.infoFila());
        }
        return info.toString();
    }
}
