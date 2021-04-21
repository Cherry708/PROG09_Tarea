package Ejercicio1;

public class Aplicacion {
    public static void main(String[] args){

        //---APARTADO 1 Y 2
        Profesor[] listaProfesores = new Profesor[5];

        System.out.println("-- Apartado 1 y 2. Crea y muestra un array de profesores:");
        listaProfesores[0] = new Profesor("Profesor1", 30,"Asignatura1");
        listaProfesores[1] = new Profesor("Profesor2", 26,"Asignatura2");
        listaProfesores[2] = new Profesor("Profesor3", 43,"Asignatura3");
        listaProfesores[3] = new Profesor("Profesor4", 32,"Asignatura4");
        listaProfesores[4] = new Profesor("Profesor5", 45,"Asignatura5");

        for(Profesor profesor: listaProfesores){
            System.out.println(profesor.toString());
        }
        System.out.println("-- Fin de Apartado 1 y 2.");
        System.out.println();
        //FIN DE APARTADO 1 Y 2


        //---APARTADO 3, 4 Y 5

        //Listas de asignaturas para los alumnos
        String[] listaAsignaturas0 = new String[2];
        listaAsignaturas0[0] = "Inglés";
        listaAsignaturas0[1] = "FOL";

        String[] listaAsignaturas1 = new String[2];
        listaAsignaturas1[0] = "Física";
        listaAsignaturas1[1] = "Matemáticas";

        String[] listaAsignaturas2 = new String[2];
        listaAsignaturas2[0] = "Química";
        listaAsignaturas2[1] = "Biología";


        //Lista de Alumnos
        Alumno[] listaAlumnos = new Alumno[5];

        //Polimorfismo, la lista es de alumnos
        listaAlumnos[0] = new Presencial("Presencial1",19,4,"Nivel Académico 1", listaAsignaturas0, 5.12, 30,2);
        listaAlumnos[1] = new Presencial("Presencial2",17,2,"Nivel Académico 2", listaAsignaturas1, 5.12, 30,2);
        listaAlumnos[2] = new Presencial("Presencial3",18,3,"Nivel Académico 3", listaAsignaturas2, 5.12, 30,2);
        listaAlumnos[3] = new Libre("Libre1", 22, 6, "Nivel Académico 4", listaAsignaturas1,6);
        listaAlumnos[4] = new Libre("Libre2", 24, 5, "Nivel Académico 5", listaAsignaturas2,3);

        System.out.println("-- Apartado 3, 4 y 5. Muestra las asignaturas de cada alumno, el pago mensual y el cobro total:");
        System.out.println("Asignaturas: ");
        for (Alumno listaAlumno : listaAlumnos) {
            System.out.println(listaAlumno.mostrarAsignaturas());
        }
        System.out.println();

        double contador = 0;
        System.out.println("Pago mensual y cobrado: ");
        for (Alumno listaAlumno : listaAlumnos) {
            contador = listaAlumno.pagoMensual()+contador;
            System.out.println(listaAlumno.nombre+" ha de pagar: "+listaAlumno.pagoMensual()+"€");
        }
        System.out.println("El total cobrado es: "+contador+"€");
        System.out.println("-- Fin de Apartado 3, 4 y 5");

    }
}
