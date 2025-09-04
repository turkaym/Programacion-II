/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg05.tostring;

/**
 *
 * @author marco
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean tieneHijos;

    public Persona(String nombre, String apellido, int edad, boolean tieneHijos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tieneHijos = tieneHijos;
    }
    
    public String getNombre(String nombre){
        return nombre;
    }
    
    public String getApellido(String apellido){
        return apellido;
    }
    
    public int getEdad(int edad){
        return edad;
    }
    
    public boolean getTieneHijos(boolean tieneHijos){
        return tieneHijos;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", tieneHijos=" + tieneHijos + '}';
    }
    
    
}
