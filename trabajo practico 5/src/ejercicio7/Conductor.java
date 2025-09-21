/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author marco
 */
public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void setVehiculo(Vehiculo vehiculo) {
         if (vehiculo != this.vehiculo){
            this.vehiculo = vehiculo;
            if (vehiculo.getConductor() != this ){
                vehiculo.setConductor(this);
            }
        }
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }
    
    @Override
    public String toString() {
        return "Conductor{nombre='" + nombre + "', licencia='" + licencia + "', vehiculo=" + 
               (vehiculo != null ? " con patente: " + vehiculo.getPatente() + " modelo: " + vehiculo.getModelo() : "sin vehículo") + "}";
    }

}
