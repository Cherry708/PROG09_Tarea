package Ejercicio2;

public class Perro extends Animal{

    public Perro(){}

    //Métodos
    @Override
    public String tipoAnimal() {
        return "Perro";
    }

    @Override
    public String comunicarse() {
        return "Guau";
    }
}
