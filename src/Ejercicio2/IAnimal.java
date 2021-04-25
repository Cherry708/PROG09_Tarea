package Ejercicio2;

public interface IAnimal {

    /*
     * Interfaz animal con el método abstracto comunicarse
     * que deberán implementar las clases no abstractas que
     * implementen esta interfaz.
     *
     */



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

    /*
    Método abstracto que deberán implementar
    las clases no abstractas que implementen esta interfaz.
    */
    public abstract String comunicarse();

}
