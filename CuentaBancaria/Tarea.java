
/**
 * Write a description of class Tarea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tarea{
    private String titulo;
    private String descripcion;
    private String prioridad;
    private String estado;
    
    
    public Tarea(String titulo,String descripcion,String prioridad,String estado){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = "pendiente";
    }
    
    public String getTitulo(){return titulo;}
    public String getDescripcion(){return descripcion;}
    public String getPrioridad(){return prioridad;}
    public String getEstado(){return estado;}
    public void completar(){ 
        this.estado = "COMPLETADO";
    }
    public void agregarTarea(Tarea nuevaTarea){
        
    }
}
