
/**
 * Write a description of class Banco1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banco1
{
    private CuentaCorriente[] cuentaCorriente;
    private CuentaAhorros1[] cuentaAhorro;
    private int contadorCorr;
    private int contadorAhorr;
    
    public Banco1(int capacidadAhorro , int capacidadCorriente  ){
        this.contadorAhorr = 0;
        this.contadorCorr = 0;
        this.cuentaCorriente = new CuentaCorriente[capacidadCorriente];
        this.cuentaAhorro = new CuentaAhorros1[capacidadAhorro];
    }
    
    public void agregarCuentaCorr(CuentaCorriente newCuentaCor){
        if(contadorCorr < cuentaCorriente.length){
            cuentaCorriente[contadorCorr] = newCuentaCor;
            contadorCorr++;
        }
    }
    
    public void agregarCuentaAhorro(CuentaAhorros1 newCuentaAhorro){
        if(contadorAhorr < cuentaAhorro.length){
            cuentaAhorro[contadorAhorr] = newCuentaAhorro;
            contadorAhorr++;
        }
    }
    
    public void mostrarCuentaCorriente(){
        for(int i = 0 ; i< contadorCorr ; i++){
            System.out.println("titular " + cuentaCorriente[i].getTitular() +
                               "saldo " + cuentaCorriente[i].getSaldo() );
        }
    }
    
     public void mostrarCuentaAhorro(){
        for(int i = 0 ; i< contadorAhorr ; i++){
            System.out.println("titular " + cuentaAhorro[i].getTitular() +
                               "saldo " + cuentaAhorro[i].getSaldo() );
        }
    }
}
