
public class AutoCompletados{
    public int autos(int base, int[] Arr){
        return autos(base,Arr,0,0);
    }

    private int autos(int base,int[] Arr,int pos,int cont){

       

        if(base == 1){
            return 1;
        }else if(base == 0){
            return 0;
        }else {
            if(pos < Arr.length ){
                if(Arr[pos] == (int)Math.pow(base,pos)){
                    return autos( base, Arr, pos +1 , cont +1 );
                }else{
                    return -1;
                }
            }
        }
        return cont;
    }

}

