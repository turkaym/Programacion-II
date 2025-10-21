/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author marco
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoFijo;

    public EmpleadoPlanta(String nombre, String dni, double sueldoFijo) {
        super(nombre, dni);
        this.sueldoFijo = sueldoFijo;
    }

    @Override
    public void calcularSueldo() {
        setSueldo(sueldoFijo);
    }
}

