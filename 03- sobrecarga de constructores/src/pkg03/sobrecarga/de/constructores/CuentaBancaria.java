/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03.sobrecarga.de.constructores;

/**
 *
 * @author marco
 */
public class CuentaBancaria {
    private String CBU;
    private String alias;
    private double saldo;
    private String moneda;
    private String tipo;
    
    //CONSTRUCTOR
    //El mejor luigar para inicializar a los atributos de todo objetos es en el cosntructorr
    public CuentaBancaria(String alias, String moneda, String tipo) {
        this.CBU = generarCBU();
        setAlias(alias);
        setMoneda(moneda);
        setTipo(tipo);
    }
    
    //CONSTRUCTOR 
    // para la sobre carga llamaos al cpnstrictor con this()
    public CuentaBancaria(String moneda, String tipo) {
        this("Mi-nuevo-alias", moneda, tipo);
              
    }
    
    //CONSTRUCTOR
    public CuentaBancaria() {
        
    }   
    
    private String generarCBU() {
        return "123456789";
    }
    public void mostrarDatos(){
        System.out.println(CBU + " " + alias + " " + saldo+ " " + moneda + " " + tipo);
    }
    
    // setters que validan que los parametros que llegan no sean nulos
    
    public void setAlias(String alias){
        if (alias != null) {
            this.alias = alias;
        }
    }
    
    public void setMoneda(String moneda) {
        if (moneda != null) {
            this.moneda = moneda;
        }
    }
    
    public void setTipo(String tipo) {
        if (tipo != null) {
            this.tipo = tipo;
        }
    }
    
    // getters
    public double getSaldo() {
        return saldo;
    }
    
    public String getAlias() {
        return alias;
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
