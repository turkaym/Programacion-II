/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg05.pkgstatic;

/**
 *
 * @author marco
 */
public class Static {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto a1 = new Auto("HPZ123", "hONDA", 25000, "Gris");
        Auto a2 = new Auto("DST321", "Fiat", 15000, "Bordo");
        Auto a3 = new Auto("INV789", "Renault", 10000, "Rojo");
    
        System.out.println(a1.precioPromicional());
        System.out.println(a2.precioPromicional());
        System.out.println(a3.precioPromicional());
        
        Auto.anularDescuento();
        System.out.println("");
        
        System.out.println(a1.precioPromicional());
        System.out.println(a2.precioPromicional());
        System.out.println(a3.precioPromicional());
        
    
    }
    
}
