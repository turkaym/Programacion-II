/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author marco
 */
public class Producto implements Pagable{
    private String nombre;
    private double precio;
    
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    @Override
    public double calcularTotal() {
        return precio;
    }
    
    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
    
}
