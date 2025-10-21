/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg76.polimorfismo.ejemplo.basico;

/**
 *
 * @author marco
 */
public class TarjetaCredito extends MetodoPago{
    private String numeroTarjeta;
    
    public TarjetaCredito(String numeroTarjeta){
        this.numeroTarjeta = numeroTarjeta;
    }
    
    @Override
    public void realizarPago(double cantidad){
        System.out.println("Pagando " + cantidad + " con tarjeta de credito " + numeroTarjeta);
    }
    
}
