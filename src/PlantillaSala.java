public class PlantillaSala {
    Sala sala;
    public PlantillaSala(Sala sala){
        this.sala=sala;
        Fila A=new Fila("A", 10);
        PlantillaFila a = new PlantillaFila(A);
        Fila B=new Fila("B", 10);
        PlantillaFila b = new PlantillaFila(B);
        Fila C=new Fila("C", 10);
        PlantillaFila c = new PlantillaFila(C);
        Fila D=new Fila("D", 10);
        PlantillaFila d = new PlantillaFila(D);
        sala.addfila(A);
        sala.addfila(B);
        sala.addfila(C);
        sala.addfila(D);
    }
}
