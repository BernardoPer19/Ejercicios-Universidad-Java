
public class Ciudad{

    private Inmuebles[] arrInmuebles;
    int capacidadDeEdificios = 10000;
    int contadorDeCasas = 0;
    public Ciudad(){ 
        this.arrInmuebles = new Inmuebles[capacidadDeEdificios];
    }

    public boolean añadirInm(Inmuebles nuevoInmueble){
        if(contadorDeCasas >= arrInmuebles.length){
            return false;
        }else{
           
            arrInmuebles[contadorDeCasas] = nuevoInmueble;  
             contadorDeCasas++;
            return true; 
        }

    }
    
    public void removerInm(int pos){
    
        if(contadorDeCasas <= 0){System.out.print("no se pueden añadir mas");}
        else{
        
        for(int i = pos -1 ; i < contadorDeCasas ; i++){
            arrInmuebles[i] = arrInmuebles[i+1];
        }
        
        arrInmuebles[pos]  = null;
        contadorDeCasas--;
        
        }
    
    }
    
   public void ordernarCasasID() {
    for (int i = 0; i < contadorDeCasas - 1; i++) {
        for (int j = 0; j < contadorDeCasas - 1 - i; j++) {
           
                if (arrInmuebles[j].getID() > arrInmuebles[j + 1].getID()) {
                    Inmuebles aux = arrInmuebles[j + 1];
                    arrInmuebles[j + 1] = arrInmuebles[j];
                    arrInmuebles[j] = aux;
                }
            
        }
    }
}


    public void mostrarInmuebles(){
        for(int i=0 ; i<contadorDeCasas ; i++){
            if (arrInmuebles[i] != null) {

                System.out.println("Inmueble ID: " + arrInmuebles[i].getID());
 
                System.out.println("Dirección: " + arrInmuebles[i].getdireccion());
                System.out.println("Habitaciones: " + arrInmuebles[i].gethabitaciones());
                System.out.println("Baños: " + arrInmuebles[i].getbaños());
                System.out.println("Área: " + arrInmuebles[i].getareaTotal());
                System.out.println("-----------------------------");
            }
        }

    }

    
    
    
}
