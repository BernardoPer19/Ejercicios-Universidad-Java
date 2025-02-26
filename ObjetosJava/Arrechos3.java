
public class Arrechos3{
    public static void main(String[] args){
        //         char[] array = {'a', 'b', 'a', 'c', 'a', 'd'};
        //         char k = 'a';

        //         int cont = 0;

        //         for(int i = 0; i<array.length ; i++){

        //             if(k == array[i]){

        //                 cont++

        //             }

        //         }

        // System.out.print("la letra_ " + k + " se encontro " + cont + " veces ")

        //* Ejercicio 2: Ordenar un arreglo de caracteres con ordenamiento burbuja
        //* a) Implementa el algoritmo de ordenamiento burbuja para organizar un arreglo de caracteres en orden ascendente.

        // char[] array = {'d', 'a', 'c', 'b'};
        //La salida es el Arreglo ordenado: ['a', 'b', 'c', 'd']
        // char e1 = array[0];
        // for(int i = 0; i<array.length ; i++){

        //     for(int j = 0 ; j < array.length; j++){
        //         if(array[j]> array[j+1]){
        //             char aux = array[j];
        //             array[j] = array[j+1];
        //             array[j+1] = aux;
        //         }
        //     }

        //     for(int i = 0; i < array.length ; i++){
        //          System.out.print(array[i]);
        //     }
        // }

        // !Ejercicio 3: Ordenar un arreglo de números y buscar un número específico
        // !a) Ordena un arreglo de números enteros en orden ascendente usando cualquier método, y luego busca si un número está presente.
        // !b) Retorna la posición del número o indica si no se encuentra.

         int[] array = {64,2,68,12,90,2,41,534,87,12,6,42,8,32,7,13,7,24,863,25,77,2,790};
        int k = 863;
        int pos = 0;

        // ordenamos el array
        for(int i = 0; i < array.length - 1; i++){

            for(int j = 0 ; j < array.length - 1; j++){
                if(array[j]> array[j+1]){

                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;

                }
            }

        }

        // Buscamos el numero

        for(int i = 0 ; i < array.length ; i++){

            if(array[i] == k){
                System.out.println("el numero " + k + " Esta en la posicion " +  i);
            }

        }

        
        
        
        
        
            int[] A = {2, 8, 14};
    int[] B = {1, 5, 19, 25, 29};
    int tamañoFinal = A.length + B.length;
    int[] C = new int[tamañoFinal];
    int i = 0,j = 0,h = 0;

    while(i<A.length && j < B.length){

        C[h++] = A[i++];
        C[h++] = B[j++];

    }

    while(i<A.length){

        C[h++] = A[i++];

    }

    while(j<B.length){
        C[h++] = B[j++];
    }

    System.out.print("Arreglo intercalado: ");
        for (int num : C) {
            System.out.print(num + " ");
        }

    }
}