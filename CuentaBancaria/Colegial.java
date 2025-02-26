
/**
 * Write a description of class Colegial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Colegial
{
    private String nombre;
    private Nota[] notas;
    private int contador;
    
    
    public Colegial(int capacidad , String nombre){
        this.nombre = nombre;
        this.contador = 0;
        this.notas = new Nota[capacidad];
    }
    
    
    public void agregarNota(Nota nuevaNota){
        if(contador < notas.length){
         notas[contador] = nuevaNota;
         contador++;
        }
    }
    
    public double calcularPromedio(){
        double suma = 0;
        for(int i = 0; i< contador ; i++){
            suma+= notas[i].getCalificacion();
        }
        if(contador == 0){
        return 0 ;
        }
        return suma/contador;
    }
    
    public void mostrarNotas(){
        for(int i = 0 ; i < contador ; i++){
            System.out.println("materia" + notas[i].getMateria() + "calificaciones " + notas[i].getCalificacion());
        }
    }
}
