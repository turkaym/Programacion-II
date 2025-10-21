/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author marco
 */
public abstract class Empleado {
    private String nombre;
    private String dni;
    private double sueldo;

    public Empleado(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = 0.0; // inicializamos en 0
    }

    // Método abstracto sin cuerpo (cada subclase lo define)
    public abstract void calcularSueldo();

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) { // ← ahora es void
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", dni=" + dni + ", sueldo=" + sueldo + '}';
    }
    
    
}
