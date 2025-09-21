/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Artista bach = new Artista("J.S. Bach", "Clasica");
      
      Cancion laPrimavera = new Cancion("La Primavera", bach);
      
      Reproductor.reproducir(laPrimavera);
 
    }
    
}
