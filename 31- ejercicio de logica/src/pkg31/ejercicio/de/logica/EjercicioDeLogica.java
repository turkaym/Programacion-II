/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg31.ejercicio.de.logica;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class EjercicioDeLogica {
    final static char CARACTER = '#';
    final static int MIN = 3;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, espaciosIniciales;
        
        System.out.println("Ingresa la base (impar y mayor a " + MIN + "): " );
        base = Integer.parseInt(input.nextLine());
        
        while ( !(base % 2 != 0 && base >= MIN)) {
            System.out.println("ERROR. Ingresa la base (impar y mayor a " + MIN + "): " );
            base = Integer.parseInt(input.nextLine());
        }
        
        System.out.println("Vamos a dibujar un arbolito de base: " + base);
        
        //definimos los espacios despues de saber la base 
        espaciosIniciales = base / 2; // division entera
        
        for (int contadorDeCaracteres = 1; contadorDeCaracteres <= base; contadorDeCaracteres += 2) {
            // Imprimir espacios
            for (int i = 1; i <= espaciosIniciales; i++) {
                System.out.print(" ");
            }
            
            // Imprimir las estrellas
            for (int i = 1; i <= contadorDeCaracteres; i++) {
                System.out.print(CARACTER);
            }
            
            espaciosIniciales--; // Antes de pasar al proximo renglon restamos uno a la cantidad de espacios iniciales
            System.out.println(); // proximo renglon
        }
    }
    
}
