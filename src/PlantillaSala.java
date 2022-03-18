public class PlantillaSala {
    Sala sala;
    public PlantillaSala(Sala sala){
        this.sala=sala;
        Fila A=new Fila("A1");
        PlantillaFila a = new PlantillaFila(A);
        Fila B=new Fila("A2");
        PlantillaFila b = new PlantillaFila(B);
        Fila C=new Fila("A3");
        PlantillaFila c = new PlantillaFila(C);
        Fila D=new Fila("A4");
        PlantillaFila d = new PlantillaFila(D);
        sala.addfila(A);
        sala.addfila(B);
        sala.addfila(C);
        sala.addfila(D);
    }
}
