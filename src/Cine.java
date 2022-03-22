import java.util.ArrayList;
import java.util.Objects;

public class Cine {
    String nombre;
    Boleteria boleteria;
    ArrayList<Sala> salas;
    int numerosalas;

    public Cine(String nombre){
        this.nombre = nombre;
        this.salas = new ArrayList<>();
        this.boleteria = null;
        Sala a=new Sala("A");
        a.generarFilas(10,10);
        Sala b=new Sala("B");
        b.generarFilas(10,10);
        Sala c=new Sala("C");
        c.generarFilas(10,10);
        Sala d=new Sala("D");
        d.generarFilas(8,10);
        Sala e=new Sala("E");
        e.generarFilas(8,10);
        Sala f=new Sala("F");
        f.generarFilas(5,10);
        Sala g=new Sala("G");
        g.generarFilas(5,10);
        addSala(a);
        addSala(b);
        addSala(c);
        addSala(d);
        addSala(e);
        addSala(f);
        addSala(g);
    }

    public Cine(String nombre, Boleteria boleteria) {
        this.nombre = nombre;
        this.salas = new ArrayList<>();
        this.boleteria = boleteria;
    }

    public void generarsalas(int numerosalas,int numerofilas, int butacasporfila){
        this.numerosalas=numerosalas;
        for (int i=1;i<=numerosalas;i++){
            Sala sala = new Sala(String.valueOf((char)(64+i)));
            sala.generarFilas(numerofilas,butacasporfila);
            salas.add(sala);
        }

    }

    public ArrayList<Sala> getSalas() {return salas;}

    public void addSala(Sala sala){salas.add(sala);}

    public String getNombre() {return nombre;}

    public String infoCine(){
        StringBuilder info= new StringBuilder();
        info.append("Nombre del cine ").append(getNombre()).append("\n");
        for (Sala sala:salas) {
            info.append(sala.getCodigosala()).append("\n");
            info.append(sala.mostrarAsientos());
        }
        info.append("\n");
        return info.toString();
    }

    public void comprarbutaca(String codigosala,String codigofila,int numerobutaca){
        for (Sala sala:getSalas()) {
            if (Objects.equals("Sala - "+codigosala, sala.getCodigosala())){
                for (Fila fila:sala.getFilas()) {
                    if (Objects.equals(codigofila, fila.getCodigofila())){
                        for (Butaca butaca: fila.getButacas()) {
                            if (butaca.getNumero()==numerobutaca){
                                Butaca blanco = fila.getButacas().get(numerobutaca-1);
                                if (blanco.estaDisponible()){
                                    String c="";
                                    c+="Numero de sala: "+codigosala+"\n";
                                    c+="Numero de fila: "+codigofila+"\n";
                                    c+="Numero de butaca: "+numerobutaca+"\n";
                                    System.out.println(c);
                                    blanco.disponible=false;
                                    System.out.println(sala.mostrarAsientos());
                                }
                                else {
                                    System.out.println("Compra invalida");
                                }
                            }
                        }
                    }
                }
            }
        }

    }


}
