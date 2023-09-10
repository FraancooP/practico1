import java.util.EmptyStackException;
public class MiPila<Dato>//Nombramos "Dato" para poder elejir el tipo de dato que queremos operar, Enteros, Char, String, etc.
{
    private int largo;
    private Object[] arreglo;
    private int topOfStack;//Esto es el index en el codigo del profe
    private static final int CAPACIDAD_POR_DEFECTO = 10;//Intentar poner un atributo largo y pedirle de entrada al usuario el max.
    public MiPila(Integer largo)//Constructor
    {
        this.largo=largo;
        this.arreglo = new Object[largo];
        this.topOfStack = -1;//Notar q se seta el top en -1.
    }
    //-------------------------------------------------------------------------------------------------------------------
    public boolean isEmpty(){//Chekeo de vacio
        return topOfStack == -1;
    }
    //-------------------------------------------------------------------------------------------------------------------
    public boolean isFull(){//Este metodo es para ver si la pila esta llena.
        return topOfStack == arreglo.length - 1;
    }
    //-------------------------------------------------------------------------------------------------------------------
    public void makeEmpty(){//Vaciar.
        topOfStack = -1;
        for(int i = 0; i<arreglo.length;i++){
            arreglo[i] = null;
        }
        System.out.println("VERIFICACION:Pila Borrada.\n");
    }
    //-------------------------------------------------------------------------------------------------------------------
    public void push(Dato elemento){//De entrada el Push ya pide un "Dato", este dato puede ser String, char, int, dependiendo de como
        //Se eligio al comienzo.
        if(isFull()){
            throw new IllegalStateException("La pila está llena.");//Todos los illegalStateexception van a parar el programa.
        }
        arreglo[++topOfStack ] = elemento;
    }
    //-------------------------------------------------------------------------------------------------------------------
    public Dato top(){
        if(isEmpty()){
            throw new IllegalStateException("La pila está vacía.");//Apaga.
        }
        return (Dato) arreglo[topOfStack];//Es necesario poner el (Dato) para que lo convierta a ese tipo de elemento elejido.
    }
    //-------------------------------------------------------------------------------------------------------------------
    public Dato pop(){
        if(isEmpty()){
            throw new IllegalStateException("La pila está vacía.");//Apaga.
        }
        Dato elemento = (Dato) arreglo[topOfStack];
        arreglo[topOfStack] = null;
        topOfStack--;
        return elemento;
    }
    //-------------------------------------------------------------------------------------------------------------------
    public Dato topAndPop(){//Debe mostrar primer elemento y borrarlo...........
        if(isEmpty()){
            throw new IllegalStateException("La pila está vacía.");//Apaga
        }
        Dato elemento = (Dato) arreglo[topOfStack];
        arreglo[topOfStack] = null;
        topOfStack--;
        return elemento;
    }
    //-------------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------------------
    public void imprimir(){//Para chekear que se esten guardando.
        if(isEmpty()){
            System.out.println("La lista esta vacia.\n");
        }else{
            System.out.println("Elementos de la pila:");
            for(int i = topOfStack; i >= 0 ; i--){
                System.out.println(arreglo[i]);
            }
        }
    }
}
