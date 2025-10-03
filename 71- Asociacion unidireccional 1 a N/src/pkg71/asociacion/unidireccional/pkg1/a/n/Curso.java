/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg71.asociacion.unidireccional.pkg1.a.n;

/**
 *
 * @author marco
 */
public class Curso {
    private String nombre;
    private int creditos;
    
    public Curso(String nombre, int creditos){
        this.nombre = nombre;
        this.creditos = creditos;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getCreditos(){
        return creditos;
    }
}
