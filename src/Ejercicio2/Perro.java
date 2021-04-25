package Ejercicio2;

public class Perro extends Animal{

    //Métodos
    public Perro(){}

    /*
    Método heredado y implementado de la clase animal.
    */
    @Override
    public String tipoAnimal() {
        return "Perro";
    }

    /*
    Método implementado como requisito
    de la interfaz IAnimal que implementa
    la superclase Animal de Perro.
    */
    @Override
    public String comunicarse() {
        return "Guau";
    }
}
