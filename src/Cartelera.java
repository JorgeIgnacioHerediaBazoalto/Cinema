import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Cartelera {
    //Necesitamos una manera de mostrar horarios, estaba pensando en agregar un Arraylist de Horarios a funcion, y crear una clase horario,
    // para agregar horarios a la misma funcion
    LocalDate plazoInicio;
    LocalDate plazoFin;
    ArrayList<Funcion> funcions;

    public Cartelera(LocalDate plazoInicio, LocalDate plazoFin) {
        this.plazoInicio = plazoInicio;
        this.plazoFin = plazoFin;
        this.funcions = new ArrayList<>();
    }

    public void addFuncion(Funcion funcion) {
        funcions.add(funcion);
    }

    public String getCartelera() {
        String carteleraString = "------------------------------CARTELERA------------------------------\n" +
                "Disponible desde: " + plazoInicio + "\tHasta: " + plazoFin + "\n\n";

        for (Funcion funcion: funcions
             ) {
            carteleraString += "Pelicula: " + funcion.peliculas.nombrePelicula + "\n" +
                    "\t\tGenero: " + funcion.peliculas.genero + "\n"  +
                    "\t\tDuracion: " + funcion.peliculas.duracion + "\n"  +
                    "\t\tTipo Pelicula: " + funcion.tipoPelicula + "\n" +
                    "\t\tHorario: \n";

            for (LocalTime hora: funcion.horarios
                 ) {
                carteleraString += "\t\t\t" + hora + "\n";
            }
        }

        return carteleraString;
    }
}
