/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg07.equals.y.hashcode;

/**
 *
 * @author marco
 */
public class Persona {
    private String nombre;
    private int dni;
    
    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public String getNombre(String nombre) {
        return this.nombre;
    }
    
    public int getDni(int dni) {
        return this.dni;
    }
    
    @Override
    public boolean equals(Object obj){
      
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Persona persona = (Persona) obj;

        return dni == persona.getDni() && nombre.equals(persona.getNombre());
    }

     @Override
    public int hashCode() {
        return Objects.hash(nombre, dni);

    }
}
