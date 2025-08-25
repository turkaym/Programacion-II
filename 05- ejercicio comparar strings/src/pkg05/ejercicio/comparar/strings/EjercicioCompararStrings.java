/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg05.ejercicio.comparar.strings;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class EjercicioCompararStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombrePersona, nombreEsperado;
        
        System.out.println("Ingresa tu nombre: ");
        nombrePersona = input.nextLine();
        
        nombreEsperado = "Juan";
        
        System.out.println(nombrePersona.equals(nombreEsperado) );
                
        
    }
    
}
