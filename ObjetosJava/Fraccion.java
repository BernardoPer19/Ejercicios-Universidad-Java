
/**
 * Write a description of class Fraccion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fraccion{
    private int deno;
    private int nume;

    public Fraccion(int nume ,int deno ){

        this.nume= nume;

        
        if(deno != 0){
         this.deno= deno;
        }else{
        deno= 1;
        }
        
    }

    public int getDeno(){
        return deno;
    }

    public int getNume(){
        return nume;
    }
    
 
    public void showFraccion(){
        System.out.println(nume + "/" + deno);
    }
  
        
    public Fraccion multi(Fraccion f2){
    
    Fraccion res;
    int multN;
    int multD;
    multN = nume * f2.getNume();
    multD = deno * f2.getDeno();
    
    res = new Fraccion(multN,multD);
    
    return  res;
    
    }
    
      
    public Fraccion suma(Fraccion f2){
    int PTA ;
    int DT ;
    PTA = (nume * f2.getDeno() )+(deno * f2.getNume());
    
    DT = (deno * f2.getDeno());
    
    return new Fraccion(PTA, DT);
  
    }
    
    public Fraccion division(Fraccion f2 ){
        int pta;
        int dt;
         pta = nume * f2.getDeno();
         dt = deno * f2.getNume();
         
         return new Fraccion(dt , pta);
         
    }
    
    
    
}
