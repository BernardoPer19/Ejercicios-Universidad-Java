
/**

 */
public class Biblioteca{
    private Libro arrBooks[];   
    private int count;
    public Biblioteca(int capacidad){
        this.arrBooks = new Libro[capacidad];
        this.count = 0;
    }

    public int numeroLibro(){
        return count;
    }

    public boolean addBook(Libro newBook){
        if(count < arrBooks.length){
            arrBooks[count] = newBook;
            count++;
            System.out.println("Se añadio correctamente");
            return true;
        }else{
            System.out.println("no se pueden añadir mas libros");
            return false;

        }
    }

    public boolean removeBook(int pos){
        if(count == 0){System.out.println("no hay libros para ver");  return false;}
        else if(pos < 0 || pos> count ){System.out.println("coloca la posicion correcta");  return false;}
        else{

            for(int i = pos-1; i < count -1 ; i++){
                arrBooks[i] = arrBooks[i + 1];  // Mueve el siguiente libro al lugar actual      
            }

        }

        arrBooks[count - 1] = null;

        // Reducir el contador
        count--;
        System.out.println("Libro eliminado correctamente");
        return true;

    }

    
    //ver la info del libro segun la posicion
    public void getBook(int pos){
        if(count == 0){System.out.println("no hay libros para ver");}
        else if(pos < 0 || pos> count ){System.out.println("coloca la posicion correcta");}

        for (int i = 0; i < pos; i++) {
            if (i == pos - 1) {  // Cuando llegas a la posición solicitada
                System.out.println("\ntitle: " + arrBooks[i].getTitle() +  
                    "\nauthor: " + arrBooks[i].getAuthor() + 
                    "\npages: " + arrBooks[i].getPages() + 
                    "\nyearDeparture: " + arrBooks[i].getYearDeparture());
            }
        }
    }

    public void setBook(int pos, Libro changeBook, String newTitle, String newAutor, int newPages, int newYearDeparture){
        if(count == 0){System.out.println("no hay libros para ver");}
        else if(pos < 0 || pos> count ){System.out.println("coloca la posicion correcta");}

        for(int i = 0; i < pos ; i++){

            if (i == pos - 1){ 
                arrBooks[i].setTitle(newTitle)   ;
                arrBooks[i].setAuthor(newAutor) ;
                arrBooks[i].setPages(newPages);
                arrBooks[i].setYearDeparture(newYearDeparture);
            }

        }

        System.out.println("\nLibro actualizado:");
        System.out.println("Title: " + arrBooks[pos - 1].getTitle() +  
            "\nAuthor: " + arrBooks[pos - 1].getAuthor() + 
            "\nPages: " + arrBooks[pos - 1].getPages() + 
            "\nYear Departure: " + arrBooks[pos - 1].getYearDeparture());

    }
}

