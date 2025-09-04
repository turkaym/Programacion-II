/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg04.sobrecarga.de.metodos;

/**
 *
 * @author marco
 */
public class Robot {
    private String nombre;
    
    //CONSTRUCTOR que llama al setter
    public Robot(String nombre) {
        setNombre(nombre);
    }
    
    // setter que valida que el nombre no sea nulo y lo asigna si es cierto
    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }
    
    public void saludar(String nombre) {
        System.out.println("Hola " + nombre + ", soy " + this.nombre);
    }
    
    public void saludar(){
        saludar("extraño");
    }
}
