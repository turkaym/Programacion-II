/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baraja.cartas;

import Baraja.Palo;

/**
 *
 * @author marco
 */
public abstract class CartaConPalo extends Carta {
    private Palo palo;
    
    public CartaConPalo(Palo palo){
        this.palo = palo;
    }
    
}
