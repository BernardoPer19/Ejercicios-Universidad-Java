
/**
 * Write a description of class Rectangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangulo extends Figura
{
    protected double ancho;
    private double largo;
    
    public Rectangulo(double ancho , double largo){
        super("rectangulo");
        this.ancho = ancho;
        this.largo = largo;
    }
    
    
    public double calcularArea(){
        return ancho * largo;
    }
}
