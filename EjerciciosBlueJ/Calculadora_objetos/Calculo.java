import java.util.ArrayList;
import java.util.List;
public class Calculo
{
    private int num1;
    private int num2;
    private int conv;
    private int factorial;
    private List<Historial> lista;    
    public void setNum1(int num1){
        this.num1=num1;
    }
    public Calculo() {
        this.lista = new ArrayList<>();
    }
    public void setLista(List<Historial> lista){
        this.lista=new ArrayList<>();
    }
    public List<Historial> getLista(){
        return this.lista;
    }
    public int getNum1(){
    return num1;
    }
    public void setNum2(int num2){
        this.num2=num2;
    }
    public int getNum2(){
    return num2;
    }
    public void setConv(int conv){
        this.conv=conv;
    }
    public int getConv(){
        return conv;
    }
    public void setFactorial(int factorial){
        this.factorial=factorial;
    }
    public int getFactorial(){
        return factorial;
    }
    public void sumar(){
        float suma = num1+num2;
        System.out.println("La suma de los 2 numeros es: "+ suma);
        lista.add(new Historial(num1,num2,0,0,suma,"Suma"));
    }
    public void restar(){
        float resta = num1-num2;
        System.out.println("La resta de los 2 numeros es: "+ resta);
        lista.add(new Historial(num1,num2,0,0,resta,"Resta"));
    }
    public void multiplicar(){
        float multiplicacion = num1*num2;
        System.out.println("La multiplicacion de los 2 numeros es: "+ multiplicacion);
        lista.add(new Historial(num1,num2,0,0,multiplicacion,"Multiplicacion"));
    }
    public void dividir(){
        try{
        float division = num1/num2;
        System.out.println("La division de los 2 numeros es: "+ division);
        lista.add(new Historial(num1,num2,0,0,division,"Division"));
        }catch(ArithmeticException e){
        System.out.println("Error: no existe division por 0.\n");
        }
    }
    public void conversion(){
        System.out.println("El numero en binario es: " + binario(conv));
        lista.add(new Historial(num1,num2,conv,0,binario(conv),"Conversion"));
    }
    public static int binario(int n){//Funcion recursiva que convierte en binario un numero entero de base 10.
        if(n>1){
            binario(n/2);
        }
        System.out.println(n%2);
        return 0;
    }
    public void calcular_factorial(){
        try{
        System.out.println("El factorial de "+factorial+" es: " + fac(factorial));
        lista.add(new Historial(num1,num2,0,factorial,fac(factorial),"Factorial"));
    }catch(ArithmeticException e){
        System.out.println("No se le puede calcular el factorial al numero.\n");
    }
    }
    public static int fac(int n){//Funcion recursiva que se encarga de calcular el factorial.
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return n*fac(n-1);
        }
    }
    public void historial(){
        for(Historial histo : lista){
            System.out.println(histo.toString());
        }
    }
}
