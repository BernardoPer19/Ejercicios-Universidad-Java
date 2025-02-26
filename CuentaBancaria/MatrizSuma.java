
/**
 * Write a description of class MatrizSuma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MatrizSuma
{
    private int[][] ma1;
    private int[][] ma2;
    
    public MatrizSuma(int[][] ma1,int[][] ma2){
     this.ma1 = ma1;
     this.ma2= ma2;
    }
    
    public int[][] sumarMatrizes(){
        int fila = ma1.length;
        int columna = ma2[0].length;
        int[][] resultado = new int[fila][columna];
        
        if(ma1.length != ma2.length || ma1[0].length != ma2[0].length){
            System.out.println("no son de mismas dimensiones");
            return null;
        }
        
        for(int i = 0; i< fila; i++){
            for(int j = 0 ; j<columna ; j++){
            resultado[i][j] = ma1[i][j] + ma2[i][j];
            }
        }
        return resultado;
    }
}
