/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto2;

/**
 *
 * @author marco
 */
public class TrabajoPractico3 {

    public static void main(String[] args) {
        Estudiantes alumno = new Estudiantes();
        alumno.nombre = "Marcos";
        alumno.apellido = "Salomon";
        alumno.curso = "Introduccion a POO";
        alumno.calificacion = 5.0; 
        
        alumno.mostrarInfo();
        alumno.subirCalificacion(5);
        alumno.mostrarInfo();
        alumno.bajarCalificacion(9);
        alumno.mostrarInfo();
        
        
    }
    
}
