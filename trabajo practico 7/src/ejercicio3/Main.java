/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoPlanta("Marcos Salomon", "37.488.123", 500000));
        empleados.add(new EmpleadoTemporal("Julieta Arias", "36.597.159", 20,12000));
        empleados.add(new EmpleadoTemporal("Lucas Monzon", "38.357..157", 15, 12000));
        
        for (Empleado empleado: empleados) {
            empleado.calcularSueldo();
            System.out.println(empleado);
        
            if (empleado instanceof EmpleadoPlanta) {
                System.out.println("Es empleado de planta permanente");
            } else if (empleado instanceof EmpleadoTemporal) {
                System.out.println("Es un empleaod de temporada");
            }
            
            System.out.println("----------------------------------");
        }
        
    }
    
}
