/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11.pkgif.pkgelse;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class IFELSE {

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        int a, b;
        double division;
        
        System.out.println("EJEMPLO DE IF");
        
        System.out.println("Ingresa un numero: ");
        a = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresa un numero: ");
        b = Integer.parseInt(input.nextLine());
        
        if (b != 0) {
            division = (double) a / b;
            System.out.println("El resultado de la división es: " + division);
        } else {
            System.out.println("No se puede dividir por cero");
        };
        System.out.println("Chau");
    }
    
}
