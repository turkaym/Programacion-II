/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author marco
 */
public class PayPal implements PagoConDescuento{
    public String usuario;
    
    public PayPal(String usuario){
        this.usuario = usuario;
    }
        
    @Override
    public double aplicarDescuento(double monto) {
        // Descuento del 5%
        return monto * 0.95;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado con PayPal por el usuario " + usuario);
        System.out.println("monto final con descuento: $" + aplicarDescuento(monto));
    }

    


    
}
