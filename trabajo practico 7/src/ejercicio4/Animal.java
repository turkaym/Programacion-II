/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author marco
 */
public abstract class Animal {
    private String nombre;
    
    public Animal(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void hacerSonido(){
        System.out.println("El animal hace el sonido");
    }
    
    public void describirAnimal(){
        System.out.println("El animal es: " + nombre);
    }
}
