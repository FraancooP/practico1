public class Tiempos
{
    //Esta clase esta generada en fin de ir guardando los registro de tiempos de cada ordenamiento, creamos 1 objeto
    //por cada tipo de ordenamiento, estaria bueno generar alguna funcion que busque los menores tiempos con respecto
    //a los 3 ordenamientos..........
    private String tipo;
    private long t1;
    private long t2;
    private long t3;
    private int largo;
    public Tiempos(long t1, long t2, long t3, String tipo,int largo)
    {
        this.t1=t1;
        this.t2=t2;
        this.t3=t3;
        this.tipo=tipo;
        this.largo=largo;
    }
    @Override
    public String toString(){
        if(tipo == "Insercion"){
            return "Ordenamiento Insercion(Largo: "+largo+") Tiempos T1(Enteros): "+t1+"ms T2(Doubles): "+t2+"ms T3(Chars): "+t3+"ms";
        }else if(tipo == "Shellsort"){
            return "Ordenamiento Shellsort(Largo: "+largo+") Tiempos T1(Enteros): "+t1+"ms T2(Doubles): "+t2+"ms T3(Chars): "+t3+"ms";
        }else if(tipo == "Quicksort"){
            return "Ordenamiento QuickSort(Largo: "+largo+") Tiempos T1(Enteros): "+t1+"ms T2(Doubles): "+t2+"ms T3(Chars): "+t3+"ms";
        }else{
            return "Ningun tiempo registrado.\n";
        }
    }
}
