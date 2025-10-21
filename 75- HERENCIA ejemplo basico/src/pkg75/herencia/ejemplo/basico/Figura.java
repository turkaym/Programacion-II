/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg75.herencia.ejemplo.basico;


// CLASE ABSTRACTA
public abstract class Figura {
    protected String color;
    
    public Figura(String color){
        this.color = color;
    }
    
    
    //Los métodos abstractos definen contratos que las subclases deben cumplir, while los métodos concretos proporcionan funcionalidad compartida. Esta
//  combinación ofrece flexibilidad y consistencia.
    // METODO ABSTRACTO - DEBE IMPLEMENTARSE EN LA SUBCLASE
    public abstract double calcularArea();
    
    // METODO CONCRETO - IMPLEMENTACION COMPARTIDA
    public void imprimirColor(){
        System.out.println("Color: " + color);
    }
}
