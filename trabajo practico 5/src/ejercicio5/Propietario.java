/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author marco
 */
public class Propietario {
    private String nombre;
    private int dni;
    private Computadora computadora;

    public Propietario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setComputadora(Computadora computadora){
        if (this.computadora == null && computadora != this.computadora){
            this.computadora = computadora;
            if (computadora.getPropietario() != this ){
            computadora.setPropietario(this);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }
    
    public Computadora getComputadora(){
        return this.computadora;
    }
    
    @Override
    public String toString() {
        String computadoraStr = (computadora != null) ? "Computadora: " + computadora.getMarca() + " (Serie: " + computadora.getNumeroSerie() + ")" + ", " + computadora.getPlacaMadre() : "sin computadora";

        return "Propietario{" +
               "nombre='" + nombre + '\'' +
               ", dni=" + dni +
               ", " + computadoraStr +
               '}';
    }
}
