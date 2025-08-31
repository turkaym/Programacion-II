/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto3;

/**
 *
 * @author marco
 */
public class Principal {

    public static void main(String[] args) {
        Libros libro = new Libros();
        
        libro.setTitulo("El señor de los anillos");
        libro.setAutor( "J. R. R. Tolkien");
        
        libro.setAnio(2027);
        libro.mostrarDatos();
        
        libro.setAnio(1954);
        libro.mostrarDatos();
    }    
    
}
