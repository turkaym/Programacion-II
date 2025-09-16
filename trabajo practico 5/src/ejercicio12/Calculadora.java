/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author marco
 */
public class Calculadora {
     // Dependencia de uso: recibe el objeto, lo usa, no lo guarda
    static final double IMPUESTO = 1.21;
    
    public void calcular(Impuesto impuesto){
        double total = impuesto.getMonto() * IMPUESTO;
        System.out.println("El contribuyente " + impuesto.getContribuyente().getNombre() + " debe pagar: " + total );
    }
}
