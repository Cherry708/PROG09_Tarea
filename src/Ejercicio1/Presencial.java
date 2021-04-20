package Ejercicio1;

import java.util.Arrays;

public class Presencial extends Alumno{

    //Atributos
    private double matriculaCurso;
    private double plusPorConvocatoria;
    private int numeroConvocatoria;
    private String[] listaAsignaturas;

    //Métodos
    public Presencial(String nombre, int edad, int curso, String nivelAcademico, String[] listaAsignaturas ,double matriculaCurso, double plusPorConvocatoria, int numeroConvocatoria) {
        super(nombre, edad, curso, nivelAcademico);
        this.listaAsignaturas = listaAsignaturas;
        this.matriculaCurso = matriculaCurso;
        this.plusPorConvocatoria = plusPorConvocatoria;
        this.numeroConvocatoria = numeroConvocatoria;
    }

    @Override
    public double pagoMensual() {
        return (matriculaCurso+plusPorConvocatoria*numeroConvocatoria)/12;
    }

    @Override
    public String mostrarAsignaturas() {
        return Arrays.toString(listaAsignaturas);
    }
}
