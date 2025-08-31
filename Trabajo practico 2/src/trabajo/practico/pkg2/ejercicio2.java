package trabajo.practico.pkg2;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marco
 */
public class ejercicio2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int cantDeNumeros, num;
        int maxNumero; 
        int minNumero; 
        
        cantDeNumeros = 3;
        
        System.out.print("Ingresa un numero 1: ");
        num = Integer.parseInt(input.nextLine());
        
        maxNumero = num;
        minNumero = num;
        
        for (int i = 2; i <= cantDeNumeros; i++) {
            System.out.print("Ingresa un numero " + i + ": ");
            num = Integer.parseInt(input.nextLine());
            
            if (num > maxNumero) {
                maxNumero = num;
            } else if (num < minNumero){
                minNumero = num;    
            }
            
        }
        System.out.println("El mayor es: " + maxNumero);     
         
    }
}
