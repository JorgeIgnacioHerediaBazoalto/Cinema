public class PlantillaCine {
    Cine cine;
    public PlantillaCine(Cine cine){
        this.cine=cine;
        Sala A=new Sala("A");
        PlantillaSala pA = new PlantillaSala(A);
        Sala B=new Sala("B");
        PlantillaSala pB = new PlantillaSala(B);
        Sala C=new Sala("C");
        PlantillaSala pC = new PlantillaSala(C);
        cine.addSala(A);
        cine.addSala(B);
        cine.addSala(C);
    }
}
