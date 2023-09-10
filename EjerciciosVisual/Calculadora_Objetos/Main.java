import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calculo calculos = new Calculo();
        boolean salir = false;
        System.out.println("Ingrese 2 numeros para operar");
        try{
            calculos.setNum1(Integer.parseInt(scanner.nextLine()));
            calculos.setNum2(Integer.parseInt(scanner.nextLine()));
        }catch(NumberFormatException e){//Intentamos convertir cadena en numero.
            System.out.println("Error: Ingrese un numero valido.\n");
            return;
        }
        do{
            System.out.println("1)Sumar los 2 numeros.\n");
            System.out.println("2)Restar los 2 numeros.\n");
            System.out.println("3)Multiplicar los 2 numeros.\n");
            System.out.println("4)Dividir los 2 numeros.\n");
            System.out.println("5)Convertir a binario un numero.\n");
            System.out.println("6)Calcular el factorial de un numero.\n");
            System.out.println("7)Agregar nuevos valores.\n");
            System.out.println("8)Mostrar Historial de Calculos.\n");
            System.out.println("9)Salir.\n");
            int opcion = Integer.parseInt(scanner.nextLine());
            switch(opcion){
                case 1:
                    calculos.sumar();
                    break;
                case 2:
                    calculos.restar();
                    break;
                case 3:
                    calculos.multiplicar();
                    break;
                case 4:
                    calculos.dividir();
                    break;
                case 5:
                    System.out.println("Ingrese el numero que desea convertir.\n");
                    try{
                        calculos.setConv(Integer.parseInt(scanner.nextLine()));
                        calculos.conversion();
                    }catch(NumberFormatException e){
                        System.out.println("Error: Ingrese un numero valido.\n");
                    }
                    break;
                case 6:
                    System.out.println("Ingrese el numero.\n");
                    try{
                        calculos.setFactorial(Integer.parseInt(scanner.nextLine()));
                        calculos.calcular_factorial();
                    }catch(NumberFormatException e){
                        System.out.println("Error: Ingrese un numero valido.\n");
                    }
                    break;
                case 7:
                    System.out.println("Ingrese los nuevos valores.\n");
                    try{
                        calculos.setNum1(Integer.parseInt(scanner.nextLine()));
                        calculos.setNum2(Integer.parseInt(scanner.nextLine()));
                    }catch(NumberFormatException e){
                        System.out.println("Error: Ingrese un numero valido.\n");
                    }
                    break;
                case 8:
                    System.out.println("Mostrando Historial Completo.\n");
                    calculos.historial();
                    break;
                case 9:
                    salir = true;
                    break;
                default:
                    System.out.println("No se eligio ninguna Opcion Proporcionada.\n");
                    break;
            }
        }while(!salir);
        System.out.println("Gracias, que tenga un buen dia.\n");
    }
}
