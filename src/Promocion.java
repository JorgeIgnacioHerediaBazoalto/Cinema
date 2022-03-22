import java.time.DayOfWeek;
import java.time.LocalDate;

public class Promocion
{
    public double obtenerDescuento(LocalDate fechaActual, int edad)
    {
        double descuento = 0;
        if(edad>=60)
        {
            descuento = 0.5;
        }
        if(fechaActual.getDayOfWeek() == DayOfWeek.WEDNESDAY)
        {
            descuento = 0.5;
        }
        if(edad >= 10)
        {
            descuento = 0.15;
        }

        return descuento;
    }
}
