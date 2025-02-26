
/**
 * Write a description of class GestionTarea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GestionTarea
{
    private Tarea[] tareas;
    private int contador;
    
    public GestionTarea(int capacidad){
        this.contador = 0;
        this.tareas= new Tarea[capacidad];
    }
    
    
    public void agregarTarea(Tarea newTarea){
        if(contador < tareas.length){
            tareas[contador] = newTarea;
            contador++;
        }
    }
    
    
    public void prioridad(String prioridad){
        for(int i = 0 ; i< contador ; i++){
            if(tareas[i].getPrioridad().equals(prioridad)){
                System.out.println(i);
            }
        }
    }
    
    public void marcarTarea(String titulo){
        for(int i = 0; i< contador; i++){
            if(tareas[i].getTitulo().equals(titulo)){
                tareas[i].completar();
                System.out.println("se marco una tarea");
            }
        }
    }
    
    public void mostrarTareas(){
        for(int i = 0; i < contador ; i++){
            System.out.println(i);
        }
    }
}
