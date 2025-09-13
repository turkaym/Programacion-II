/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author marco
 */
public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;
    
    public Usuario(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDni(){
        return dni;
    }
    
    public Celular getCelular(){
        return celular;
    }
    
    public void setCelular(Celular celular){
        this.celular = celular;
        // Evito el bucle infinito y asegura la consistencia de la 
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", celular=" + celular + '}';
    }
    
}
