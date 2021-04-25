package Ejercicio2;

public class Gato extends Animal{

    //Métodos
    public Gato() {}

    /*
    Método heredado y implementado de la clase animal.
    */
    @Override
    public String tipoAnimal() {
        return "Gato";
    }

    /*
    Método implementado como requisito
    de la interfaz IAnimal que implementa
    la superclase Animal de Gato.
    */
    @Override
    public String comunicarse() {
        return "Miau";
    }
}
