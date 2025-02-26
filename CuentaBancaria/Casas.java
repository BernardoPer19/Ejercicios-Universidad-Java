public class Casas extends Inmuebles{
    
    int numPisos;
    public Casas(int numPisos, int id,int habitaciones,int baños, String direccion){
    
        super(id, habitaciones, baños, direccion);
        this.numPisos = numPisos;
    }
    
    public int getID (){return id;}
    
    public void mostrarDataDelDepartamento(){
        System.out.println("id: " +id);
        System.out.println("habitaciones: " + habitaciones);
        System.out.println("baños: " + baños);
        System.out.println("numeo de pisos: " + numPisos);
        System.out.println("direccion: " + direccion);

    }


}