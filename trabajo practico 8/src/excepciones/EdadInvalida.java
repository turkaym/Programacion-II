/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class EdadInvalida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws EdadInvalidaException {
        try {
            System.out.println("Ingresa tu edad: ");
            int edad = new Scanner(System.in).nextInt();
            
            if (edad < 0 || edad > 120){
                throw new EdadInvalidaException("Edad fuera del rango");
            }
            
            System.out.println("Edad: " + edad);
        } catch (EdadInvalidaException ex){
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace(System.out);
        }
    }
 
    
}
