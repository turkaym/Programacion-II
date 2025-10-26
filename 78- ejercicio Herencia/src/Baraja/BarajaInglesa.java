/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baraja;

import Baraja.cartas.Carta;
import Baraja.cartas.CartaFigura;
import Baraja.cartas.CartaJoker;
import Baraja.cartas.CartaNumeral;
import java.util.ArrayList;

/**
 *
 * @author marco
 */
public class BarajaInglesa {
    private ArrayList<Carta> cartas;
    
    public BarajaInglesa(){
        this.cartas = new ArrayList<>();
        generarCartas();
    }
    
    public void mostrarBaraja(){
        for (Carta carta: cartas){
            carta.darVuelta();
            carta.mostrar();
        }
    }
    
    public void generarCartas(){
        generarCartasNumerales();
        generarCartasFiguras();
        generarCartasJokers();
    }
    
    public void generarCartasNumerales(){
        final int MIN_VALOR = 2;
        final int MAX_VALOR = 10;
        Palo[] palos = Palo.values();
        
        for (int p = 0; p < palos.length; p++) {
            Palo paloActual = palos[p];
            for (int i = MIN_VALOR; i <= MAX_VALOR; i++) {
                this.cartas.add(new CartaNumeral(i, paloActual));
            }
        }
    }
    
    public void generarCartasFiguras(){
        char[] letras = {'A', 'J', 'Q', 'K'};
        Palo[] palos = Palo.values();
        
        for (int p = 0; p < palos.length; p++) {
            Palo paloActual = palos[p];
            for (int i = 0; i < letras.length; i++) {
                char letraActual = letras[i];
                this.cartas.add(new CartaFigura(letraActual, paloActual));
            }
        }
    }
    
    public void generarCartasJokers(){
          this.cartas.add(new CartaJoker(true));
          this.cartas.add(new CartaJoker(false));
    }
}
