/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author marco
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private Propietario propietario;
    private PlacaMadre placaMadre;

    public Computadora(String marca, String numeroSerie, String motherModelo, String motherChip) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(motherModelo, motherChip);
    }
    
    public void setPropietario(Propietario propietario){
        if (this.propietario == null && propietario != this.propietario){
            this.propietario = propietario;
            if (propietario.getComputadora() != this ){
            propietario.setComputadora(this);
            }
        }
    }
    
    public Propietario getPropietario(){
        return this.propietario;
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }
    
    @Override
    public String toString() {
        String propietarioStr = (propietario != null) ? "Propietario: " + propietario.getNombre() + " (DNI: " + propietario.getDni() + ")" : "sin propietario";

        return "Computadora{" +
               "marca='" + marca + '\'' +
               ", numeroSerie='" + numeroSerie + '\'' +
               ", " + placaMadre + propietarioStr +
               '}';
    }
}
