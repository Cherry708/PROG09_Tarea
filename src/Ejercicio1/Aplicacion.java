package Ejercicio1;

public class Aplicacion {
    public static void main(String[] args){

        Profesor[] listaProfesores = new Profesor[5];

        System.out.println("Apartado 1 y 2. Crea y muestra un array de profesores:");
        listaProfesores[0] = new Profesor("Profesor1", 30,"Asignatura1");
        listaProfesores[1] = new Profesor("Profesor2", 26,"Asignatura2");
        listaProfesores[2] = new Profesor("Profesor3", 43,"Asignatura3");
        listaProfesores[3] = new Profesor("Profesor4", 32,"Asignatura4");
        listaProfesores[4] = new Profesor("Profesor5", 45,"Asignatura5");

        for(Profesor profesor: listaProfesores){
            System.out.println(profesor.toString());
        }
        System.out.println("Fin de Apartado 1 y 2.");
        System.out.println();

        String[] listaAsignaturas = new String[2];
        listaAsignaturas[0] = "Asignatura1";
        listaAsignaturas[1] = "Asignatura2";
        Alumno[] listaAlumnos = new Alumno[5];

        listaAlumnos[0] = new Presencial("Presencial1",16,3,"Nivel Académico 1", listaAsignaturas,)


    }
}
