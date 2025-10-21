/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg77.herencia.ejemplo2;

/**
 *
 * @author marco
 */
public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String patente;
    
    public Vehiculo(String marca, String modelo, String patente){
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }
    
    public void acelerar(){
        System.out.println("Acelerando");
    }
    
    public void frenar(){
        System.out.println("frenando");
    }
    
    public void encender(){
        System.out.println("Encendiendo vehiculo");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + '}';
    }
    
    
}
