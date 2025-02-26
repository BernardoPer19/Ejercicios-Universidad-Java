
/**

 */
public class ShoppingCars{
    Vehiculo arrVehiculos[];
    int count;
    ShoppingCars(int capacidad){
        this.arrVehiculos = new Vehiculo[capacidad];
        count = 0;
    }
    
    public boolean añadirCarro(Vehiculo newVehiculo){
    
        if(count < arrVehiculos.length){
            arrVehiculos[count] = newVehiculo;
            count++; 
            return true;
        }else{
            
            return false;
        }
    
    }
    
    
    public void mostrarLista(int pos){
          if (count == 0) {
            System.out.println("No hay vehículos en la lista.");
        } else if (pos >= 0 && pos < count) {
            // Mostrar un vehículo específico
            arrVehiculos[pos].showData();
        } else if (pos == -1) {
            // Mostrar toda la lista
            for (int i = 0; i < count; i++) {
                System.out.println("Vehículo " + (i + 1) + ":");
                arrVehiculos[i].showData();
            }
        } else {
            System.out.println("Posición inválida.");
        }
    }
        
    public void removeVehiculo(int pos){
    
        for(int i = pos - 1; i < count -1  ; i++){
            
            arrVehiculos[i] = arrVehiculos[i+1];
            
        }
    
        arrVehiculos[count-1]= null;
        count--;
        
    }
        
}
