import java.util.Scanner;
public class Main
{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            Ordenamiento orde = new Ordenamiento();
            boolean salida = false;
            String mostrar;
            System.out.println("Metodos de ordenamientos.\n");
            System.out.println("Primero, ingrese un largo maximo del arreglo.\n");
            orde.setMax(Integer.parseInt(scanner.nextLine()));
            do{
                System.out.println("Seleccione un metodo de ordenamiento.\n");
                System.out.println("1)Ordenamiento Inserción.\n");
                System.out.println("2)Ordenamiento ShellSort.\n");
                System.out.println("3)Ordenamiento QuickSort.\n");
                System.out.println("4)Asignar nuevo rango a los arreglos.\n");
                System.out.println("5)Comparar tiempos de todos los ordenamientos registrados.\n");
                System.out.println("6)Salir del programa.\n");
                int op = Integer.parseInt(scanner.nextLine());
                switch(op){
                    case 1:
                        orde.generarArreglo();
                        System.out.println("Se generaron 3 nuevos arreglos desordenados de tipo: Char,Int,double en funcion al largo establecido.");
                        System.out.println("¿Desea mostrar los arreglos?(S/N)");
                        mostrar = scanner.nextLine();
                        if("s".equalsIgnoreCase(mostrar)){
                            orde.imprimirArreglos();
                        }
                        orde.ordenamientoInsercion();
                        System.out.println("Los arreglos ya estan ordenados, ¿Desea mostrarlos?(S/N)");
                        mostrar = scanner.nextLine();
                        if("s".equalsIgnoreCase(mostrar)){
                            orde.imprimirArreglos();
                        }
                        break;
                    case 2:
                        orde.generarArreglo();
                        System.out.println("Se generaron 3 nuevos arreglos desordenados de tipo: Char,Int,double en funcion al largo establecido.");
                        System.out.println("¿Desea mostrar los arreglos?(S/N)");
                        mostrar = scanner.nextLine();
                        if("s".equalsIgnoreCase(mostrar)){
                            orde.imprimirArreglos();
                        }
                        orde.ordenamientoShell();
                        System.out.println("Los arreglos ya estan ordenados, ¿Desea mostrarlos?(S/N)");
                        mostrar = scanner.nextLine();
                        if("s".equalsIgnoreCase(mostrar)){
                            orde.imprimirArreglos();
                        }
                        break;
                    case 3:
                        orde.generarArreglo();
                        System.out.println("Se generaron 3 nuevos arreglos desordenados de tipo: Char,Int,double en funcion al largo establecido.");
                        System.out.println("¿Desea mostrar los arreglos?(S/N)");
                        mostrar = scanner.nextLine();
                        if("s".equalsIgnoreCase(mostrar)){
                            orde.imprimirArreglos();
                        }
                        orde.ordenamientoQuickSort();
                        System.out.println("Los arreglos ya estan ordenados, ¿Desea mostrarlos?(S/N)");
                        mostrar = scanner.nextLine();
                        if("s".equalsIgnoreCase(mostrar)){
                            orde.imprimirArreglos();
                        }
                        break;
                    case 4:
                        System.out.println("Ingrese el nuevo largo de arreglos.\n");
                        orde.setMax(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 5:
                        orde.tiemposRegistrados();
                        break;
                    case 6:
                        salida = true;
                        break;
                    default:
                        System.out.println("No se selecciono una opcion valida ☻\n");
                        break;
                }
            }while(!salida); 
            System.out.println("Saliendo del programa☺.\n");
        }
}
