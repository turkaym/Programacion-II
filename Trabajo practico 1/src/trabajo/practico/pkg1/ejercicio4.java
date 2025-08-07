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
public class ejercicio4 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       String nombre;
       int edad;
       
        System.out.println("Ingresa tu nombre: ");
        nombre = input.nextLine();
        
        System.out.println("Ingresa tu edad: ");
        edad = input.nextInt();
        
        System.out.println("Tu nombre es " + nombre );
        System.out.println("Tienes " + edad + " años");
       
    }
}
