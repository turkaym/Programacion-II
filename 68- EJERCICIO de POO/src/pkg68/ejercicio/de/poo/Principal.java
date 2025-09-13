/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg68.ejercicio.de.poo;

/**
 *
 * @author marco
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Posnet posnet = new Posnet();
        Persona persona = new Persona("37.498.103", "Marcos", "Salomon", "2966659577", "faridsalomon90@gmail.com");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("Bco Santa Cruz", "123456789", 25000, EntidadFinanciera.BIRZA, persona);
        
        System.out.println("Tarjeta antes del pago");
        System.out.println(tarjeta);
        
        System.out.println("Ticket tras pagar");
        Ticket ticketGenerado = posnet.efectuarPago(tarjeta, 1000, 5);
        System.out.println(ticketGenerado);
        
        System.out.println("Tarjeta despues del pago");
        System.out.println(tarjeta);
    }   
    
    
}
