/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg18.ejercicio.de.ciclos;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class EjercicioDeCiclos {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.println("Ingresa un numero entero positivo: ");
        num = Integer.parseInt(input.nextLine());
        
        if (num > 0) {
            
            if (num % 2 != 0) {
                num--;
            }
            
            int cont = num;
            while (cont >= 0) {
                System.out.print(cont + " ");
                cont -= 2;
            }
            
        } else {
            System.out.println("El numero debe ser porisitivo");
        }
        
    }
    
}
