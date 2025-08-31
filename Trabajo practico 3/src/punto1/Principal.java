/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto1;

/**
 *
 * @author marco
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascotas tortuga = new Mascotas();
        
        tortuga.nombre = "Pepita";
        tortuga.especie = "Tortuga";
        tortuga.edad = 1;
        
        tortuga.mostrarInfo();
        tortuga.cumplirAnio();
        tortuga.mostrarInfo();
        tortuga.cumplirAnio();
        tortuga.mostrarInfo();
        tortuga.cumplirAnio();
        tortuga.mostrarInfo();
        tortuga.cumplirAnio();
        tortuga.mostrarInfo();
        tortuga.cumplirAnio();

    }
    
}
