/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg77.herencia.ejemplo2;

/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Concesionaria c = new Concesionaria();
        Auto a = new Auto(true, "Honda", "Civic", "ASD123");
        
        c.agregarVehiculo(a);
        c.agregarVehiculo(new Moto(20, "Mercedes", "GPR", "POI852"));
    }
    
}
