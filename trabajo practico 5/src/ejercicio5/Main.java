/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String modeloMother = "ROG Strix";
        String chipMother = "I9 pro";
        Propietario propietario = new Propietario("Farid", 45908765);
        Computadora compu = new Computadora("Asus", "fasdf345", modeloMother, chipMother);
        
        compu.setPropietario(propietario);
        
        System.out.println(compu);
        System.out.println("");
        System.out.println(propietario);
    }    
}
