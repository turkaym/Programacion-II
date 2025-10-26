/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces;

/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Farid", "emailfalso@farid.com");
        Pedido pedido = new Pedido(cliente);
        
        Producto mix = new Producto("Mix", 14800);
        Producto nuez =  new Producto("Nuez", 21000);
        Producto almendra = new Producto("Almendra", 22500);
        
        pedido.agregarProducto(mix);
        pedido.agregarProducto(nuez);
        pedido.agregarProducto(almendra);
        
        System.out.println("Productos del pedido:");
        pedido.mostrarProductos();
        
        double total = pedido.calcularTotal();
        System.out.println("\nTotal del pedido: $" + total);
        
        PagoConDescuento pago = new TarjetaDeCredito("1234-5678-9105");
        
        System.out.println("\nProcesandoi pago...");
        pago.procesarPago(total);
        
        pedido.cambiarEstado("Pagado");
    
    }
    
}
