public class Historial 
{
    private int num1;
    private int num2;
    private int conv;
    private int factorial;
    private float resultado;
    private String operacion;
    public Historial(int num1, int num2, int conv, int factorial ,float resultado, String operacion){
    this.num1=num1;
    this.num2=num2;
    this.conv=conv;
    this.factorial=factorial;
    this.operacion=operacion;
    this.resultado=resultado;
    }
    @Override
    public String toString(){
        if(factorial != 0){
            return "---Numero: "+factorial+" Operacion: "+operacion+" Resultado: "+resultado;
        }else if(conv != 0){ 
            return "---Numero: "+conv+" Operacion: "+operacion+" Resultado: "+resultado;
        }else{
            return "---Numero1: "+num1+" Numero2: "+num2+" Operacion: "+operacion+" Resultado: "+resultado;
        }
    }
}
