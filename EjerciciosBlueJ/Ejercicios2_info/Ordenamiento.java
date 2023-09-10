import java.util.Random;
import java.util.ArrayList;
import java.util.List;
public class Ordenamiento
{
     private int max;
     private int[] arregloEnteros;
     private double[] arregloDouble;
     private char[] arregloChar;
     private List<Tiempos> lista;
    //Constructor
    public Ordenamiento()
    {
        this.lista = new ArrayList<>();
    }
    public void iniciarArreglos(){//creo este constructor para activarlo en el momento que se ingrese el largo de los arreglos
        //de no ser asi, los valores se van a setear a "null" o a "0" depende de como los inicie.
        arregloEnteros = new int[max];
        arregloDouble = new double[max];
        arregloChar = new char[max];
    }
    public void setLista(List<Tiempos> lista){
        this.lista=new ArrayList<>();
    }
    public List<Tiempos> getLista(){
        return this.lista;
    }
    public void setMax(int max){
        this.max=max;
        iniciarArreglos();//iniciamos los arreglos luego que se setea el max
    }
    public int getMax(){
        return max;
    }
    //Constructor
    public void generarArreglo(){
        Random random = new Random();
        for(int i=0;i<arregloEnteros.length;i++){
            arregloEnteros[i]=random.nextInt(1000);
            arregloDouble[i]=random.nextDouble();
            arregloChar[i]=(char) (random.nextInt(90-65)+65);//El truco es convertir en ascci los valores del 65 añ 90, ya que
            //tenemos la letra A en 65 y en 90 la Z, solo queda generar numeros aleatorios entre esos valores y convertirlos a char.
            
        }
    }
    public void imprimirArreglos(){//Estaria bueno hacer una recursiva que imprima los arreglos y comprar esos tiempos entre el for each
        //y la funcion recursiva............
        System.out.print("Arreglo de Enteros: ");
        for (int i : arregloEnteros) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Arreglo de Doubles: ");
        for(double d : arregloDouble){
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.print("Arreglo de Chars: ");
        for (char c : arregloChar) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    public void ordenamientoInsercion() {
        //los "st" y los "et" referencian a StarTime y EndTime de cada caso 1 enteros, 2 double 3 char......
        long st1 = System.nanoTime();
        for (int i = 1; i < arregloEnteros.length; i++) {
            int current = arregloEnteros[i];
            int j;
            for (j = i - 1; j >= 0 && arregloEnteros[j] > current; j--) {
                arregloEnteros[j + 1] = arregloEnteros[j];
            }
            arregloEnteros[j + 1] = current;
        }
        long et1 = System.nanoTime();
        //-------------------------------------------------------------------------------------------
        long st2 = System.nanoTime();
        for (int i = 1; i < arregloDouble.length; i++) {
            double current = arregloDouble[i];
            int j;
            for (j = i - 1; j >= 0 && arregloDouble[j] > current; j--) {
                arregloDouble[j + 1] = arregloDouble[j];
            }
            arregloDouble[j + 1] = current;
        }
        long et2 = System.nanoTime();
        //-------------------------------------------------------------------------------------------
        long st3 = System.nanoTime();
        for (int i = 1; i < arregloChar.length; i++) {
            char current = arregloChar[i];
            int j;
            for (j = i - 1; j >= 0 && arregloChar[j] > current; j--) {
                arregloChar[j + 1] = arregloChar[j];
            }
            arregloChar[j + 1] = current;
        }
        long et3 = System.nanoTime();
        //-------------------------------------------------------------------------------------------
        long t1 = (et1 - st1) / 1000000;
        long t2 = (et2 - st2) / 1000000;
        long t3 = (et3 - st3) / 1000000;
        System.out.println("Arreglos ordenados.\n");
        System.out.println("Tiempos captados:.\n");
        System.out.println("Enteros: " + t1 + " ms " + " doubles: " + t2 + " ms " + " chars " + t3 + " ms.\n");
        lista.add(new Tiempos(t1,t2,t3,"Insercion",max));
    }

    public void ordenamientoShell(){
        long st1 = System.nanoTime();
        int gap,i,j;
        int e;
        for(gap = max/2;gap > 0; gap /=2){
            for (i = gap; i < arregloEnteros.length; i++){
                e = arregloEnteros[i];
                    for (j = i; j >= gap && arregloEnteros[j - gap] > e; j -= gap){
                        arregloEnteros[j] = arregloEnteros[j - gap];
                    }
                arregloEnteros[j] = e;
            }
        }
        long et1 = System.nanoTime();
        //-------------------------------------------------------------------------------------------
        long st2 = System.nanoTime();
        double d;
        for(gap = max/2;gap > 0; gap /=2){
            for (i = gap; i < arregloDouble.length; i++){
                d = arregloDouble[i];
                    for (j = i; j >= gap && arregloDouble[j - gap] > d; j -= gap){
                        arregloDouble[j] = arregloDouble[j - gap];
                    }
                arregloDouble[j] = d;
            }
        }
        long et2 = System.nanoTime();
        //-------------------------------------------------------------------------------------------
        long st3 = System.nanoTime();
        char c;
        for(gap = max/2;gap > 0; gap /=2){
            for (i = gap; i < arregloChar.length; i++){
                c = arregloChar[i];
                    for (j = i; j >= gap && arregloChar[j - gap] > c; j -= gap){
                        arregloChar[j] = arregloChar[j - gap];
                    }
                arregloChar[j] = c;
            }
        }
        long et3 = System.nanoTime();
        //-------------------------------------------------------------------------------------------
        long t1 = (et1 - st1) / 1000000;
        long t2 = (et2 - st2) / 1000000;
        long t3 = (et3 - st3) / 1000000;
        System.out.println("Arreglos ordenados.\n");
        System.out.println("Tiempos captados:.\n");
        System.out.println("Enteros: " + t1 + " ms " + " doubles: " + t2 + " ms " + " chars " + t3 + " ms.\n");
        lista.add(new Tiempos(t1,t2,t3,"Shellsort",max));
    }
    public void ordenamientoQuickSort(){//No se me ocurio una manera de usar una unica funcion para cada arreglo, asi q las separe segun
        //el tipo de datos.
        long st1 = System.nanoTime();
        quicksortEnteros(arregloEnteros,0,max-1);
        long et1 = System.nanoTime();
        //-------------------------------------------------------------------------------------------
        long st2 = System.nanoTime();
        quicksortDoubles(arregloDouble,0,max-1);
        long et2 = System.nanoTime();
        //-------------------------------------------------------------------------------------------
        long st3 = System.nanoTime();
        quicksortChars(arregloChar,0,max-1);
        long et3 = System.nanoTime();
        //-------------------------------------------------------------------------------------------
        long t1 = (et1 - st1) / 1000000;
        long t2 = (et2 - st2) / 1000000;
        long t3 = (et3 - st3) / 1000000;
        System.out.println("Arreglos ordenados.\n");
        System.out.println("Tiempos captados:.\n");
        System.out.println("Enteros: " + t1 + " ms " + " doubles: " + t2 + " ms " + " chars " + t3 + " ms.\n");
        lista.add(new Tiempos(t1,t2,t3,"Shellsort",max));
    }
    public static void quicksortEnteros(int[] item, int left, int right){
        int i, j, temp;
        i = left;
        j = right;
        do {
            while (item[j] > item[i] && j > i) j--;
            if (i < j) {
                temp = item[i];
                item[i] = item[j];
                item[j] = temp;
                i++;
            }
            while (item[i] < item[j] && i < j) i++;
            if (i < j) {
                temp = item[i];
                item[i] = item[j];
                item[j] = temp;
                j--;
            }
        } while (i < j);
        if (left < j) quicksortEnteros(item, left, j - 1);
        if (i < right) quicksortEnteros(item, i + 1, right);
        }
    public static void quicksortDoubles(double[] item, int left, int right){
        int i, j;
        double temp;
        i = left;
        j = right;
        do {
            while (item[j] > item[i] && j > i) j--;
            if (i < j) {
                temp = item[i];
                item[i] = item[j];
                item[j] = temp;
                i++;
            }
            while (item[i] < item[j] && i < j) i++;
            if (i < j) {
                temp = item[i];
                item[i] = item[j];
                item[j] = temp;
                j--;
            }
        } while (i < j);
        if (left < j) quicksortDoubles(item, left, j - 1);
        if (i < right) quicksortDoubles(item, i + 1, right);
        }
    public static void quicksortChars(char[] item, int left, int right){
        int i, j;
        char temp;
        i = left;
        j = right;
        do {
            while (item[j] > item[i] && j > i) j--;
            if (i < j) {
                temp = item[i];
                item[i] = item[j];
                item[j] = temp;
                i++;
            }
            while (item[i] < item[j] && i < j) i++;
            if (i < j) {
                temp = item[i];
                item[i] = item[j];
                item[j] = temp;
                j--;
            }
        } while (i < j);
        if (left < j) quicksortChars(item, left, j - 1);
        if (i < right) quicksortChars(item, i + 1, right);
        }
    public void tiemposRegistrados(){
        for(Tiempos t : lista){
            System.out.println(t.toString());
        }
    }
}
