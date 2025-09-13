/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg62.atributos.de.tipo.objeto;

/**
 *
 * @author marco
 */
public class AtributosDeTipoObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor m = new Motor("123456987", 1.8, "Nafta");
        Auto a1 = new Auto("HPZ123", "hONDA", 25000, "Gris", m);
        Auto a2 = new Auto("DST321", "Fiat", 15000, "Bordo", m);
        Auto a3 = new Auto("INV789", "Renault", 10000, "Rojo", m);
    
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        
        m.setCilindrada(2.4);
        System.out.println("");
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
    
}
