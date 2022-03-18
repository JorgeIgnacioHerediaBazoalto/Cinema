public class PlantillaFila {
    Fila fila;
    public PlantillaFila(Fila fila){
        this.fila=fila;
        Butaca b1=new Butaca(1,true);
        Butaca b2=new Butaca(2,true);
        Butaca b3=new Butaca(3,true);
        Butaca b4=new Butaca(4,false);
        Butaca b5=new Butaca(5,false);
        Butaca b6=new Butaca(6,false);
        Butaca b7=new Butaca(7,false);
        Butaca b8=new Butaca(8,true);
        Butaca b9=new Butaca(9,true);
        Butaca b10=new Butaca(10,false);
        fila.addbutaca(b1);
        fila.addbutaca(b2);
        fila.addbutaca(b3);
        fila.addbutaca(b4);
        fila.addbutaca(b5);
        fila.addbutaca(b6);
        fila.addbutaca(b7);
        fila.addbutaca(b8);
        fila.addbutaca(b9);
        fila.addbutaca(b10);
    }
}
