
/**
 * Write a description of class A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A
{
    public int sumaCuadrados(int n) {
        if (n == 0) return 0;
        int digito = n % 10;
        return (digito * digito) + sumaCuadrados(n / 10);
    }

    public int sumarDigitos(int n) {
        if (n < 10) return n;
        return n % 10 + sumarDigitos(n / 10);
    }

    public int contarDigitos(int n) {
        if (n < 10) return 1;
        return 1 + contarDigitos(n / 10);
    }

    public int potencia(int base, int exp) {
        if (exp == 0) return 1;
        return base * potencia(base, exp - 1);
    }

    public int invertirNumero(int n, int invertido) {
        if (n == 0) return invertido;
        return invertirNumero(n / 10, invertido * 10 + n % 10);
    }

    public int invertir(int n) {
        return invertirNumero(n, 0);
    }

    public int contarApariciones(int n, int digito) {
        if (n == 0) return 0;
        int cont = (n % 10 == digito) ? 1 : 0;
        return cont + contarApariciones(n / 10, digito);
    }

    public int contarVocales(String s, int i) {
        if (i == s.length()) return 0;
        char c = Character.toLowerCase(s.charAt(i));
        int suma = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
        return suma + contarVocales(s, i + 1);
    }

    public int sumaPares(int[] arr, int i) {
        if (i == arr.length) return 0;
        return (arr[i] % 2 == 0 ? arr[i] : 0) + sumaPares(arr, i + 1);
    }

    public int sumaImpares(int n) {
        if (n == 0) return 0;
        int d = n % 10;
        return (d % 2 != 0 ? d : 0) + sumaImpares(n / 10);
    }

    public int binarioADecimal(String bin, int i) {
        if (i == bin.length()) return 0;
        int bit = bin.charAt(i) - '0';
        return bit * (int)Math.pow(2, bin.length() - 1 - i) + binarioADecimal(bin, i + 1);
    }

    public boolean esPalindromo(int n) {
        return n == invertir(n, 0, n);
    }

    private int invertir(int n, int invertido, int original) {
        if (n == 0) return invertido;
        return invertir(n / 10, invertido * 10 + n % 10, original);
    }

}
