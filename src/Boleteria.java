import java.util.Scanner;

public class Boleteria implements Servicios{
    Empleado empleado;
    Cartelera cartelera;

    public Boleteria(Empleado empleado) {
        this.empleado = empleado;
        this.cartelera = null;
    }

    public Boleteria(Empleado empleado, Cartelera cartelera) {
        this.empleado = empleado;
        this.cartelera = cartelera;
    }

    @Override
    public void comprar() {
        Scanner scan = new Scanner(System.in);

        System.out.println(cartelera.getCartelera());
        System.out.print("Select function: ");
        int indiceFuncion = scan.nextInt();
        cartelera.searchFuncions(indiceFuncion);

    }

    @Override
    public void facturar() {

    }

    @Override
    public void registrarCliente() {

    }

    @Override
    public void buscarCliente() {

    }
}
