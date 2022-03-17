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
        fila.addButaca(b1);
        fila.addButaca(b2);
        fila.addButaca(b3);
        fila.addButaca(b4);
        fila.addButaca(b5);
        fila.addButaca(b6);
        fila.addButaca(b7);
        fila.addButaca(b8);
        fila.addButaca(b9);
        fila.addButaca(b10);
    }
}
