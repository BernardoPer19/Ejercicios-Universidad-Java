public class Items{
    private String nom,desc;
    private int id;

    public Items(String nom, int id){
        this.id=id;
        this.nom=nom;
        this.desc = desc;
    }

    public int getID(){return id;}
    public String getNom(){return nom;}
    public String getDes(){return desc;}
    public void mostrarItem(){
        System.out.println("nombre: " + nom);
        System.out.println("des: " + desc);
        System.out.println("id:" + id);

    }
}