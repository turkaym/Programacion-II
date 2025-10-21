/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author marco
 */
public class EmpleadoTemporal extends Empleado{
    private int diasTrabajados;
    private double pagoPorDia;
    
    public EmpleadoTemporal(String nombre, String dni, int diasTrabajados, double pagoPorDia){
        super(nombre, dni);
        this.diasTrabajados = diasTrabajados;
        this.pagoPorDia = pagoPorDia;
    }

    @Override
    public void calcularSueldo() {
       double total = diasTrabajados * pagoPorDia;
       setSueldo(total);
    }
}
