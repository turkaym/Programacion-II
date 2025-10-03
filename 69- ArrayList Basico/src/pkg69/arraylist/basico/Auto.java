/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg69.arraylist.basico;

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
    
    public String getPatente(){
        return patente;
    }
    
    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", color=" + color + '}';
    }
    
    
}
