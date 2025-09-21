/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor motor = new Motor("Naftero", "fsadfs345643");
        Vehiculo vehiculo = new Vehiculo("FGH234", "DB9", motor);
        Conductor conductor = new Conductor("Carlos", "234567");
        
        vehiculo.setConductor(conductor);
        
        System.out.println(vehiculo);
        System.out.println("");
        System.out.println(conductor);
    }
    
}
