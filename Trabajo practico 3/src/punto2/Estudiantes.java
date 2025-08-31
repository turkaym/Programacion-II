/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto2;

public class Estudiantes {
    final static double MAX = 10.0;
    final static double MIN = 0.0;
    
    String nombre;
    String apellido;
    String curso;
    Double calificacion;
    
    void mostrarInfo(){
        System.out.println(nombre + " " + apellido + " " + curso + " " + calificacion);
    }
    
    void subirCalificacion(double puntos){
        if (puntos <= MIN){
            System.out.println("Los puntos deben ser mayor a 0");
        }
        
        double nuevaCalificacion = calificacion + puntos;
        
        if (nuevaCalificacion > MAX){
            nuevaCalificacion = MAX;
        }
        
        calificacion = nuevaCalificacion;
    }
    
    void bajarCalificacion(double puntos){
        if(puntos <= MIN){
            System.out.println("Los puntos deben ser mayores a 0");
        }
        
        double nuevaCalificacion = calificacion - puntos;
        
        if (nuevaCalificacion < MIN){
            nuevaCalificacion = MIN;
        }
        
        calificacion = nuevaCalificacion;
    }
}
    