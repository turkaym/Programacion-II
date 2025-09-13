/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg67.tell.don.t.ask;

/**
 *
 * @author marco
 */
public class Motor {
    private String numero;
    private double cilindrada;
    private String tipo;
    private int rpmActuales;
    
    public Motor(String numero, double cilindrada, String tipo){
        this.numero = numero;
        this.cilindrada = cilindrada;
        this.tipo = tipo;
        this.rpmActuales = 0;
    }

    public void setCilindrada(double cilindrada) {
        if (cilindrada > 0) {
         this.cilindrada = cilindrada;   
        }
    }
    
    public void acelerar(){
        this.rpmActuales = this.rpmActuales + 1000;
    }

    @Override
    public String toString() {
        return "Motor{" + "numero=" + numero + ", cilindrada=" + cilindrada + ", tipo=" + tipo + ", rpmActuales=" + rpmActuales + '}';
    }
    
    
    
    

 
}
