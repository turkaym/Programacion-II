/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg68.ejercicio.de.poo;

/**
 *
 * @author marco
 */
public class TarjetaDeCredito {
    private String entidadBancaria;
    private String numeroDeTarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;
    
    public TarjetaDeCredito(String entidadBancaria, String numeroDeTarjeta, double saldo, EntidadFinanciera entidadFinanciera, Persona titular){
        this.entidadBancaria = entidadBancaria;
        this.numeroDeTarjeta = numeroDeTarjeta;
        this.saldo = saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
    }

    //Metodo que valida si la tarjeta de credito tiene saldo para pagar.
    public boolean tieneSaldoDisponible(double monto){
        return saldo >= monto;
    }

    //Metodo que descuenta el monto final de la tarjeta
    public void descontar(double monto){
        saldo -= monto;
    }
    
    // Metodo que pide el nombre completo del titular
    public String nombreCompletoDelTitular(){
        // para devolver el nombre completo se lo vamos a pedir al atributo titular ussando el principio TELL, DON'T ASK
        return titular.nombreCompleto();
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", numeroDeTarjeta=" + numeroDeTarjeta + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }
    
}
