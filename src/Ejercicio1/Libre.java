package Ejercicio1;
import java.util.Arrays;

public class Libre extends Alumno {

    //Atributos
    private final float PRECIO_HORA = 10;
    private String[] listaAsignaturas;
    private int numeroHorasDiarias;


    //Métodos
    public Libre(String nombre, int edad, int curso, String nivelAcademico, String[] listaAsignaturas, int numeroHorasDiarias) {
        super(nombre, edad, curso, nivelAcademico);
        this.listaAsignaturas = listaAsignaturas;
        this.numeroHorasDiarias = numeroHorasDiarias;
    }


    public void setListaAsignaturas(String[] listaAsignaturas) {
        this.listaAsignaturas = listaAsignaturas;
    }

    @Override
    public double pagoMensual() {
        return PRECIO_HORA*numeroHorasDiarias*30;
    }

    @Override
    public String mostrarAsignaturas() {
        return Arrays.toString(listaAsignaturas);
    }
}
