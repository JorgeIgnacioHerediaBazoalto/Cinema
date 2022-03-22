import java.util.ArrayList;
import java.util.Objects;

public class Boleteria{
    Empleado empleado;
    Cartelera cartelera;
    int total = 0;
    Sala sala;
    Butaca butaca;
    Cine cine;
    int precioBoleto;

    public Boleteria(Empleado empleado) {
        this.empleado = empleado;
        this.cartelera = null;
    }

    public void comprarBoleto(Pelicula pelicula, int cantidadDeBoletos, String formatoPelicula){

        sala = generarSala(pelicula);
        ArrayList<Butaca> butacasLibres = new ArrayList<>();
        butacasLibres = recorrerFilaButacas(sala, cantidadDeBoletos, butacasLibres);

        for(int indice = 0; indice < cantidadDeBoletos; indice ++){

            butaca = butacasLibres.get(indice);
            Boleto boleto = new Boleto(cine, pelicula, sala, butaca, formatoPelicula);
            boleto.generarBoleto();
            precioBoleto = generarPrecioBoleto(formatoPelicula);
            total = precioBoleto + total;
        }
    }

    //public void factura(Cliente cliente, FormaDePago formaDePago){}

    private int generarPrecioBoleto(String formatoPelicula){
        if(formatoPelicula.equals("2D")){
            return 40;
        } if(formatoPelicula.equals("3D")){
            return 60;
        }
        return 0;
    }

    public Sala generarSala(Pelicula pelicula){
        ArrayList<Sala> salas;
        salas = cine.getSalas();
        for(int i = 0; i < salas.size(); i ++) {
            sala = salas.get(i);
            String nombrePelicula = sala.getNombrePelicula();
            if(nombrePelicula.equals(pelicula.getNombrePelicula())){
                return sala;
            }
        }
        return sala;
    }

    public ArrayList<Butaca> buscarButacasLibres(Sala sala, String codigofila, int cantidadDeBoletos,
                                                 ArrayList<Butaca> butacasLibres){
        for (Fila fila:sala.getFilas()) {
            if (Objects.equals(codigofila, fila.getCodigofila())){
                for (Butaca butaca : fila.getButacas()) {
                    boolean estadoButaca = butaca.estaDisponible();
                    if(estadoButaca == true){
                        butacasLibres.add(butaca);
                    }if(estadoButaca == false){
                        butacasLibres.clear();
                    }
                    if(butacasLibres.size() == cantidadDeBoletos){
                        return butacasLibres;
                    }
                }
            }
        }
        return butacasLibres;
    }

    public ArrayList<Butaca> recorrerFilaButacas(Sala sala, int cantidadDeBoletos, ArrayList<Butaca> butacasLibres){
        int capacidadSala = sala.getCapacidad();
        capacidadSala = capacidadSala / sala.getFilas().get(0).getButacas().size(); // /10 butacasPorFila
        ArrayList<String> codigosDeFilas = new ArrayList<>();
        String codigo;

        for(int i = 0; i < capacidadSala; i++){
            char character = (char)(65 + i);
            codigo = String.valueOf(character);
            codigosDeFilas.add(codigo);
        }

        for(int i = 0; i < codigosDeFilas.size(); i++){
            String codigoFila = codigosDeFilas.get(i);
            butacasLibres = buscarButacasLibres(sala, codigoFila, cantidadDeBoletos, butacasLibres);
            if(butacasLibres.size() == cantidadDeBoletos){
                return butacasLibres;
            }
        }
        return butacasLibres;
    }

}
