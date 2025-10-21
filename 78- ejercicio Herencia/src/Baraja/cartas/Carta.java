/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baraja.cartas;


public abstract class Carta {
    private boolean tapada;
    
    public Carta(){
        this.tapada = true;
    }
    
    private void darVuelta(){
        
    }
    
    public void mostrar(){
        
    }

    @Override
    public String toString() {
        return "Carta{" + "tapada=" + tapada + '}';
    }
    
    
}   
