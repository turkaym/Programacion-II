/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Farid", "2966-659577");
        Mesa mesa = new Mesa(4, 8);
        
        LocalDate fecha= LocalDate.of(2025,9,13);
        LocalTime hora= LocalTime.of(20,30);
        Reserva reserva = new Reserva(fecha,hora, mesa);
        
        //asociacion unidireccional
        reserva.setCliente(cliente);
        reserva.mostrarCliente();
        System.out.println(reserva);
        
        // agregacion 1:1
        reserva.mostrarMesa();
    }
    
}
