public class Triangulits {

    public int rombits(int n) {
        if (n <= 1) {
            return 0; // caso base
        } else {
            return rombits(n - 1) + (int)Math.pow(3, n - 1);
        }
    }
}
