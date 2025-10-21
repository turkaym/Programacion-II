    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg79.polimorfismo1;

/**
 *
 * @author marco
 */
public class Polimorfismo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        probar(new Vehiculo());
        System.out.println("-----------------");
        probar(new Avion());
        System.out.println("-----------------");
        probar(new Bicicleta());
        
    }
    
    public static void probar(Vehiculo v){
         v.encender();
    }
    
}
