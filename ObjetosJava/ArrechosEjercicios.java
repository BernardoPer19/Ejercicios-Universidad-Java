import java.util.Scanner;

/*
a) Llenar el arreglo
b) Imprimir todos los elementos del arreglo
c) Imprimir los elementos que sean múltiplos de 5
d) Sumar todos los elementos del arreglo
e) Imprimir el promedio de todos los elementos del arreglo
f) Buscar e imprimir el mayor elemento del arreglo

 */

public class ArrechosEjercicios{

    public static void main(String[] args){

        int Arr[] = {1,2,3,4,5,6,7,8,9,10,12};
          double promedio;
          int suma = 0;
          int mayor = Arr[0];
        //multiplos de 5
        for(int i = 0; i < Arr.length ; i++){
            
            if(Arr[i] % 5 == 0){
                System.out.println();
            }
         
        } 
        
        // la suma de todo los elementos del arreglo
        for(int i = 0; i < Arr.length ; i++){
            
            suma += Arr[i];
            System.out.println("La Suma Del Array es: " );
            
        }
         //añadimos el prodio
        promedio = (double) suma / Arr.length;
        
        System.out.print("El promedio es: " );
        
        
          for(int i = 0; i < Arr.length ; i++){
            
           if(Arr[i] > mayor){
            
               mayor = Arr[i] ;
                
               
            }
            
        }
        
        
       System.out.print("el mayor es: " + mayor);
    }

}
