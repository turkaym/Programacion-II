/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author marco
 */
public class Titular {
    private String nombre;
    private int dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setPasaporte(Pasaporte pasaporte){
        if (this.pasaporte == null && pasaporte != this.pasaporte){
            this.pasaporte = pasaporte;
            if (pasaporte.getTitular() != this ){
            pasaporte.setTitular(this);
            }
        }
    }
    
    public Pasaporte getPasaporte(){
        return this.pasaporte;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {String pasaporteStr = (pasaporte != null) ? ", Pasaporte numero: " + pasaporte.getNumero() : "sin pasaporte";
        return "Titular{" + "nombre= " + nombre + ", dni= " + dni + pasaporteStr + '}';
    }

}
