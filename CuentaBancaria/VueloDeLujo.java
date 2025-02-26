
/**
 * Write a description of class VueloDeLujo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VueloDeLujo extends Vuelo
{
    
    protected String asientoVip;
    
    public VueloDeLujo(String numeroVuelo, String origen, String destino, double precio,String asientoVip) {
        super(numeroVuelo, origen, destino, precio);
        this.asientoVip =  asientoVip;
    }
    
    
    
    
}

