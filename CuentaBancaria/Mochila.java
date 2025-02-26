


public class Mochila{

    private Items[] arrItem;
    private int cont;
    private int limit = 3; 

    public Mochila(){
        this.arrItem = new Items[limit];
        cont = 0;
    }


    public boolean add(Items newItem){
        if(cont > arrItem.length){System.out.print("No se puede añadir mas."); return false;}
        else{
            arrItem[cont] = newItem;
            cont++;
            return true;
        }
    }

    public void removeID(int ID){
        for(int i = 0; i < cont ; i++){
            if(arrItem[i].getID() == ID ){
                for(int j = i; j < cont -1 ; j++){
                    arrItem[j] = arrItem[j+1];
                }

                arrItem[cont - 1] = null;
                cont--;

            }
        } 
    }


  public Items showByID(int ID) {
    for (int i = 0; i < cont; i++) {
        if (arrItem[i].getID() == ID) {
            return arrItem[i]; // Devuelve el elemento si se encuentra
        }
    }
    return null; // Devuelve null si no se encuentra el ID
}


    public void orderByID(){
        for(int i = 0; i<cont-1 ; i++){
            for(int j = 0; j<cont-1 ; j++){
                if(arrItem[i].getID() > arrItem[i+1].getID()){
                    Items AUX = arrItem[i+1];
                    arrItem[i+1]=arrItem[i];
                    arrItem[i] = AUX;
                }
            }
        }
    }

    public void showData(){
        for(int i = 0 ; i < cont ; i++){
            System.out.println("id: " + arrItem[i].getID() );
        }
    }

}