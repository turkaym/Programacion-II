/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Universidad uni = new Universidad("UTN");

        //Crear al menos 3 profesores y 5 cursos
        Profesor p1 = new Profesor("P1", "Juan Pérez", "Matemática");
        Profesor p2 = new Profesor("P2", "María López", "Programación");
        Profesor p3 = new Profesor("P3", "Ana Torres", "Bases de Datos");

        Curso c1 = new Curso("C1", "Álgebra");
        Curso c2 = new Curso("C2", "POO");
        Curso c3 = new Curso("C3", "Estadística");
        Curso c4 = new Curso("C4", "Java");
        Curso c5 = new Curso("C5", "SQL");

        //Agregar a la universidad
        uni.agregarProfesor(p1); uni.agregarProfesor(p2); uni.agregarProfesor(p3);
        uni.agregarCurso(c1); uni.agregarCurso(c2); uni.agregarCurso(c3); uni.agregarCurso(c4); uni.agregarCurso(c5);

        //Asignar profesores a cursos usando el método pedido
        uni.asignarProfesorACurso("C1", "P1");
        uni.asignarProfesorACurso("C2", "P2");
        uni.asignarProfesorACurso("C3", "P1");
        uni.asignarProfesorACurso("C4", "P2");
        uni.asignarProfesorACurso("C5", "P3");

        //Listar cursos con su profesor y profesores con sus cursos
        System.out.println("=== Cursos ===");
        uni.listarCursos();
        System.out.println("\n=== Profesores (resumen) ===");
        uni.listarProfesores();
        System.out.println("\n=== Cursos por profesor ===");
        p1.listarCursos(); p2.listarCursos(); p3.listarCursos();

        //Cambiar el profesor de un curso (bidireccional)
        System.out.println("\n=== Cambiar profesor de C1 a P3 ===");
        c1.setProfesor(p3);
        uni.listarCursos();
        System.out.println("Cursos de P1: "); p1.listarCursos();
        System.out.println("Cursos de P3: "); p3.listarCursos();

        //Remover un curso y confirmar que no aparece en el profe
        System.out.println("\n=== Eliminar curso C2 ===");
        uni.eliminarCurso("C2");
        uni.listarCursos();
        System.out.println("Cursos de P2: "); p2.listarCursos();

        // Remover un profesor y dejar cursos sin profesor
        System.out.println("\n=== Eliminar profesor P1 (sus cursos quedan con profesor = null) ===");
        uni.eliminarProfesor("P1");
        uni.listarCursos();

        // Reporte: cantidad de cursos por profesor
        System.out.println("\n=== Reporte ===");
        uni.reporteCursosPorProfesor();
    }
    
}
