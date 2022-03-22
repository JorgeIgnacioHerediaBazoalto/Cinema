import java.util.ArrayList;
import java.util.Scanner;

public class CandyBar implements Servicios {
    ArrayList<Producto> productos;

    public CandyBar() {
        this.productos = new ArrayList<>();
    }

    public void addProducto(Producto producto) {
        productos.add(producto);
    }

    public String mostrarProductos() {
        String returnProductos = "";
        for (Producto producto : productos
             ) {
            returnProductos += "PRODUCTO N°: " + productos.indexOf(producto) + "\n" +
                    "\t" + producto.infoObjeto(-1) + "\n------------------------------------------------------------\n";
        }
        return returnProductos;
    }

    //falta agregar las formas de pago
    //Solucionar implementacion de los metodos por sus parametros
    //@Override
    public void comprar(Cliente cliente) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido al CandyBar, que producto desea comprar:");
        System.out.println(mostrarProductos());
        System.out.println("AAA");
        System.out.println("Selecciona el producto a comprar: ");
        int election = scan.nextInt();
        facturar(cliente, productos.get(election));
    }

    //Complementar el metodo para que soporte mas de un producto
    //Solucionar implementacion de los metodos por sus parametros
    //@Override
    public String facturar(Cliente cliente, Producto producto) {
        productos.get(productos.indexOf(producto)).cantidadDisponible -= 1;
        String factura = "Nombre cliente: " + cliente.getName() + "\n" +
                "ID: " + cliente.getId() +
                "--------------------------------\n" +
                producto.infoObjeto();
        return factura;
    }

    @Override
    public void comprar() {

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
