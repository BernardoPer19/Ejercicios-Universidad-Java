
/**
d) Sumar todos los elementos del arreglo
e) Imprimir el promedio de todos los elementos del arreglo
f) Buscar e imprimir el mayor elemento del arreglo

System.out.println();
 */
public class ArrechosPractica1 {

    public static void main(String[] args) {
        int arr[] = {7, 1, 9, 3, 8, 5};
        int suma = 0;
        int mayor = arr[0];
        
        // Sumar todos los elementos y encontrar el mayor
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
            suma += arr[i];
            if(arr[i] > mayor){
                mayor = arr[i];
            }    

           
        }
        
        // Calcular el promedio
        double promedio = (double) suma / arr.length;
        
        System.out.println("\nLa suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
       System.out.println("El mayor es: " + mayor);
    }
}
