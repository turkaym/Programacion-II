/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg1;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, resultado1;
        double resultado2;

        System.out.println("Ingresa el primer numero:");
        num1 = input.nextInt();

        System.out.println("Ingresa el segundo numero:");
        num2 = input.nextInt();

        resultado1 = num1 / num2;
        resultado2 = (double) num1 / num2; 
        

        System.out.println("El resultado es: " + resultado1);
        System.out.println("El resultado es: " + resultado2);
    
    }
}
