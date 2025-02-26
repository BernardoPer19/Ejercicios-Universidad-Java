import java.util.ArrayList;

class Profesor extends Persona {
    private ArrayList<Estudiante> estudiantes;  // Lista de estudiantes

    public Profesor(String name, int age) {
        super(name, age, 'h', 0.0, 0.0);
        this.estudiantes = new ArrayList<>();
    }

    // Método para agregar un estudiante al profesor
    public void addEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Método para calcular el promedio de las notas de todos los estudiantes
    public double calcularPromedioNotas() {
        double sumaNotas = 0.0;
        int totalNotas = 0;

        // Recorremos todos los estudiantes
        for (Estudiante estudiante : estudiantes) {
            // Obtenemos las notas del estudiante
            ArrayList<Double> notasEstudiante = estudiante.getNotas();

            // Sumamos todas las notas del estudiante
            for (Double nota : notasEstudiante) {
                sumaNotas += nota;
                totalNotas++;
            }
        }

        // Calculamos el promedio (evitamos división por cero)
        return totalNotas == 0 ? 0.0 : sumaNotas / totalNotas;
    }
    
   
}


//estudian1