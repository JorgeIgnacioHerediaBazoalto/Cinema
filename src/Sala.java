import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sala {
    String codigosala;
    int numeroFilas;
    ArrayList<Fila> filas;

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";


    public Sala(String codigosala){
        this.codigosala = codigosala;
        this.filas = new ArrayList<>();
    }

    public void generarFilas( int numeroFilas,int butacasporfila) {
        this.numeroFilas=numeroFilas;
        for (int i=1;i<=numeroFilas;i++){
            Fila fila = new Fila(String.valueOf((char)(64+i)));
            fila.generarButacas(butacasporfila);
            filas.add(fila);
        }
    }

    public String mostrarAsientos() {
        String asientos = "";
        for (int i = 1; i <= filas.get(1).limiteButacas; i++) {
            asientos += ANSI_RESET + "   " + i + ". ";
        }
        asientos += "\n";

        for (Fila fila : filas
             ) {
            asientos += ANSI_RESET + fila.codigoFila + ": ";
            for (Butaca butaca : fila.butacas
                 ) {
                if (butaca.estaDisponible()){
                    asientos += ANSI_GREEN + "!---! ";
                }
                else {
                    asientos += ANSI_RED + "!-*-! ";
                }
            }
            asientos += "\n"+ANSI_RESET;
        }

        return asientos;
    }

    public String getCodigosala() {return "Sala - "+codigosala;}

    public void addfila(Fila fila){filas.add(fila);}

    public ArrayList<Fila> getFilas() {return filas;}

}
