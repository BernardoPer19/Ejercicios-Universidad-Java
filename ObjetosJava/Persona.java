
/**
Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.
Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.). Sexo sera hombre por defecto, usa una constante para ello.
Se implantaran varios constructores:

Un constructor por defecto.
Un constructor con el nombre, edad y sexo, el resto por defecto.

Un constructor con todos los atributos como parámetro.

Los métodos que se implementaran son:

calcularIMC():   calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)), si esta fórmula devuelve un valor menor que 20, la función devuelve un -1,
                 si devuelve un número entre 20 y 25 (incluidos,significa que esta por debajo de su peso ideal la función devuelve un 0  y si devuelve un valor mayor que 25 significa
                 que tiene sobrepeso, la función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.



                 esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
                 
                comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior.

                toString(): devuelve toda la información del objeto.

                generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente. Este método sera invocado cuando se construya el objeto.
                Puedes dividir el método para que te sea más fácil. No será visible al exterior. Métodos set de cada parámetro, excepto de DNI.
 */
public class Persona{
  
    private String name;
    private int age, DNI;
    private char Gen ;
    private double height, weight;
    
    
    private int BajoPeso = -1;
    private int BuenPeso = 0;
    private int SobrePeso = 1;
    
    public Persona(String name, int age, char Gen ,double height, double weight ){
        this.name = name;
        this.age = age;
        this.Gen = ComprobarGenero(Gen);
        this.height = height;
        this.weight = weight;
        generaDNI();
    }
    
    public double height(){
        return height;
    }
    
     public double weight(){
        return weight;
    }

    
    public int getIMC(){
        
        double IMC;
        
        IMC = weight / (height * height);
        
        if(IMC < 20){
            return BajoPeso;
        }else if(IMC > 20 && IMC <= 25){
            return  BuenPeso;
        }else{
            return  SobrePeso;
        }
        
   
    }
    
    public boolean ComprobarEdad(){
        
        boolean mayor = false;
        
        if(age> 18){
            return mayor = true;
        }else{
            return mayor = false;
        }
        
    }
     public String getName() {
        return name;
    }
    
     public int getAge() {
        return age;
    }

    private char ComprobarGenero(char sexo){
          
        if(sexo == 'h' || sexo == 'f'){
           return sexo;
        }
           return 'h';
    } 
    
    
    public void MostrarDetalles(){
        System.out.println("Nombre:" + name);
         System.out.println("Edad: " + age);
          System.out.println("height: " + height);
           System.out.println("weight:" + weight);
           System.out.println("Gen:" + Gen);
           System.out.println("DNI" + generaDNI());
           
    }
    
    
    private int generaDNI (){
        
        this.DNI = (int) (Math.random() * 1000000);
        
        return DNI;
    }
    
}
