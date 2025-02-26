/**

//*1) Dado un arreglo de n caracteres (char), busque cuántas veces se repite el caracter k.
//!2) Ordene un arreglo de n caracteres usando el ordenamiento burbuja. (pag 141)
//!3) Ordene un arreglo de n números y luego busque el número k.

//!4) Intercale dos arreglos de diferente tamaño
A = {2, 8, 14}
B = { 1,  5, 19,  25,  29}
y el resultado debería ser:
C = {2, 1, 8, 5, 14, 19, 25, 29}

//!5) Dados 2 arreglos A y B
A = {2, 19, 14,   33,  200, 5,  88, 90}
B =  {1, 5, 19,  25,  29}
Diga que elementos coinciden, por ejemplo:
C = {19, 5}

 */

public class Arrechos2{
    public static void main(String[] args){
        //* 1) Dado un arreglo de n caracteres (char), busque cuántas veces se repite el caracter k.
        // public static void main(String[] args){

        //     char Arr[] = {'a','b','a','a','b'};
        //     int repetidos = 1;
        //     int eRep = Arr[0];
        //     for(int i = 1 ; i <= Arr.length - 1 ; i++){
        //         if(Arr[i] == eRep){
        //             repetidos++;
        //             System.out.println("Los Repetidos son: " + repetidos);
        //         }
        //     }

        // }

        //**2) Ordene un arreglo de n caracteres usando el ordenamiento burbuja. (pag 141)**/

        // int Arr[] = {76,31,5,64,24,53,63,6,74,124,14,2525,235,134,1};
        // int aux ;

        // for(int i  = 0; i < Arr.length - 1; i++){

        //     for(int j = 0 ; j< Arr.length -1; j++){

        //         if(Arr[j] > Arr[j+1]){
        //             aux = Arr[j];
        //             Arr[j] = Arr[j+1];
        //             Arr[j+1] = aux;
        //         }

        //     }
        // }

        // //forma creciente la Array:}
        // System.out.println("\nforma creciente");
        // for(int i = 0 ; i < (Arr.length ); i++){
        //     System.out.print(Arr[i] + " - ");
        // }

        // //forma decreciente la Array:
        // System.out.println("\nforma decreciente");
        // for(int i = (Arr.length -1); i > 0  ; i--){ 

        //     System.out.print(Arr[i] + " - ");

        // }

        //*3) Ordene un arreglo de n números y luego busque el número k.
        // int Arr[] = {5,1,4,3,8,10};
        // int aux;
        // int numBuscado = Arr[3];
        // for(int i = 0; i < Arr.length; i++){

        //     for(int j = 0 ; j < Arr.length - 1 ; j++){
        //         if(Arr[j] > Arr[j+1]){
        //             aux = Arr[j];
        //             Arr[j] = Arr[j+1];
        //             Arr[j+1] = aux;
        //         }
        //     }

        // }

        // for(int k = 0; k < Arr.legth ; k++){

        //     if(numBuscado == Arr[k]){

        //         System.out.print("\nel numero q encontramos es el: " + numBuscado);

        //     }

        // }

          int[] A = {2, 8, 14};  // Arreglo A
        int[] B = {1, 5, 19, 25, 29};  // Arreglo B
        
        // Crear el arreglo C con espacio suficiente para ambos arreglos
        int[] C = new int[A.length + B.length];
        
        int i = 0, j = 0, k = 0;
        
        // Intercalar los elementos de A y B
        for (k = 0; i < A.length - 1|| j < B.length - 1; k++) {
            if (i < A.length) {
                C[k++] = A[i++];  // Agregar de A
            }
            if (j < B.length) {
                C[k++] = B[j++];  // Agregar de B
            }
        }
        
        // Mostrar el resultado
        System.out.print("Resultado: ");
        for (int val : C) {
            System.out.print(val + " ");
        }
    
}}