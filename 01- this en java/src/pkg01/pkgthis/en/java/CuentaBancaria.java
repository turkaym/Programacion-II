/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01.pkgthis.en.java;

/**
 *
 * @author marco
 */
public class CuentaBancaria {
    private String CBU;
    private String alias;
    private double saldo;
    
    public void mostrarDatos(){
        System.out.println(this);
        System.out.println(CBU + " " + alias + " " + saldo);
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public String getAlias() {
        return alias;
    }
    
    public void setAlias(String alias){
        if (alias != null) {
            this.alias = alias;
        }
    }
    
    public void depositar(double monto) {
        if(monto > 0) {
            saldo = saldo + monto;
        } else {
            System.out.println("Error. no se puede depositar saldo negativo");
        }
    }
    
    private boolean saldoDisponible(double monto) {
        return saldo >= monto;
    }
    
    public void extraer(double monto){
        if (saldoDisponible(monto)) {
            saldo -= monto;
        }
    }
}
