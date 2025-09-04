/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg05.tostring;

/**
 *
 * @author marco
 */
public class ToString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Marcos" , "Salomon", 32, false);
        Persona p2 = new Persona("Gladis", "Curtti", 65, true);
       
        System.out.println(p1.toString());
        System.out.println(p2);
    }       
    
}
