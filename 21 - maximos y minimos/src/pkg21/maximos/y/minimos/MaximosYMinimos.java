/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg21.maximos.y.minimos;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class MaximosYMinimos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int cantDeNumeros, num;
        int maxNumero; 
        int minNumero; 
        int posMaxima = 1;
        int posMinima = 1;
        
        cantDeNumeros = 4;
        
        System.out.print("Ingresa un numero 1: ");
        num = Integer.parseInt(input.nextLine());
        
        maxNumero = num;
        minNumero = num;
        
        for (int i = 2; i <= cantDeNumeros; i++) {
            System.out.print("Ingresa un numero " + i + ": ");
            num = Integer.parseInt(input.nextLine());
            
            if (num > maxNumero) {
                maxNumero = num;
                posMaxima = i;
            } else if (num < minNumero){
                minNumero = num;
                posMinima = i;
            }
            
        }
        System.out.println("El numero mas grande es: " + maxNumero + " en la posicion: " + posMaxima);     
        System.out.println("El numero mas chico es: " + minNumero + " en la posicion: " + posMinima);     
    }
    
}
