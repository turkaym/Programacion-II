/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author marco
 */
public class Usuario {
    private String nombre;
    private String email;
    
    public Usuario(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setNombre(String nombre){
        if (nombre != null) {
            this.nombre = nombre;
        }
    }
    
    public void setEmail(String email){
        if (email != null) {
            this.email = email;
        }
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", email=" + email + '}';
    }
    
    
}
