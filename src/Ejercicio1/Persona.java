package Ejercicio1;

public class Persona {

    //Atributos
    protected String nombre;
    protected int edad;
    /*
    Dado que no hay requisitos de getters, la
    alternativa es el modificador protected para que las
    subclases puedan acceder a los atributos.
     */

    //Métodos
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
