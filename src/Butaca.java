public class Butaca {
    int numero;
    private boolean disponible;
    public Butaca(int numero,boolean disponible){
        this.numero=numero;
        this.disponible=disponible;
    }
    public boolean estaDisponible() {
        return disponible;
    }
    public int getNumero() {
        return numero;
    }
    public String getInfoButaca() {
        String info = "";
        info += "Numero de butaca:\t\t" + getNumero() + "\n";
        info += "Disponibilidad:\t" + disponible + "\n";
        return info;
    }
}
