/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String valor = "$ 10";
        String usuario = "Tito Gonzalez";
        String email = "tito@gonzalez.com";
        
        GeneradorQR.generar(valor, usuario, email);
    
    }
    
}
