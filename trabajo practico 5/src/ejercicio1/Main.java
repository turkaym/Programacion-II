/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pasaporte pasaporte = new Pasaporte("2345234562", "25/06/2020", "Imagen de frente", ".jpg");
        Titular titular = new Titular("Roberto Carlos", 35086378);
        
        pasaporte.setTitular(titular);
        
        System.out.println(pasaporte);
        System.out.println("");
        System.out.println(titular);
    }   
}
