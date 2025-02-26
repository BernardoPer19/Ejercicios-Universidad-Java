
/**
 * Write a description of class Nota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nota
{
   private String materia;
   private double calificacion;
   
   public Nota(String materia , double calificacion){
        this.materia = materia;
        this.calificacion = calificacion;  
    }
    
   public String getMateria(){return materia;} 
   public double getCalificacion(){return calificacion;}
   
   public boolean aprobo(){
    return calificacion >= 6.0;
    }
}
