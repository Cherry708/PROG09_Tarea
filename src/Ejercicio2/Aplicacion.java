package Ejercicio2;

public class Aplicacion {
    public static void main(String[] args) {

        Animal animal = new Perro();
        Perro perro= new Perro();

        Animal animalPolimorfico = animal;
        animal = perro;


        Animal gato = new Gato();
        IAnimal gatoInterfaz = new Gato();
    }
}
