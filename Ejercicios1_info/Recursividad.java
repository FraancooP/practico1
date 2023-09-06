import java.util.Random;
public class Recursividad
{
    //Atributos.
    private int n1;
    private int n2;
    public Recursividad() {
        n1 = 0;
        n2 = 0;
    }
    public void setN1(int n1){
        this.n1=n1;
    }
    public int getN1(){
        return n1;
    }
    public void setN2(int n2){
        this.n2=n2;
    }
    public int getN2(){
        return n2;
    }
    public void calcularFactorial(){
        System.out.println("El factorial de "+n1+" es: " + factorial(n1));
    }
    public static int factorial(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    public void calcularSuma(){
        System.out.println("La suma de "+n1+" es: " + suma(n1));
    }
    public int suma(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return n + factorial(n-1);
        }
    }
    public void calcularExponente(){
        System.out.println("El numero "+n1+" elevado a la "+n2+" es: "+potencia(n1,n2));
    }
    public int potencia(int n1, int n2){
    if(n2==0){
        return 1;
    }else if(n2 == 1){
        return n1;
    }else if(n2 < 0){
        return -1;
    }else{
        return n1*potencia(n1,(n2-1));
    }
    }
    public void realizarConteo(){
        System.out.println("Conteo de "+n1+" es: \n");
        conteo(n1);
    }
    public int conteo(int n){
        if(n==0){
            System.out.println(n);
            return 0;
        }else{
            System.out.println(n);
            return n - conteo(n-1);
        }
    }
    public void calcularProducto(){
        System.out.println("El producto de "+n1+" X "+n2+" es:"+producto(n1,n2));
    }
    public int producto(int n1, int n2){
        if(n2==0){
            return 0;
        }else if(n2==1){
            return n1;
        }else{
            return n1+producto(n1,n2-1);
        }
    }
    public void imprimirArreglo(){
        Random random = new Random();
        int[] array = new int[n1];
        for(int i=0;i<n1;i++){
            array[i]=random.nextInt(n2);
        }
        System.out.println("Mostrando arreglo generado normal:\n");
        for(int i=0;i<n1;i++){
            System.out.println(array[i]);
        }
        System.out.println("Mostrando arreglo a la inversa de manera recursiva:\n");
        mostrarArreglo(array,n1-1);
    }
    public int mostrarArreglo(int a[],int n){
        if(n==0){
            return a[0];
        }else{
            System.out.println(a[n]);
            return mostrarArreglo(a,n-1);
        }
    }
    public void contarBinario(){
        System.out.println("El numero "+n1+" posee : " + binario(n1) +" unos en su forma binaria.\n");
        System.out.println("El numero "+n1+" en binario es: ");
        convertirBinario(n1);
        System.out.println("\n");
    }
    public int binario(int n){
        if(n==0){
            return 0;
        }
        if(n % 2 == 1){
            return binario(n/2)+1;
        }else{
            return binario(n/2);
        }
    }
    public int convertirBinario(int n){
        if(n > 1){
            convertirBinario(n/2);
        }
        System.out.print(n % 2);
        return 0;
    }
        
}
