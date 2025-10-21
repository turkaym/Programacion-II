/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg79.polimorfismo1;

/**
 *
 * @author marco
 */
public class Avion extends Vehiculo {
    
    public void calefaccionarCarburador(){
        System.out.println("Carburador listo");
    }
    
    public void regularMezclaDeCombustible(){
        System.out.println("Mezcla regulada");
    }
    
    public void inyectarCobustible(){
        System.out.println("Combustible inyectado");
    }
    
    public void masPasos(){
        System.out.println("Muchos pasos mas...");
    }
    
    @Override
     public void encender(){
        calefaccionarCarburador();
        regularMezclaDeCombustible();
        inyectarCobustible();
        masPasos();
    }
 
}
