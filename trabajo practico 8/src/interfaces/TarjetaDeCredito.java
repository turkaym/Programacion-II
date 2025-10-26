/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author marco
 */
public class TarjetaDeCredito implements PagoConDescuento{
    private String numeroTarjeta;
    
    public TarjetaDeCredito(String numeroTarjeta){
        this.numeroTarjeta = numeroTarjeta;
    }
    
    
    @Override
    public double aplicarDescuento(double monto) {
        // descuento del 10%
        return monto * 0.90;
    }
    
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de Credito N° " + numeroTarjeta);
        System.out.println("Monto final con descuento: $" + aplicarDescuento(monto));
    }
}
