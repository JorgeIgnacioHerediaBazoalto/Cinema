public class PlantillaCine {
    Cine cine;
    public PlantillaCine(Cine cine){
        this.cine=cine;
        Sala salaA1=new Sala("A1",null);
        Sala salaA2=new Sala("A2",null);
        Sala salaB1=new Sala("B1",null);
        Sala salaB2=new Sala("B2",null);
        PlantillaSala plantillaSalaA1= new PlantillaSala(salaA1);
        PlantillaSala plantillaSalaA2= new PlantillaSala(salaA2);
        PlantillaSala plantillaSalaB1= new PlantillaSala(salaB1);
        PlantillaSala plantillaSalaB2= new PlantillaSala(salaB2);
        cine.addSala(salaA1);
        cine.addSala(salaA2);
        cine.addSala(salaB1);
        cine.addSala(salaB2);
    }
}
