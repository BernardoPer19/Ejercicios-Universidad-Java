public class Depas extends Inmuebles{

    int pagoDepa = 200;
    int areaX = 100;
    int areaY = 100;
    int areaTotal = areaX * areaY;
    private String tipoDepa;
    public Depas(int id,int habitaciones,int baños, String direccion){
        super(id,habitaciones, baños, direccion);   

    }

    public int getID(){return id;}
    
    public String tipoDepa(){
        if(habitaciones > 3){
            return  "Familiar";
        }else{
            return "MonoAmbiente";
        }
    }

    public void mostrarDataDelDepartamento(){
        System.out.println("id: " +id);
        System.out.println("habitaciones: " + habitaciones);
        System.out.println("baños: " + baños);
        System.out.println("tipo del departamento: " + tipoDepa());
        System.out.println("direccion: " + direccion);

    }

    public void pagoDeDepa(double suPago){
        double pagoFaltante = pagoDepa - suPago;
        double CambioPago = suPago - pagoDepa;
        if(suPago > pagoDepa){
            System.out.print("su cambio es: " + CambioPago);
        }else{
            if(suPago <= pagoDepa){
                System.out.print("a usted le falta pagar: " + pagoFaltante);
            }else{

                System.out.print("su pago fue realizado");

            }
        }
    }
}