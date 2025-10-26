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
    
    public void darVuelta(){
        tapada = !tapada;
    }
    
    public void mostrar(){
        if (tapada) {
            System.out.println("********************");
        } else {
            System.out.println("Valor de la carta");
        }
    }

    @Override
    public String toString() {
        return "Carta{" + "tapada=" + tapada + '}';
    }
    
    
}   
