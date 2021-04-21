package Ejercicio1;

public class Profesor extends Persona {

    //Atributos
    private String asignatura;

    //Métodos
    public Profesor(String nombre, int edad, String asignatura) {
        super(nombre, edad);
        this.asignatura = asignatura;
    }

    @Override
    public String toString(){
        return "[Profesor]"+"Nombre: "+nombre+", edad: "+edad+" años,"+" asignatura: "+asignatura;
    }
}
