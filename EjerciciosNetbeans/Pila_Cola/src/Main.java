import java.util.Scanner;
public class Main
{
    //ESTE MENU ES PARA EL EJERCICIO DE IMPLEMENTAR UNA PILA.
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
            System.out.println("6)Volver al menu principal.\n");
            int op = Integer.parseInt(scanner.nextLine());
            switch(op){
                case 1:
                    System.out.println("Ingrese el dato.\n");
                    pila.push(scanner.nextLine());
                    System.out.println("Elemento agregado a la pila.\n");
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
                    System.out.println("Falta Implementar.");
                    //pila.topAndPop(); Creo q esta mal.
                    break;
                case 6:
                    pila.makeEmpty();//IMPORTANTE, SI NO DECLARAMOS ESTE MAKEEMPTY, los datos se quedaran en memoria hasta que 
                    //cerremos el programa.
                    salida = true;
                    break;
                default:
                    System.out.println("Opcion no valida.\n");
                    break;
            }
        }while(!salida);
        System.out.println("Volviendo al incio.....\n");
    }
    //ESTE ES EL PUBLIC STATIC VOID MAIN, EL MAIN GENERAL......................
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un largo maximo de datos.\n");
        int largo = Integer.parseInt(scanner.nextLine());
        MiPila<Integer> pilaEntero = new MiPila<Integer>(largo);
        MiPila<String> pilaString = new MiPila<String>(largo);
        MiPila<Double> pilaDouble = new MiPila<Double>(largo);
        MiPila<Character> pilaChar = new MiPila<Character>(largo);
        boolean salida = false;
        boolean terminarPalidromos = false;
        do{
            System.out.println("Ejercicios de Pila y Cola.\n");
            System.out.println("1)Implementar una Pila.\n");
            System.out.println("2)Comprobar Palidromos.\n");
            System.out.println("3)Expresiones Matematicas.\n");
            System.out.println("4)Implementar una Cola.\n");
            System.out.println("5)Ordenar una Cola.\n");
            System.out.println("6)Salir.\n");
            int seleccion = Integer.parseInt(scanner.nextLine());
            switch(seleccion){
                case 1:
                    System.out.println("Elija un tipo de dato para cargar en una pila.\n");
                    System.out.println("1)Enteros.\n");
                    System.out.println("2)String.\n");
                    System.out.println("3)Double.\n");
                    System.out.println("4)Char.\n");
                    System.out.println("5)Volver.\n");
                    int tipo = Integer.parseInt(scanner.nextLine());
                    if(tipo==1){
                        menu(pilaEntero);
                    }else if(tipo==2){
                        menu(pilaString);
                    }else if(tipo==3){
                        menu(pilaDouble);
                    }else if(tipo==4){
                        menu(pilaChar);
                    }else{
                        break;
                    }
                    break;
                case 2:
                    do{
                        System.out.println("Comprobar palidromos!!");
                        System.out.println("Ingrese una palabra o frase(Ej Anita lava la tina).\n");
                        String cadena = scanner.nextLine();
                        if(verificarPalidromo(cadena,largo)){
                            System.out.println("La cadena es un palíndromo.");
                        }else{
                            System.out.println("La cadena no es un palíndromo.");
                        }
                        System.out.println("Otra palabra?\n1)Si.\n2)No");
                        int s = Integer.parseInt(scanner.nextLine());
                        if(s==2){
                            terminarPalidromos = true;
                        }
                      }while(!terminarPalidromos);
                    break;
                case 3:
                    
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    salida = true;
                    break;
                default:
                    break;
            }
        }while(!salida);
        System.out.println("Saliendo del programa.\n");
    }
    public static boolean verificarPalidromo(String cadena,Integer max){
        MiPila<Character> pila = new MiPila<Character>(max);
        cadena = cadena.replaceAll(" ","").toLowerCase();// la parte (" ","")reemplaza el espacio en blanco por el "".
        //toLowerCase convierte CARACTERES EN MINUSCULAS y devuelve la cadena completa en minusculas.
        //charAt devuelve cada caracter por separado.
            int largo = cadena.length();
            for(int i = 0; i<largo/2 ;i++){//este for llena la primera mitad de la cadena en la pila.
                pila.push(cadena.charAt(i));
            }
            for(int i=(largo+1)/2;i<largo;i++){//y este for compara los de la primera mitad con los de la segunda q estan en largo.
                if(cadena.charAt(i) != pila.pop()){
                    return false;
                }
            }
            pila.makeEmpty();
            return true;
    }
}
