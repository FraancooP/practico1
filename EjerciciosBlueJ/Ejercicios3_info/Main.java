 /**Implementación de una Pila:
a. Crea una clase que represente una pila utilizando un arreglo.
b. Implementa métodos para push (agregar un elemento), pop (eliminar
el elemento en la cima) y top (ver el elemento en la cima sin
eliminarlo).
c. Prueba tu implementación utilizando diferentes operaciones y
elementos.*/
import java.util.Scanner;
public class Main
{
    public static void menu(MiPila pila){//Recibe un tipo de objeto pila.
        //El chiste de este menu, es para usarlo con la clase MiPila,
        //Como esta clase recibe un tipo de elemento llamado "Dato", podemos aprovechar para crear 1 solo menu
        //que opere con cualquiera de los objetos creados que tienen distintos tipos de datos elejidos en el main principal.
        Scanner scanner = new Scanner(System.in);
        boolean salida = false;
        do{
            System.out.println("1)Agregar un elemento a la pila.\n");
            System.out.println("2)Eliminar un elemento de la pila(ultimo que se agrego).\n");
            System.out.println("3)Mostrar el top(ultimo elemento agregado).\n");
            System.out.println("4)Imprimir toda la pila.\n");
            System.out.println("5)topAndPop().\n");
            System.out.println("6)Volver a elejir tipo de datos.\n");
            int op = Integer.parseInt(scanner.nextLine());
            switch(op){
                case 1:
                    System.out.println("Ingrese el dato.\n");
                    pila.push(scanner.nextLine());
                    break;
                case 2:
                    pila.pop();
                    System.out.println("Elemento de la lista eliminado.\n");
                    break;
                case 3:
                    System.out.println("El elemento top es: "+pila.top());
                    break;
                case 4:
                    pila.imprimir();
                    break;
                case 5:
                    pila.topAndPop();//Creo q esta mal.
                    break;
                case 6:
                    salida = true;
                    break;
                default:
                    System.out.println("Opcion no valida.\n");
                    break;
            }
        }while(!salida);
        System.out.println("Volviendo al incio.....\n");
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        MiPila<Integer> pilaEntero = new MiPila<Integer>();
        MiPila<String> pilaString = new MiPila<String>();
        MiPila<Double> pilaDouble = new MiPila<Double>();
        boolean salida = false;
        //MiPila<Char> pilaChar = new MiPila<Char>(); no se porque me da error
        do{
            System.out.println("Elija un tipo de dato para cargar en una pila.\n");
            System.out.println("1)Enteros.\n");
            System.out.println("2)String.\n");
            System.out.println("3)Double.\n");
            System.out.println("4)Salir.\n");
            int op = Integer.parseInt(scanner.nextLine());
            switch(op){
                case 1:
                    menu(pilaEntero);
                    break;
                case 2:
                    menu(pilaString);
                    break;
                case 3:
                    menu(pilaDouble);
                    break;
                case 4:
                    salida = true;
                    break;
                default:
                    System.out.println("Opcion no valida.\n");
                    break;
            }
        }while(!salida);
        System.out.println("Saliendo del programa.\n");
    }
    
}
