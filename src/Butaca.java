public class Butaca {
    int numero;
    boolean ocupado;
    public Butaca(int numero,boolean ocupado){
        this.numero=numero;
        this.ocupado=ocupado;
    }
    public boolean isOcupado() {
        return ocupado;
    }
    public int getNumero() {
        return numero;
    }
    public String getInfoButaca() {
        String info = "";
        info += "Numero de butaca:\t\t" + getNumero() + "\n";
        info += "Disponibilidad:\t" + isOcupado() + "\n";
        return info;
    }
}
