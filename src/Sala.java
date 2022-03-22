import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sala {
    String codigosala;
    int numeroFilas;
    int capacidad;
    ArrayList<Fila> filas;

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

//"SALA-A"
    public Sala(String codigosala, int numeroFilas){
        this.codigosala = codigosala;
        this.numeroFilas = numeroFilas;
        this.filas = new ArrayList<>();
    }

    public void generarButacas(int numeroButacasFila) {
        String[] ArrayStrings = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        for(int i = 0; i < numeroFilas; i++) {
            Fila fila = new Fila(ArrayStrings[i], numeroButacasFila);
            fila.generarButacas();
            filas.add(fila);
        }
        setCapacidad();
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

    public void setCapacidad() {
        this.capacidad = filas.get(0).limiteButacas * numeroFilas;
    }

    public String getCodigosala() {return "SALA - " + codigosala;}

    public void addfila(Fila fila){filas.add(fila);}

    public ArrayList<Fila> getFilas() {return filas;}

    public int getCapacidad() {
        return capacidad;
    }
}
