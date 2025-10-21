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
public class CartaNumeral extends CartaConPalo{
    private int numero;
    
    public CartaNumeral(int numero, Palo palo) {
        super(palo);
        this.numero = numero;
    }
    
}
