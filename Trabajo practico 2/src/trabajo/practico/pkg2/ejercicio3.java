/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg2;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class ejercicio3 {
    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int edad;
           
        System.out.println("Ingresa tu edad: ");
        edad = Integer.parseInt(input.nextLine());
           
        if (edad < 12 ) {
            System.out.println("Eres un niño");
        } else if (edad <= 17){
            System.out.println("Eres adolecente");
        } else if (edad <= 59) {
            System.out.println("Eres un adulto");
        } else{
            System.out.println("Eres un adulto mayo");
        }
         
    }
}
