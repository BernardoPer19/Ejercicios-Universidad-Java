import java.util.Scanner;

public class PangramaEjerAuxi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese una frase o palabra>>>>> ");
        String elTexto = scan.nextLine();

        elTexto = elTexto.toLowerCase();

        //coloque 26 ya que son las letras del alfabeto en ingles :D
        boolean[] letras = new boolean[26];// 27 para el español 

        for (int i = 0; i < elTexto.length(); i++) {
            char c = elTexto.charAt(i);
            if (c >= 'a' && c <= 'z') {
                letras[c - 'a'] = true;
            }
        }

        boolean esPangrama = true;
        for (int i = 0; i < letras.length; i++) {
            if (!letras[i]) {
                esPangrama = false;
                break;
            }
        }

        System.out.println(esPangrama ? "Chi" : "Nao");

      
    }
}
