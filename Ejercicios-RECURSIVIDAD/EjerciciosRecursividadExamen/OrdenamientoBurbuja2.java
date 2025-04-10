import java.util.*;

public class OrdenamientoBurbuja2 {

    public void metodo(int[] numeros) {
        metodo(numeros, 0, numeros.length - 1);
    }

    private void metodo(int[] numeros, int pos, int limS) {

        if (limS>0) {
            if (pos < limS) {
                if (numeros[pos] > numeros[pos + 1]) {
                    int aux = numeros[pos];
                    numeros[pos] = numeros[pos + 1];
                    numeros[pos + 1] = aux;
                    metodo(numeros, pos + 1, limS);
                } else {
                    metodo(numeros, pos + 1, limS);
                }
            } else {
                metodo(numeros, 0, limS - 1);
            }
        }
    }

    public static void main(String[] args) {
        OrdenamientoBurbuja2 ob = new OrdenamientoBurbuja2();
        int[] numeros = {5, 2, 9, 1, 5, 6};

        System.out.println("Antes del ordenamiento: " + Arrays.toString(numeros));
        ob.metodo(numeros);
        System.out.println("Después del ordenamiento: " + Arrays.toString(numeros));
    }
}
