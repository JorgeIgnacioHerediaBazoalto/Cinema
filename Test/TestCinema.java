import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestCinema {

    @Test
    public void testClient(){
        Cliente cliente1 = new Cliente("Juan Tasma", "Bolivia", 123456789, LocalDate.of(2003, Month.OCTOBER, 8));


        String expected = "Name:\t\tJuan Tasma\n" +
                "Nacionalidad:\tBolivia\n" +
                "ID\t\t123456789\n" +
                "Edad:\t\t19\n" +
                "Fecha de nacimiento:\t2003-10-08\n";

        assertEquals(expected, cliente1.getInfo());
    }

    @Test
    public void testButaca(){
        Butaca b1=new Butaca(1,true);
        assertTrue(b1.estaDisponible());
    }
    @Test
    public void testFila(){
        Fila fila=new Fila("A");
        PlantillaFila plantillaFila=new PlantillaFila(fila);
        assertEquals("A", fila.getCodigo());
        System.out.println(fila.getInfoFila());
    }
    @Test
    public void testSala(){
        Pelicula pelicula = new Pelicula("Duro de matar",GeneroPelicula.ACCION,300.45);
        Sala sala = new Sala("A1",pelicula);
        PlantillaSala plantillaSala = new PlantillaSala(sala);
        System.out.println(sala.getInfoSala());
    }

    @Test
    public void testIDClient() {
        //la funcion de asignar el id en orden funciona, pero falta que el id sea correlativo, para eso necesito usar el arraylsit de clientes en cine
        Cliente cliente1 = new Cliente("Juan Tasma", "Bolivia", 123456789, LocalDate.of(2003, Month.OCTOBER, 8));
        assertEquals("CLI-0", cliente1.getIdClient());

        Empleado empleado1 = new Empleado("Juan Tasma", "Bolivia", 123456789, LocalDate.of(2003, Month.OCTOBER, 8));
        assertEquals("EMP-0", empleado1.getIdEmpleado());
    }

    @Test
    public void testCartelera() {
        int year = 2022;
        Cartelera cartelera = new Cartelera(LocalDate.of(year, 3, 17), LocalDate.of(year, 4, 2));
        Pelicula peli1 = new Pelicula("Point Of Break", GeneroPelicula.ACCION, 2.5);
        Funcion funcion = new Funcion(peli1, "2D", 40, 50);

        cartelera.addFuncion(funcion);

        String expected = "------------------------------CARTELERA------------------------------\n" +
                "Disponible desde: 2022-03-17\tHasta: 2022-04-02\n\n" +
                "Pelicula: Point Of Break\n" +
                "\t\tGenero: ACCION\n" +
                "\t\tDuracion: 2.5\n" +
                "\t\tTipo Pelicula: 2D\n\n";

        assertEquals(expected, cartelera.getCartelera());
    }
}
