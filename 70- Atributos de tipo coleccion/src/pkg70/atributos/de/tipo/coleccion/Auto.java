/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg70.atributos.de.tipo.coleccion;

/**
 *
 * @author marco
 */
public class Auto {
    private String patente;
    private String color;
    
    public Auto(String patente, String color){
        this.patente = patente;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", color=" + color + '}';
    }
    
    
}
