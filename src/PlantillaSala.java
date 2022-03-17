public class PlantillaSala {
    Sala sala;
    public PlantillaSala(Sala sala){
        this.sala=sala;
        Fila filaa = new Fila("A",10);
        PlantillaFila plantillaFilaa=new PlantillaFila(filaa);
        Fila filab = new Fila("B",10);
        PlantillaFila plantillaFilab=new PlantillaFila(filab);
        Fila filac = new Fila("C",10);
        PlantillaFila plantillaFilac=new PlantillaFila(filac);
        Fila filad = new Fila("D",10);
        PlantillaFila plantillaFilad=new PlantillaFila(filad);
        Fila filae = new Fila("E",10);
        PlantillaFila plantillaFilae=new PlantillaFila(filae);
        Fila filaf = new Fila("F",10);
        PlantillaFila plantillaFilaf=new PlantillaFila(filaf);
        Fila filag = new Fila("G",10);
        PlantillaFila plantillaFilag=new PlantillaFila(filag);
        Fila filah = new Fila("H",10);
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
