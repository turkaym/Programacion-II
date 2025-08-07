/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01.ejercicio.año.de.nacimiento;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class EjercicioAñoDeNacimiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anioDeNacimiento, anioActual, edadDelUsuario;
        
        anioActual = 2025;
        
        System.out.println("Ingresa tu año de nacimiento:");
        anioDeNacimiento = Integer.parseInt(input.nextLine());
        
        edadDelUsuario = anioActual - anioDeNacimiento;
        
        System.out.println("Su edad es " + edadDelUsuario);
    }
    
}
