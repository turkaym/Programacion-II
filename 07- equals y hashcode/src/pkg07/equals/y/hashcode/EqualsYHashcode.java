/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg07.equals.y.hashcode;

/**
 *
 * @author marco
 */
public class EqualsYHashcode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Persona p1 = new Persona("Ana", 123);
        Persona p2 = new Persona("Ana", 123);

        System.out.println(p1.equals(p2));
    }
    
}
