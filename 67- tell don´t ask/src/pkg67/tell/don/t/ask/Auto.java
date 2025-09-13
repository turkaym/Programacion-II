/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg67.tell.don.t.ask;

/**
 *
 * @author marco
 */
public class Auto {
      //ATRIBUTOS
    private String patente; //VARIABLE DE INSTANCIA
    private String marca;   //VARIABLE DE INSTANCIA
    private double precio;  //VARIABLE DE INSTANCIA
    private String color;   //VARIABLE DE INSTANCIA
    private Motor motor;    // Atributo del objeto
    
    
    //CONSTRUCTOR PARA INICIALIZAR LOS ATRIBUTOS
    public Auto(String patente, String marca, double precio, String color, Motor motor){
        this.patente = patente;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.motor = motor;
    }
    
    public void acelerar(){
        this.motor.acelerar();
    }
    
    //Metodo toString para visualizar dn la consola el estado del objeto 
    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", marca=" + marca + 
                ", precio=" + precio + ", color=" + color + ", motor=" + 
                motor + '}';
    }
    
}
