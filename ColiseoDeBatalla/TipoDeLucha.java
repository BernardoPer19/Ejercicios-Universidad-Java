
/**
 * Write a description of class ArmaPelea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TipoDeLucha{
    private String Tipo;
    private String desc;
    
    public TipoDeLucha(String Tipo ,String des){
        this.Tipo=Tipo;
        this.desc=desc;
    }
    
    public void getNombre(){
        System.out.print("tipo: " + Tipo);
    }
    
    public void getdesc(){
        System.out.print("info del tipo: " + desc);
    }
    
    
    
   public String getTipodDePelea(){
        
        if(Tipo == "fuego"){
           
        }else if(Tipo == "mixto"){
            
        }else if(Tipo == "defensivo"){
            
        }
        return Tipo;
        
    }
     

    
    
}
