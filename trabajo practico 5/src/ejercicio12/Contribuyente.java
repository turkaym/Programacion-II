/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author marco
 */
public class Contribuyente {
    private String nombre;
    private String cuil;
    
    public Contribuyente(String nombre, String cuil){
        this.nombre = nombre;
        this.cuil = cuil;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getCuil(){
        return cuil;
    }

    @Override
    public String toString() {
        return "Contribuyente{" + "nombre=" + nombre + ", dni=" + cuil + '}';
    }
    
    
}
