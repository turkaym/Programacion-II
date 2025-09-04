/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03.sobrecarga.de.constructores;

/**
 *
 * @author marco
 */
public class SobrecargaDeConstructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciamos(creamos) 3 cuentas bancarias como objetos
        // Cada vez que lo hagamos establecemos los valores iniciales
        CuentaBancaria cb1 = new CuentaBancaria("MiAlias", "Pesos", "Caja de ahorro");
        CuentaBancaria cb2 = new CuentaBancaria();
        CuentaBancaria cb3 = new CuentaBancaria("Dolaresz" , "Caja de ahorros");
        
        
        cb1.mostrarDatos();
        cb2.mostrarDatos();
        cb3.mostrarDatos();
    }
    
}
