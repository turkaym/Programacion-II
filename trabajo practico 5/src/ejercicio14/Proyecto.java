/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author marco
 */
public class Proyecto {
    private String nombre;
    private int duracionMin;
    
    public Proyecto(String nombre, int duracionMin){
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getDuracion(){
        return duracionMin;
    }
    
    public void setNombre(String nombre){
        if (nombre != null) {
            this.nombre = nombre;
        }
    }
    
    public void setDuracion(String duracionMin){
        if (duracionMin != null) {
            this.duracionMin = this.duracionMin;
        }
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", duracionMin=" + duracionMin + '}';
    }
    
    
}
