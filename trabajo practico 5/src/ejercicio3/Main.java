/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Editorial editorial = new Editorial("Super Libros", "Falsa 123");
        Libro libro = new Libro("Clean Code", "sdafsdaf4435", editorial);
        Autor autor = new Autor("Robert C. Martin", "Estadounidense");
        
        libro.setAutor(autor);
        
        System.out.println(libro);
    }    
}
