
/**
 * Write a description of class Arrechos4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrechos4{

    public static void main (String[] args){

        //escripción:
        //Dado un arreglo de cadenas, ordenar las palabras en orden ascendente según la longitud de cada palabra.

        //Ejemplo:

        //Entrada:
        String[] words = {"a", "cat", "banana", "dog", "elephant"};
        // Salida :[cat, dog, apple, banana, elephant]

        for(int i = 0; i < words.length -1 ; i++){
            for(int j = 0; j<words.length -i -1 ; j++){
            
                if(words[j].length()>  words[j+1].length()){
                    String aux = words[j];
                    words[j] = words[j+1];
                    words[j+1] = aux;
                }
            
            }
        }
    
        //forma de menor a mayor
        for(int i = 0; i < words.length; i++){
        
            System.out.print("\n" + words[i] );
        
        }
    
        
           //forma de mayor a menor
        for(int i = words.length - 1; i >= 0; i--){
            System.out.print("\n" + words[i] );
        
        }
    }

}
