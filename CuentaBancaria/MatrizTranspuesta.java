
/**
 * Write a description of class MatrizTranspuesta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MatrizTranspuesta
{
    private int[][] matriz;
    
    
    public MatrizTranspuesta(int[][] matriz){
        this.matriz = matriz;
        
    }
    
    public int[][] traspuesta(){
        int columna = matriz.length;
        int fila = matriz[0].length;
        int[][] traspuesta = new int [fila][columna];
        
        for(int i = 0 ; i< fila ; i++){
            for(int j = 0 ; j < columna ; j++){
                traspuesta [j][i] = matriz[i][j] ;
            }
        }
        return traspuesta;
    }
    
    
    
    
}
