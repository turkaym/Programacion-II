/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20.ejercicio.de.ciclo.pkgfor.porcentajes;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class EjercicioDeCicloForPorcentajes {
    static final int EDAD_MINIMA = 18;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantPersonas, edad, contMayorDeEdad = 0;
        double porcMayoresDeEdad;
        
        System.out.println("Ingresa ña cantidad de personas: ");
        cantPersonas = Integer.parseInt(input.nextLine());
        
        for (int i = 1; i <= cantPersonas; i++) {
            System.out.println("Ingresa la edad de la persona N°" + i);
            edad = Integer.parseInt(input.nextLine());
            
            if (edad >= EDAD_MINIMA) {
              contMayorDeEdad++;  
            } 
        }
        porcMayoresDeEdad = ((double) contMayorDeEdad * 100) / cantPersonas;
        System.out.println("El procentaje de personas mayores de " + EDAD_MINIMA + " es de " + porcMayoresDeEdad + "%");
    }
    
}
