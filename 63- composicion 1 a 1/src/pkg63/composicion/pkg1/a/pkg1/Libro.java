/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg63.composicion.pkg1.a.pkg1;

/**
 *
 * @author marco
 */
public class Libro {
    private String titulo;
    private Portada portada;
    
    public Libro(String titulo, String ilustracion){
        this.titulo = titulo;
        this.portada = new Portada(ilustracion);
    }
    
    public void mostrarPortada(){
        System.out.println("Libro: " + titulo + " tiene: " + portada.getIlustracion());
        
    }
}
