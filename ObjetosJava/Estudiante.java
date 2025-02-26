import java.util.ArrayList;

public class Estudiante extends Persona {
    private ArrayList<Double> notas;  // Lista de notas

    public Estudiante(String name, int age) {
        super(name, age, 'h', 0.0, 0.0);
        this.notas = new ArrayList<>();
    }

    // Método para agregar una nota
    public void addNota(Double nota) {
        notas.add(nota);
    }

    // Método para obtener la lista de notas
    public ArrayList<Double> getNotas() {
        return notas;
    }
    
    public void mostrarNotas(){
        System.out.print("Las Notas son:" + notas);
    }
}
