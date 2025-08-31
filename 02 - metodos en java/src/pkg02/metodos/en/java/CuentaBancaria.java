/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg02.metodos.en.java;

public class CuentaBancaria {
    private String CBU;
    private String alias;
    private double saldo;
    
    public void mostrarDatos(){
        System.out.println(CBU + " " + alias + " " + saldo);
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public String getAlias() {
        return alias;
    }
    
    public void setAlias(String nuevoAlias){
        if (nuevoAlias != null) {
            alias = nuevoAlias;
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
