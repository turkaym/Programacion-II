/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author marco
 */
public class Mesa {
    private int numero;
    private int capacidad;
    
    public Mesa(int numero, int capacidad){
        this.numero =  numero;
        this.capacidad = capacidad;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public int getCapacidad(){
        return capacidad;
    }
    
    public void setNumero(int numero){
        if (numero > 0) {
            this.numero = numero;
        }
    }
    
    public void setCapacidad(int capacidad){
        if (capacidad > 0) {
            this.capacidad = capacidad;
        }
    }

    @Override
    public String toString() {
        return "Mesa{" + "numero=" + numero + ", capacidad=" + capacidad + '}';
    }
    
    
}
