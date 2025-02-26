
public class Inmuebles{
    protected int id, habitaciones, baños;
    protected double area;
    protected String direccion;
    int pagoDepa = 200;
    int areaX = 100;
    int areaY = 100;
    int areaTotal = areaX * areaY;
    public Inmuebles(int id,int habitaciones,int baños, String direccion){
        this.id = id;
        this.habitaciones = habitaciones;
        this.baños = baños;
        this.direccion  = direccion;
    }

      public String tipoDepa() {
        return ""; // En la clase base no tiene sentido, solo se implementará en Depas
    }

    
    public int getID(){return id;}

    public int gethabitaciones(){return habitaciones;}

    public int getbaños(){return baños;}

    public String getdireccion(){return direccion;}

    public int getareaTotal (){return areaTotal;} 
    
    
    public void mostrarInmuebles(){

        System.out.print("\nDireccion: "+direccion+"\nhabitaciones: "+habitaciones +"\nbaños: "+baños);

    }

}
