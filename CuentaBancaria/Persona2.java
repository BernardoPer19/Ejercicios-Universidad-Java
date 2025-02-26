public class Persona2 {
    protected String nombre;
    protected int dni;
    protected String direccion;

    public Persona2(String nombre, int dni, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Dirección: " + direccion);
    }

 
}
