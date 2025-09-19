/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Farid", "00-000000-00");
        Impuesto impuesto = new Impuesto(1000, contribuyente);
        
        
        Calculadora.calcular(impuesto);
        
    }
    
}
