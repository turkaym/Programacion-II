/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22.acumulador;

import java.util.Scanner;

public class Acumulador {

 
    public static void main(String[] args) {
        // Cual es la suma de los primeros 100 numeros naturales
        int cant = 100;
        int sumatoria = 0;
        
        for (int i = 1; i <= cant; i++) {
            //sumatoria = sumatoria + i;
            sumatoria += i;
        }
        
        System.out.println("La sumatoria de los primeros " + cant + " numeros naturales es " + sumatoria);
        
    }
    
}
