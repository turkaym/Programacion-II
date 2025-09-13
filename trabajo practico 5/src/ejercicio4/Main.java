/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco banco = new Banco("Bco. Santa Cruz", "37-498-123");
        Cliente cliente = new Cliente("Marcos", "37498103");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1235669877", "25-33", banco);
        
        tarjeta.mostrarBanco();
        
        tarjeta.setCliente(cliente);// con esta accion deberia de asegurar la vinculacion
        System.out.println("El cliente " + cliente.getNombre() );
        System.out.println("La tarjeta " + tarjeta.getNumero());
        System.out.println("El cliente asociado a la tarjeta " +  tarjeta.getCliente().getNombre());
    
    }
    
}
