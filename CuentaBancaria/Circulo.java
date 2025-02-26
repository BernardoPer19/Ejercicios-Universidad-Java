
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo extends Figura
{
    protected double radio;
    
    public Circulo(double radio){
        super("circulo");
        this.radio = radio;
    }
    
    public double calcularArea(){
        return Math.PI * radio * radio;
    }
    
}
