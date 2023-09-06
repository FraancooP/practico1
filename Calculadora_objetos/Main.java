//Algunas mejoras que se deben realizar:
/*
 * visto por gpt........
1)Separación de Responsabilidades: En el diseño actual, la clase Calculo está realizando tanto las operaciones matemáticas como 
el manejo del historial. Sería beneficioso dividir estas responsabilidades en clases separadas para seguir el principio de 
responsabilidad única.

2)Uso de Excepciones: En el método dividir() de la clase Calculo, estás realizando una división sin manejar el caso de división
por cero. Deberías considerar agregar manejo de excepciones para evitar que el programa falle en este escenario.

3)Mejoras en la Conversión a Binario: El método binario() dentro de la clase Calculo tiene un pequeño problema. Debes devolver
el resultado de la llamada recursiva en la línea binario(n/2);, ya que actualmente estás descartando el valor devuelto y
siempre retornas 0. Además, podrías mejorar la forma en que muestras el resultado binario concatenando los dígitos en lugar 
de imprimirlos en cada llamada recursiva.

4)Uso de Variables de Clase: En la clase Historial, tienes varias variables que están relacionadas con diferentes tipos de operaciones.
Sería más limpio y eficiente tener una única variable que almacene el tipo de operación en lugar de tener múltiples variables 
para diferentes operaciones.

5)Validación de Entradas: Agrega validación de entradas para asegurarte de que los números ingresados sean válidos y que no haya 
errores de formato al parsear los valores.

6)Uso de Métodos Estáticos: Algunos de los métodos en la clase Calculo podrían ser estáticos, como el método binario() y el
método fac(), ya que no requieren acceso a las propiedades de instancia.

7)Mantenimiento del Historial: Puedes considerar agregar una limitación al tamaño del historial para evitar que crezca 
indefinidamente y consuma demasiada memoria.

8)Interfaz de Usuario: Podrías mejorar la interfaz de usuario con un mejor formato de impresión y mensajes más claros 
para guiar al usuario en las operaciones.

9)Documentación: Agrega comentarios en tu código para explicar qué hace cada método y cómo funciona el programa en general. 
Esto facilitará la lectura y el mantenimiento del código en el futuro.

10)Manejo de Errores: Agrega manejo de errores y excepciones para que el programa no falle inesperadamente en caso de
situaciones no deseadas.
*/
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
