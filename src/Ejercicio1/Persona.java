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

    //AL ENCAPSULAR EL ATRIBUTO DEBO CAMBIAR SU ACCESIBILIDAD?
    //HA SIDO ENCAPSULADO PARA USARSE EN EL CONTROLADOR
    //ESTARÍA BIEN NO ENCAPSULARLO Y LLAMAR DIRECTAMENTE AL ATRIBUTO DEL OBJETO?
    public String getNombre(){
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
