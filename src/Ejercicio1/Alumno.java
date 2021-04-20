package Ejercicio1;

public abstract class Alumno extends Persona {

    //Atributos
    private int curso;
    private String nivelAcademico;


    //Métodos
    public Alumno(String nombre, int edad, int curso, String nivelAcademico) {
        super(nombre, edad);
        this.curso = curso;
        this.nivelAcademico = nivelAcademico;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "[ALUMNO]"+"Nombre: "+nombre+", edad: "+edad+" años,"+" curso: "+curso+", nivel académico: "+nivelAcademico;
    }

    public abstract double pagoMensual();

    public abstract String mostrarAsignaturas();
}
