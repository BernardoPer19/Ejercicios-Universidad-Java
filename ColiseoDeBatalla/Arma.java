
public class Arma{
    private String nombre;
    private String desc;
    private int dano;
    private boolean  esHerido;
    public Arma(String nombre ,String des){
        this.nombre=nombre;
        this.desc=desc;
    }
    
    public void getNombre(){
        System.out.print("arma: " + nombre);
    }
    
    public void getdesc(){
        System.out.print("arma: " + desc);
    }
    public int getDaño(){
        
        if(nombre == "espada"){
            dano = 25;
            System.out.print("\ndaño causado: " + dano);
        }else if(nombre == "lanza"){
            dano = 15;
            System.out.print("\ndaño causado: " + dano);
        }else if(nombre == "escudo"){
            dano = 10;
            System.out.print("\ndaño causado:: " + dano);
        }
        return dano;
        
    }
     
    public boolean fueDanado(){
        if(esHerido == false){
            return esHerido;
        }else{
           return esHerido = true; 
        }
    }
    
    
}




