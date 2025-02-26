public class Ciudad {
    private int limiteX;
    private int limiteY;
    private boolean esVisitada;

 
    public Ciudad(int limiteX, int limiteY) {
        this.limiteX = limiteX;
        this.limiteY = limiteY;
    }

   
    public int getLimiteX() {
        return limiteX;
    }

    public int getLimiteY() {
        return limiteY;
    }

}