
/**
 * Write a description of class CuentaCorriente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaCorriente
{
    private String titular;
   private double saldo;
   
   public CuentaCorriente(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
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
}
