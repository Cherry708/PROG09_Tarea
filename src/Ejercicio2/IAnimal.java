package Ejercicio2;

public interface IAnimal {

    /*
    Tanto el modificador de accesibilidad 'public',
    abstract y final para el atributo
    son redundates para una interfaz interfaz.
     */


    //Atributos
    /*
    Los atributos declarados en una interfaz son, por defecto, constantes.
    Por ello IntelliJ IDEA nos indisca es que es redundate.
     */
    final int  VALOR = 0;

    //Métodos

    /**
     * Método comunicarse que devuelve el sonido del animal.
     * @return devuelve como String el sonido del animal.
     */
    public abstract String comunicarse();

}
