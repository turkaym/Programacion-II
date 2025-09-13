/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg67.tell.don.t.ask;

/**
 *
 * @author marco
 */
public class TellDonTAsk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor m = new Motor("123456987", 1.8, "Nafta");
        Auto a1 = new Auto("HPZ123", "hONDA", 25000, "Gris", m);
        
        
        System.out.println(a1);
        a1.acelerar();
        System.out.println(a1);
    }
    
 
    
}
