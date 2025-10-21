/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg75.herencia.ejemplo.basico;

/**
 *
 * @author marco
 */
public class Animal {
    protected String nombre;
    protected int edad;
    
    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("Constructor de ANIMAL");
    }
    
    public void hacerSonido(){
        System.out.println("Sonido generico de animal");
    }
    
    
}
