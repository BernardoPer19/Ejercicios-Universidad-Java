import java.util.ArrayList;

public class Edamen {

    public ArrayList<Integer> Ejer1(String palabra, String texto) {
        ArrayList<Integer> res = new ArrayList<>();
        Ejer1(palabra, texto, res, 0, 0);
        return res;
    }

    private void Ejer1(String palabra, String texto, ArrayList<Integer> res, int posText, int posPal) {
        if (posText < texto.length()) {
            if (posPal < palabra.length()) {
                if (texto.charAt(posText) == palabra.charAt(posPal)) {
                    Ejer1(palabra, texto, res, posText + 1, posPal + 1);
                } else {
                    Ejer1(palabra, texto, res, posText + 1, 0);
                }
            } else {
                res.add(posText - palabra.length());
                Ejer1(palabra, texto, res, posText, 0);
            }
        }else if (posPal == palabra.length()) {
            res.add(posText - palabra.length());
        }
    }

    public static void main(String[] args) {
        Edamen e = new Edamen();
        ArrayList<Integer> resultado = e.Ejer1("coca", "tu coca roja saca coca por tu cola sabe a roca");
        System.out.println("Array de posiciones: " + resultado); // Esperado: [1, 6, 14]
    }
}
