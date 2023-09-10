/**
a. Crea un programa que verifique si una cadena es un palíndromo (se
lee igual de izquierda a derecha y de derecha a izquierda).
b. Primero elimina espacios en blanco y convierte la cadena a
minúsculas. Luego, llena una pila con la primera mitad de los
caracteres de la cadena y compara los caracteres de la segunda mitad
con los elementos desapilados de la pila para determinar si es un
palíndromo.*/
import java.util.Scanner;
public class Main
{
    public static boolean verificarPalidromo(String cadena){
        MiPila<Character> pila = new MiPila<Character>();
        cadena = cadena.replaceAll(" ","").toLowerCase();// la parte (" ","")reemplaza el espacio en blanco por el "".
        //toLowerCase convierte CARACTERES EN MINUSCULAS y devuelve la cadena completa en minusculas.
        //charAt devuelve cada caracter por separado.
            int largo = cadena.length();
            for(int i = 0; i<largo/2 ;i++){//este for llena la primera mitad de la cadena en la pila.
                pila.push(cadena.charAt(i));
            }
            for(int i=(largo+1)/2;i<largo;i++){//y este for compara los de la primera mirad con los de la segunda q estan en largo.
                if(cadena.charAt(i)!=pila.pop()){
                    return false;
                }
            }
            return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean salida = false;
        do{
            System.out.println("Comprobar palidromos!!");
            System.out.println("Ingrese una palabra o frase(Ej Anita lava la tina).\n");
            String cadena = scanner.nextLine();
            if(verificarPalidromo(cadena)==true){//no hace falta este true.
                System.out.println("La cadena es un palíndromo.");
            }else{
                System.out.println("La cadena no es un palíndromo.");
            }
            System.out.println("Otra palabra?\n1)Si.\n2)No");
            int s = Integer.parseInt(scanner.nextLine());
            if(s==2){
                salida = true;
            }
        }while(!salida);
        System.out.println("Saliendo.....\n");
    }
}
