/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author marco
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco; //AGREGACION 1:1
    private Cliente cliente; // ASOCIACION 1:1
    
    
    // EN AGREGACION 1:1 DEBO INCLIR EL OBJETO ATRIBUTO EN EL CONSTRUCTOR
    // EN ASOCIACION 1:1 NO INLUYO EL OBJETI ATRIBUTO EN EL CONSTRUCTOR
    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco){
    this.numero = numero;
    this.fechaVencimiento = fechaVencimiento;
    this.banco = banco;
    }
    
    public void mostrarBanco(){
        if (banco != null) {
            System.out.println("La tarjeta de credito " + numero + " corresponde al banco " + banco.getNombre());
        }
    }
    
    public String getNumero(){
        return numero;
    }
    
    public String getFechaVencimiento(){
        return fechaVencimiento;
    }
    
    public Banco getBanco(){
        return banco;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setNumero(String numero){
        if (numero != null) {
            this.numero =  numero;
        }
    }

    public void setFechaVenimiento(String fechaVencimiento){
        if (fechaVencimiento != null) {
            this.fechaVencimiento = fechaVencimiento;
        }
    }

    public void setBanco(Banco banco){
        this.banco = banco;
    }
    
    // ASOCIACION BIDIRECCIONAL
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
        //EVITA EL BUCLE INFINITO PARA ASEGURAR Y ASEGURA LA CONSISTENCIA DE LA RELACION
        //ESTO NOS ASEGURA QUE HAYA COHERENCIA EN LA VINCULACION
        if (cliente != null && cliente.getTarjetaDeCredito() != this) {
           cliente.setTarjetaDeCredito(this);
        }
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", banco=" + banco + ", cliente=" + cliente + '}';
    }
    
    
}
