import java.util.EmptyStackException;
public class MiPila<Dato>//Nombramos "Dato" para poder elejir el tipo de dato que queremos operar, Enteros, Char, String, etc.
{
    private Object[] arreglo;
    private int topOfStack;
    private static final int CAPACIDAD_POR_DEFECTO = 100;//Intentar poner un atributo largo y pedirle de entrada al usuario el max.
    public MiPila()//Constructor
    {
        this.arreglo = new Object[CAPACIDAD_POR_DEFECTO];
        this.topOfStack = -1;//Notar q se seta el top en -1.
    }
    public boolean isEmpty(){//Chekeo de vacio
        return topOfStack == -1;
    }
    public boolean isFull(){//Este metodo es para ver si la pila esta llena.
        return topOfStack == arreglo.length - 1;
    }
    public void makeEmpty(){//Vaciar.
        topOfStack = -1;
    }
    public void push(Dato elemento){//De entrada el Push ya pide un "Dato", este dato puede ser String, char, int, dependiendo de como
        //Se eligio al comienzo.
        if(isFull()){
            throw new IllegalStateException("La pila está llena.");//Todos los illegalStateexception van a parar el programa.
        }
        arreglo[++topOfStack ] = elemento;
    }
    public Dato pop(){
        if(isEmpty()){
            throw new IllegalStateException("La pila está vacía.");//Apaga.
        }
        Dato elemento = (Dato) arreglo[topOfStack];
        arreglo[topOfStack] = null;
        topOfStack--;
        return elemento;
    }
}