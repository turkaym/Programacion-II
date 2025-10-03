/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg71.asociacion.unidireccional.pkg1.a.n;

/**
 *
 * @author marco
 */
public class AsociacionUnidireccional1AN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesor marcos = new Profesor("Marcos Salomon");
        Curso programacionI = new Curso("Programacion I", 20);
        Curso ayso = new Curso("Arquitectura y Sistemas Operativos", 10);
        Curso baseDeDatos = new Curso("Base de Datos", 15);
        
        // ASOCIAMOS LOS CURSOS AL PROFESOR     
        marcos.agregarCurso(ayso);
        marcos.agregarCurso(programacionI);
        marcos.agregarCurso(baseDeDatos);
        
        mostrarCursos(marcos);
        
    }
    
    public static void mostrarCursos(Profesor profesor){
        System.out.println("Los cursos del profsor " + profesor.getNombre() + " son: ");
        
        for (Curso curso: profesor.getCursos()){
            System.out.println("Nombre del curso: " + curso.getNombre());
            System.out.println("Creditos del curso: " + curso.getCreditos());
            System.out.println("-------------------------------------------------------");
        }
    }
    
}
