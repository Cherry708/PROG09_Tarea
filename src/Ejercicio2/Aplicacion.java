package Ejercicio2;

public class Aplicacion {
    public static void main(String[] args) {

        //Punto 1
        Animal animal = new Perro();

        //Punto 2
        Perro perro= new Perro();

        //Punto 3
        Animal animalPolimorfico = animal;

        //Punto 4
        animal = perro;

        //Punto 5
        Animal gato = new Gato();

        //Punto 6
        IAnimal gatoInterfaz = new Gato();
    }
}
