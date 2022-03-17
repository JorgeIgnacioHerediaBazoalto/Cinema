public class PlantillaSala {
    Sala sala;
    public PlantillaSala(Sala sala){
        this.sala=sala;
        Fila filaa = new Fila("A");
        PlantillaFila plantillaFilaa=new PlantillaFila(filaa);
        Fila filab = new Fila("B");
        PlantillaFila plantillaFilab=new PlantillaFila(filab);
        Fila filac = new Fila("C");
        PlantillaFila plantillaFilac=new PlantillaFila(filac);
        Fila filad = new Fila("D");
        PlantillaFila plantillaFilad=new PlantillaFila(filad);
        Fila filae = new Fila("E");
        PlantillaFila plantillaFilae=new PlantillaFila(filae);
        Fila filaf = new Fila("F");
        PlantillaFila plantillaFilaf=new PlantillaFila(filaf);
        Fila filag = new Fila("G");
        PlantillaFila plantillaFilag=new PlantillaFila(filag);
        Fila filah = new Fila("H");
        PlantillaFila plantillaFilah=new PlantillaFila(filah);
        sala.addFila(filaa);
        sala.addFila(filab);
        sala.addFila(filac);
        sala.addFila(filad);
        sala.addFila(filae);
        sala.addFila(filaf);
        sala.addFila(filag);
        sala.addFila(filah);
    }
}
