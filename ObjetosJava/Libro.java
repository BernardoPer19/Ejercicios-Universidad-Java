
/**

 */
public class Libro{

    private String title;
    private String author;
    private String editorial;
    private int pages;
    private int yearDeparture;

    public Libro(String title, String author, String editorial, int pages, int yearDeparture){
        this.title = title;
        this.author= author;
        this.editorial= editorial;
        this.pages= pages;
        this. yearDeparture= yearDeparture;
    }
    //Getter
    public String getTitle(){return title;}
    
    public String getAuthor(){return author;}
    
    public String getEditorial(){return editorial;}
    
    public int getPages(){return pages;}
    
    public int getYearDeparture(){return yearDeparture;}
    
    //Setters;
    public void setTitle(String title) { this.title = title; }
    
    public void setAuthor(String author) { this.author = author; }
    
    public void setEditorial(String editorial) { this.editorial = editorial; }
    
    public void setPages(int pages) { this.pages = pages; }
    
    public void setYearDeparture(int yearDeparture) { this.yearDeparture = yearDeparture; }
    
    public void viewBook(){
         System.out.print("\ntitle:"+ title+"\nauthor: "+ author +"\neditorial: "+editorial+"\npages: "+pages+"\nyear of departure "+yearDeparture);
    }
}
