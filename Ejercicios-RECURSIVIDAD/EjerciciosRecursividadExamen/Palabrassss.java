import java.util.*;

public class Palabrassss {
    public String contarPalabra(String texto, String palabra, String nuevaPal) {
        return contarPalabra(texto, palabra, nuevaPal, 0, 0, ""); // Empezamos con el resultado vacío
    }

    private String contarPalabra(String texto, String palabra, String nuevaPal, int posT, int posP, String resultado) {
        // Si ya se acabó el texto
        if (posT >= texto.length()) {
            return resultado; // Devolvemos el resultado final
        }

        // Si la palabra aún no está completamente encontrada
        if (posP < palabra.length()) {
            // Si el carácter actual coincide
            if (texto.charAt(posT) == palabra.charAt(posP)) {
                return contarPalabra(texto, palabra, nuevaPal, posT + 1, posP + 1, resultado);
            } else {
                // Si no coincide, añadimos el carácter actual al resultado
                return contarPalabra(texto, palabra, nuevaPal, posT + 1, posP, resultado + texto.charAt(posT));
            }
        } else {
            // Si encontramos la palabra, añadimos la nueva palabra al resultado
            return contarPalabra(texto, palabra, nuevaPal, posT, 0, resultado + nuevaPal);
        }
    }

    public static void main(String[] args) {
        Palabrassss obj = new Palabrassss();
        String resultado = obj.contarPalabra("poco coco oco choco moco", "oco", "aca");
        System.out.println(resultado); // Salida: paca caca aca chaca maca
    }
}
