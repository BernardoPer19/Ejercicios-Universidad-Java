import java.util.ArrayList;

public class Colegio {

    private ArrayList<Estudiante> est;
    private ArrayList<Profesor> prof;
    private ArrayList<Bloque> bloque;

    public Colegio() {
        this.est = new ArrayList<>(); 
        this.prof = new ArrayList<>();
        this.bloque = new ArrayList<>();
    }

    public String addEst(Estudiante newEst) {
        est.add(newEst);
        return "Estudiante agregado con éxito";
    }

    public String removeEst(Estudiante newEst) {
        if (est.remove(newEst)) {
            return "Estudiante eliminado con éxito";
        } else {
            return "Estudiante no encontrado";
        }
    }

    public String addProf(Profesor newProf) {
        prof.add(newProf);
        return "Profesor agregado con éxito";
    }

    public String removeProf(Profesor newProf) {
        if (prof.remove(newProf)) {
            return "profesor eliminado con éxito";
        } else {
            return "profesor no encontrado";
        }
    }

    public void MostrarProfesores() {
        System.out.println("Todos los docentes:");
        for (Profesor profesor : prof) {
            System.out.println(profesor.getName());
            System.out.println(profesor.getAge()); 
        }
    }

    public void MostrarEstudiantes(){
        System.out.println("Todos los docentes:");
        for(Estudiante objEst: est){
            System.out.println("Nombre: " + objEst.getName()); 
            System.out.println("Edad: " +objEst.getAge()); 
        }
    }
}
