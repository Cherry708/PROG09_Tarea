package Ejercicio2;

public abstract class Animal implements IAnimal {

    //Atributos
    private String nombre;

    //Métodos
    public Animal() {}

    public String getNombre(){
        return nombre;
    }

    public abstract String tipoAnimal();

}
