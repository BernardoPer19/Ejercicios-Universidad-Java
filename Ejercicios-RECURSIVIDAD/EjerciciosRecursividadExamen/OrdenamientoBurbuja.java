import java.util.*;

public class OrdenamientoBurbuja {

    public ArrayList<Integer> metodo(ArrayList<Integer> numeros) {
        return metodo(numeros, 0, false);
    }

    private ArrayList<Integer> metodo(ArrayList<Integer> numeros, int pos, boolean cambioHecho) {
        if (pos >= numeros.size() - 1) {
            if (!cambioHecho) {
                return numeros;
            }
            return metodo(numeros, 0, false);
        }

        if (numeros.get(pos) > numeros.get(pos + 1)) {
            int temp = numeros.get(pos);
            numeros.set(pos, numeros.get(pos + 1));
            numeros.set(pos + 1, temp);
            cambioHecho = true; 
        }

        return metodo(numeros, pos + 1, cambioHecho);
    }

    public static void main(String[] args) {
        OrdenamientoBurbuja ordenamiento = new OrdenamientoBurbuja();
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(5, 3, 1, 8, 2));
        ArrayList<Integer> numerosOrdenados = ordenamiento.metodo(numeros);

        System.out.println("Array ordenado: " + numerosOrdenados);
    }
}
