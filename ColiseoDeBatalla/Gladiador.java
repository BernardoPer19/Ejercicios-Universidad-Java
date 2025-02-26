
/**

 */
public class Gladiador{
    private String nombre;
    private int edad;
    private double exp;
    private int contadorBestia; 
    private String tipoLucha;
    private int vida;
    private Bestia arrbestias[];
    private int maximoBestias = 3;
    private   Arma arma;
    private Bestia bestia;
    int hora = 1;
    public Gladiador(int vida,  Arma arma, Bestia bestia){
        //String nombre,int edad,double exp ,String tipoLucha,
        this.nombre=nombre;
        this.vida = vida;
        this.edad=edad;
        this.exp=exp;
        this.tipoLucha=tipoLucha;
        this.arrbestias = new Bestia[maximoBestias];  
        this.arma = arma;
        contadorBestia = 0; 
    }

    public void setVida(int vida){this.vida=vida;}

    public void mostrarData(){System.out.println("\nvida: " + vida);}

    public void hacerDaño(Gladiador peleador){
        int bajarVida =  peleador.getVida() - arma.getDaño();
        peleador.setVida(bajarVida);
    }

    public void entrenar(){
        exp = (exp * hora) + 8; 
    }

    public int getVida(){
        return vida;
    }

    public boolean añadirBestia(Bestia nuevaBestia){
        if(contadorBestia > arrbestias.length){
            System.out.print("el espacio esta lleno");
            return false;
        }else{
            contadorBestia++;
            arrbestias[contadorBestia] = nuevaBestia;
            return true;
        }

        
    }


}
