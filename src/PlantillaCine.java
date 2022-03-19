public class PlantillaCine {
    Cine cine;
    public PlantillaCine(Cine cine){
        this.cine=cine;
        Sala A=new Sala("A", 6);
        PlantillaSala pA = new PlantillaSala(A);
        Sala B=new Sala("B", 6);
        PlantillaSala pB = new PlantillaSala(B);
        Sala C=new Sala("C", 6);
        PlantillaSala pC = new PlantillaSala(C);
        cine.addSala(A);
        cine.addSala(B);
        cine.addSala(C);
    }
}
