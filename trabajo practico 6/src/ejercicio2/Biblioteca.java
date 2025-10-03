/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author marco
 */
public class Biblioteca {
        private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor){
        Libro validacion = buscarLibro(isbn);
        
        if (validacion == null && autor != null){
            this.libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
        } else {
            System.out.println("Algo salio mal; el libro que intentas agregar ya existe, o no tiene autor.");
        }
    }
    
    public void listarLibros(){
        System.out.println("Estos son los libros disponibles en la biblioteca: " + this.nombre);
        for (Libro libro : libros) {
            System.out.println(libro.mostrarInfo());
        }
    }
    
    /* Aca se detectaron dos metodos muy similares, que hacen lo mismo, si bien la consigna solicita nombres distintos, advierto 
    la posibilidad de hacer una sobrecarga de metodos, lo cual hare, desviandome un poco de la consigna, pero creo sera mas limpio*/
    
    public Libro buscarLibro(String isbn){
        Libro libroEncontrado = null;
        Iterator<Libro> iterador = this.libros.iterator();
        
        if (isbn != null && !isbn.isBlank()){        
            while(iterador.hasNext() && libroEncontrado == null) {
                Libro l = iterador.next();
                if (l.getIsbn().equalsIgnoreCase(isbn)){
                    libroEncontrado = l;
                } 
            }
        }
        return libroEncontrado;
    }
    
    public ArrayList<Libro> buscarLibro(int anio){
        ArrayList<Libro> librosEncontrados = new ArrayList<>();
        Iterator<Libro> iterador = this.libros.iterator();
        
        if (anio > 0){
            while(iterador.hasNext()) {
                Libro l = iterador.next();
                if (l.getAnioPublicacion() == anio){
                    librosEncontrados.add(l);
                } 
            }
        } else {
            System.out.println("Ingresa un anio mayor a cero para buscar.");
        }
        return librosEncontrados;
    }
    
    public void eliminarLibro(String isbn){
        Libro libroAEliminar = buscarLibro(isbn);
        
        if (libroAEliminar != null){
            this.libros.remove(libroAEliminar);
            System.out.println("El " + libroAEliminar.toString() + " ha sido eliminado de la biblioteca " + this.nombre);
        } else {
            System.out.println("El ISBN ingresado: " + isbn + " no corresponde a un libro de esta biblioteca.");
        }
    }
    
    public int obtenerCantidadDeLibros(){
        return this.libros.size();
    }
    
    public ArrayList<Autor> mostrarAutoresDisponibles(){
        ArrayList<Autor> autores = new ArrayList<>();
        
        for (Libro libro : libros) {
            autores.add(libro.getAutor());
        }
        return autores;
    }
}
