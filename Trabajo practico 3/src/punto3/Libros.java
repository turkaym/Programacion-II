/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto3;

/**
 *
 * @author marco
 */
public class Libros {
    final static int MIN_ANIO =  1954;
    final static int MAX_ANIO = 2025;
    
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    public void mostrarDatos(){
        System.out.println("Titulo: " + titulo + " | " + "Autor: " + autor + " | " + "Año de publicacion: " + anioPublicacion);
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getAnio(){
        return anioPublicacion;
    }
    
    public void setTitulo(String nuevoTitulo){
        if (nuevoTitulo != null) {
            titulo = nuevoTitulo;
        }
    }
    
    public void setAutor(String nuevoAutor){
        if (nuevoAutor != null){
            autor = nuevoAutor;
        }
    }
    
    public void setAnio(int nuevoAnio){
        if (nuevoAnio >= MIN_ANIO && nuevoAnio <= MAX_ANIO) {
            anioPublicacion = nuevoAnio;
        } else {
            System.out.println("Año invalido: " + nuevoAnio + " (debe estar entre " + MIN_ANIO + " y " + MAX_ANIO + ").");
        }
    }
}
