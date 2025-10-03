/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Biblioteca biblio1 = new Biblioteca("San Martin");
        Autor autor1 = new Autor("1", "Juan Carlos Escribidor", "Chileno");
        Autor autor2 = new Autor("2", "Carlos Letras", "Argentino");
        Autor autor3 = new Autor("3", "Esteban Sanchez", "Uruguayo");
        
        biblio1.agregarLibro("dsfsdsf2334", "La Curvatura del Circulo", 1987, autor1);
        biblio1.agregarLibro("abc123xyz", "El Laberinto de las Sombras", 1995, autor2);
        biblio1.agregarLibro("987654321", "Vientos del Sur", 2003, autor3);
        biblio1.agregarLibro("qwe456rty", "Sueños Rotos", 2012, autor1);
        biblio1.agregarLibro("zxc789vbn", "Horizontes Lejanos", 2003, autor2);
        
        biblio1.listarLibros();
        System.out.println("--------------------------------------");
        ConversorOutput.resultadoBusqueda(biblio1.buscarLibro("fdsfdfsg3454"));
        System.out.println("--------------------------------------");
        ConversorOutput.resultadoBusqueda(biblio1.buscarLibro("qwe456rty"));
        System.out.println("--------------------------------------");
        
        ConversorOutput.resultadoBusqueda(biblio1.buscarLibro(2003));
        System.out.println("--------------------------------------");
        biblio1.eliminarLibro("qwe456rty");
        System.out.println("--------------------------------------");
        biblio1.listarLibros();
        System.out.println("--------------------------------------");
        ConversorOutput.cantidadLibros(biblio1.obtenerCantidadDeLibros(), biblio1.getNombre());
        System.out.println("--------------------------------------");
        ConversorOutput.autoresDisponibles(biblio1.getNombre(), biblio1.mostrarAutoresDisponibles());
    }
}
  
