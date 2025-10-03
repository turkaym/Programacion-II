/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author marco
 */
public class ConversorOutput {
     public static void resultadoBusqueda(Libro libro){
        if (libro == null){
            System.out.println("No hubo coincidencias en su busqueda");
        } else {
            System.out.println("Hubo coincidencias con su busqueda: " + libro);
        }
    }
    
    public static void resultadoBusqueda(ArrayList<Libro> libros){
        if (libros.isEmpty()){
            System.out.println("No hubo coincidencias en su busqueda");
        } else {
            System.out.println("Hubo coincidencias con su busqueda: ");
            for (int i = 0; i < libros.size(); i++) {
                System.out.println("Resultado N°: " + (i + 1) + " "+ libros.get(i));
            }
        }
    }
    
    public static void autoresDisponibles(String nomBiblioteca, ArrayList<Autor> autores){
        if (autores.isEmpty()){
            System.out.println("Esta biblioteca no tiene autores registrados.");
        } else {
            System.out.println("Estos son los autores disponibles en biblioteca " + nomBiblioteca + ": ");
            for (int i = 0; i < autores.size(); i++) {
                System.out.println("Resultado N°: " + (i + 1) + " "+ autores.get(i).mostrarInfo());
            }
        }
    }
    
    public static void cantidadLibros(int cantidad, String nomBiblioteca){
        if (cantidad == 0){
            System.out.println("No hay libros en biblioteca " + nomBiblioteca);
        } else {
            System.out.println("En la biblioteca " + nomBiblioteca + " hay " + cantidad + " libros.");
        }
    }
}
