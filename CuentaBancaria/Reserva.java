
/**
 * Write a description of class Reserva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reserva
{
    private Vuelo[] vuelos;
    private int contador;
    
    public Reserva(int capacidad){
        this.contador = 0;
        this.vuelos = new Vuelo[capacidad];
    }
    
    public void agregarVuelo(Vuelo nuevoVuelo){
        if(contador < vuelos.length){
            vuelos[contador] = nuevoVuelo;
            contador++;
        }
    }
    
    public double calcularTotal(){
        double sumaTotal = 0;
        for(int i = 0 ; i< contador ; i++){
            sumaTotal += vuelos[i].getPrecio();
        }
        return sumaTotal;
    }
}
