package Ejercicio2;

public abstract class Animal implements IAnimal {

    /*
     * Clase abstracta Animal que
     * presenta el método abstracto tipoAnimal que
     * deberá ser implementado por las clases que extiendan
     * de esta.
     *
     */

    //Atributos
    private String nombre;

    //Métodos
    public Animal() {}

    /*
    Al no haber setter y no incluir parametros
    en el constructor el atributo nombre queda vacio.
    No se solicita un setter y se especifica que el
    método constructor no debe tomar parámetros de entrada.
     */
    public String getNombre(){
        return nombre;
    }

    /*
    Método abstracto que deberán implementar
    las subclases de Animal
    */
    public abstract String tipoAnimal();

}
