/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02.constructor.en.java;

/**
 *
 * @author marco
 */
public class ConstructorEnJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciamos(creamos) 3 cuentas bancarias como objetos
        // Cada vez que lo hagamos establecemos los valores iniciales
        CuentaBancaria cb1 = new CuentaBancaria("MiAlias", "Pesos", "Caja de ahorro");
        cb1.mostrarDatos();
    }
    
}
