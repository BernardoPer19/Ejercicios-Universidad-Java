public class Vehiculo {
    String marca;
    String nombreVehiculo;
    boolean disponible;
    double kilometraje; 
    double velocidad;
    int puertas;
    int numPlaca;

    public Vehiculo(boolean disponible, double kilometraje, double velocidad, int puertas, int numPlaca, String marca, String nombreVehiculo) {
        this.disponible = disponible;
        this.kilometraje = kilometraje;
        this.velocidad = velocidad;
        this.puertas = puertas;
        this.numPlaca = numPlaca;
        this.marca = marca;
        this.nombreVehiculo = nombreVehiculo;
    }

    public boolean getDesponible() { return disponible; }
    public double getKilometraje() { return kilometraje; }
    public double getVelocidad() { return velocidad; }
    public int getPuertas() { return puertas; }
    public int getNumPalancas() { return numPlaca; }
    public String getMarca() { return marca; }
    public String getNombre() { return nombreVehiculo; }

  public void showData() {
    System.out.println("nombre: " + nombreVehiculo + "\n" +
                       "Marca: " + marca + "\n" +
                       "Kilometraje: " + kilometraje + "\n" +
                       "Velocidad: " + velocidad + "\n" +
                       "NumPlaca: " + numPlaca + "\n" +
                       "Puertas: " + puertas + "\n");
}

    // Setters
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
    public void setKilometraje(double kilometraje) { this.kilometraje = kilometraje; }
    public void setVelocidad(double velocidad) { this.velocidad = velocidad; }
    public void setPuertas(int puertas) { this.puertas = puertas; }
    public void setNumPlaca(int numPlaca) { this.numPlaca = numPlaca; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setNombre(String nombreVehiculo) { this.nombreVehiculo = nombreVehiculo; }
}
