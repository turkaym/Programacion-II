/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg26.ejercicio.pkgwhile;

import java.util.Scanner;


public class EjercicioWHILE {
    
    final static String CORTE = "*";   
    final static String NOMBRE_INVALIDO = "@@@@@";   
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre, nombreMasJoven = NOMBRE_INVALIDO;
        int edad, minEdad = Integer.MAX_VALUE;
        
        System.out.println("Ingresa el nombre (" + CORTE + " para cortar)");
        nombre = input.nextLine();
        
        while (!nombre.equals(CORTE)) {
            System.out.println("Ingresa la edad de " + nombre);
            edad = Integer.parseInt(input.nextLine());
            
            if (edad < minEdad) {
                minEdad = edad;
                nombreMasJoven = nombre;
            }
            
            System.out.println("Ingresa el nombre (" + CORTE + " para cortar)");
            nombre = input.nextLine();
        }
        
        if (!nombreMasJoven.equals(NOMBRE_INVALIDO)) {
            System.out.println("La persona mas joven ("+ minEdad + " años) es " + nombreMasJoven);
        } else {
            System.out.println("No se ingresaron nombres");
        }
      
    }
    
}
