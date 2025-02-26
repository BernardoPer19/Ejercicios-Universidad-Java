
/**
 * Write a description of class Vuelo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vuelo
{
   private String numeroDeVuelo;
    private String destino;
    private String origen;
    private double precio;
    
    public Vuelo(String numeroDeVuelo, String destino , String origen , double precio){
        this.numeroDeVuelo = numeroDeVuelo;
        this.destino = destino;
        this.origen = origen;
        this.precio = precio;
    }
    
    public double getPrecio(){return precio;}
}
