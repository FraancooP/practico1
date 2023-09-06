import java.util.Scanner;
public class Main
{
    public Main()
    {
        boolean salida = false;
        Scanner scanner = new Scanner(System.in);
        Recursividad recu = new Recursividad();
        do{
            System.out.println("Elija una opcion(corresponde a cada ejerecicio).\n");
            System.out.println("1)Factorial de un numero.\n");
            System.out.println("2)Suma de n Enteros.\n");
            System.out.println("3)Potencia de un numero.\n");
            System.out.println("4)Imprimir un conteo.\n");
            System.out.println("5)Producto de dos numeros.\n");
            System.out.println("6)Imprimir arreglo inverso.\n");
            System.out.println("7)Contar unos en binario de un numero.\n");
            System.out.println("8)Salir.\n");
            int op = Integer.parseInt(scanner.nextLine());
            switch(op){
                case 1:
                    System.out.println("Ingrese un numero.\n");
                    recu.setN1(Integer.parseInt(scanner.nextLine()));
                    recu.calcularFactorial();
                    break;
                case 2:
                    System.out.println("Ingrese un numero.\n");
                    recu.setN1(Integer.parseInt(scanner.nextLine()));
                    recu.calcularSuma();
                    break; 
                case 3:
                    System.out.println("Ingrese un numero.\n");
                    recu.setN1(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Ingrese una potencia.\n");
                    recu.setN2(Integer.parseInt(scanner.nextLine()));
                    recu.calcularExponente();
                    break;
                case 4:
                    System.out.println("Ingrese un numero.\n");
                    recu.setN1(Integer.parseInt(scanner.nextLine()));
                    recu.realizarConteo();
                    break;
                case 5:
                    System.out.println("Ingrese un numero.\n");
                    recu.setN1(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Ingrese el segundo numero.\n");
                    recu.setN2(Integer.parseInt(scanner.nextLine()));
                    recu.calcularProducto();
                    break; 
                case 6:
                    System.out.println("Elija tamaño del arreglo.\n");
                    recu.setN1(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Elija numero maximo del arreglo.\n");
                    recu.setN2(Integer.parseInt(scanner.nextLine()));
                    recu.imprimirArreglo();
                    break;
                case 7:
                    System.out.println("Ingrese un numero.\n");
                    recu.setN1(Integer.parseInt(scanner.nextLine()));
                    recu.contarBinario();
                    break;
                case 8:
                    salida = true;
                    break;
                default:
                    System.out.println("Opcion no valida.\n");
                    break;
            }
        }while(!salida);
        System.out.println("Saliendo del sistema.");
    }
}
