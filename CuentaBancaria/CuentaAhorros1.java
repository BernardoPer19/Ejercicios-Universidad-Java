
/**
 * Write a description of class CuentaAhorros1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaAhorros1 
{
     private String titular;
     private double saldo;
     private double interes;
     
     public CuentaAhorros1(String titular,double saldoActual,double interes){
        this.titular = titular;
        this.saldo = saldoActual;
        this.interes = interes;
        }
        
    public double getSaldo(){return saldo;}
   public String getTitular(){return titular;}
   
   public void depositar(double cantidad){
    saldo += cantidad;
    }
    
   public void retirar(double cantidad){
    if(cantidad <= saldo){
        saldo -= cantidad;
    }else{
        System.out.println("no puedes retirar negativamente");
    }
    } 
    public void aplicarInteres(){
        saldo += saldo * interes;
    }
}
