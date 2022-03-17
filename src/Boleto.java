public class Boleto {

    Cine cine;
    Pelicula pelicula;
    Cliente cliente;
    Sala sala;
    Butaca butaca;
    String hora;
    int total;

    public void generarBoleto(){
        int n1 = 52;
        int n2 = 6;
        int n3 = 21;

        System.out.println("=".repeat(n1));
        System.out.println(" ".repeat(16) + "CINE " + cine + " - BOLETO");
        System.out.println("=".repeat(n1));
        System.out.println("=".repeat(n1) + "\n");
        System.out.println(" ".repeat(n2) + "PELICULA" + " ".repeat(11) + ":" + " ".repeat(n2) + pelicula);
        System.out.println(" ".repeat(n2) + "TIPO DE PELICULA" + " ".repeat(3) + ":" + " ".repeat(n2) + pelicula);
        System.out.println(" ".repeat(n2) + "SALA" + " ".repeat(15) + ":" + " ".repeat(n2) + sala);
        System.out.println(" ".repeat(n2) + "BUTACA" + " ".repeat(13) + ":" + " ".repeat(n2) + butaca);
        System.out.println(" ".repeat(n2) + "HORA" + " ".repeat(15) + ":" + " ".repeat(n2) + hora + "\n");
        System.out.println(".".repeat(n3) + " CLIENTE " + ".".repeat(n3) + "\n");
        System.out.println(" ".repeat(n2) + "NOMBRE" + " ".repeat(13) + ":" + " ".repeat(n2) + cliente);
        System.out.println(" ".repeat(n2) + "CI" + " ".repeat(17) + ":" + " ".repeat(n2) + cliente);
        System.out.println(" ".repeat(n2) + "MODO DE PAGO" + " ".repeat(7) + ":" + " ".repeat(n2) + cliente + "\n");
        System.out.println(".".repeat(n3) + " PRECIO " + ".".repeat(n3) + "\n");
        System.out.println(" ".repeat(n2) + "TOTAL" + " ".repeat(14) + ":" + " ".repeat(n2) + total + " bs." + "\n");
        System.out.println("=".repeat(n1));

    }
}