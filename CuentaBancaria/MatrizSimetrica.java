
/**
 * Write a description of class MatrizSimetrica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MatrizSimetrica
{
    private int[][] matriz;
    
    public MatrizSimetrica(int[][] matriz){
        this.matriz = matriz;
    }
    
    public boolean esSimetrica(){
        int fila = matriz.length;
        int columna = matriz[0].length;
        
        if(fila != columna){
            return false;
        }
        
        for(int i = 0 ; i< fila ; i++){
            for(int j = 0; j< columna ; j++){
                if(matriz[i][j] != matriz[j][i]){
                    return false;
                }
            }
        }
        return true;
        
        }
    }    
    
    
    
