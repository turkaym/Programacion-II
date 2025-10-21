/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg77.herencia.ejemplo2;

/**
 *
 * @author marco
 */
public class Moto extends Vehiculo {
    private int anchoDeManubrio;
    
    public Moto(int anchoDeManubrio, String marca, String modelo, String patente){
        super(marca, modelo, patente);
        this.anchoDeManubrio = anchoDeManubrio;
    }
    
    
}
