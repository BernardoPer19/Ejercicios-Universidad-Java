
/**
 * Write a description of class MultiplicacionMatriz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MultiplicacionMatriz
{
    private int [][] matriz1;
    private int [][] matriz2;
    
    
    public MultiplicacionMatriz(int [][] matriz1 ,int [][] matriz2){
        this.matriz1 = matriz1;
        this.matriz2 = matriz2;
    }
    
    public int[][] multiplicar(){
        int fila= matriz1.length;
        int columna = matriz1[0].length;
        int fila2= matriz2.length;
        int columna2 = matriz2[0].length;
        int[][] res = new int [fila][columna2];
        if(fila != columna2){
            return null;
        }
        
        for(int i = 0 ; i< fila ; i++){
            for(int j = 0 ; j< columna2 ; j++){
               for(int k = 0 ; k< columna ; k++){
                    res[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return res;
    } 
}
