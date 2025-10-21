/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg77.herencia.ejemplo2;

import java.util.ArrayList;

/**
 *
 * @author marco
 */
public class Concesionaria {
    private ArrayList<Vehiculo> vehiculos;
    
    public Concesionaria(){
        this.vehiculos = new ArrayList<>();
    }
    
    public void agregarVehiculo(Vehiculo v){
  
        this.vehiculos.add(v);
    }
}
