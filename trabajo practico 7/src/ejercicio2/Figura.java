/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author marco
 */
public abstract class Figura {
    private String nombre;
    
    public Figura(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre; 
    }
    
    public double calcularArea(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Figura{" + "nombre=" + nombre + '}';
    }
    
    
}
