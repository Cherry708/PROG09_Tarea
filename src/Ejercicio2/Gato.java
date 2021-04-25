package Ejercicio2;

public class Gato extends Animal{

    //Métodos

    public Gato() {}

    @Override
    public String tipoAnimal() {
        return "Gato";
    }

    @Override
    public String comunicarse() {
        return "Miau";
    }
}
