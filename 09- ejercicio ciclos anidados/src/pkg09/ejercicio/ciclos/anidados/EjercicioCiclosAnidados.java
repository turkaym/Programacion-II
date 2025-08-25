/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg09.ejercicio.ciclos.anidados;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class EjercicioCiclosAnidados {

   final static char CARACTER = 'X';
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ancho, alto;
        
        System.out.println("Ingresa el ancho: ");
        ancho = Integer.parseInt(input.nextLine());
        
        while (ancho <= 0) {
            System.out.println("ERROR. Ingresa el ancho");
            ancho = Integer.parseInt(input.nextLine());
        }
        
        System.out.println("Ingresa el alto: ");
        alto = Integer.parseInt(input.nextLine());
        
        while (alto <= 0) {
            System.out.println("ERROR. Ingresa el alto");
            alto = Integer.parseInt(input.nextLine());
        }
        
        for (int i = 1; i <= alto; i++){ // Si el alto es 4, se va a ejecutra 4 veces
            for (int j = 1; j <= ancho; j++){ // Si el ancho es 8 se va a imprimir 8 veces el caracter
                System.out.print(CARACTER);
            }
            
            System.out.println(); //  Nos permite hacer el salto a otro renglon
        }
        
    }
    
}
