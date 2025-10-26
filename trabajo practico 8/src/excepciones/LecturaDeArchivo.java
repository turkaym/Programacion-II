/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author marco
 */
public class LecturaDeArchivo {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args){
        
        LectorDeArchivo lector = new LectorDeArchivo();
        try {
            lector.mostrarTxt("...");
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe");
        } catch (IOException ex){
            System.out.println("Error de entrada/salida");
            System.out.println(ex.getMessage()); 
        }
    }
    
}
