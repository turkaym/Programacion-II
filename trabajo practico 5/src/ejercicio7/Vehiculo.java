/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author marco
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void setConductor(Conductor conductor) {
         if (conductor != this.conductor){
            this.conductor = conductor;
            if (conductor.getVehiculo() != this ){
                conductor.setVehiculo(this);
            }
        }
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }
        
    public Conductor getConductor() {
        return conductor;
    }
    
    @Override
    public String toString() {
        return "Vehiculo{patente=" + patente + ", modelo=" + modelo + ", motor=" + motor + 
               ", conductor= " + (conductor != null ? conductor.getNombre() + " con licencia: " + conductor.getLicencia() : "sin conductor") + "}";
    }

}
