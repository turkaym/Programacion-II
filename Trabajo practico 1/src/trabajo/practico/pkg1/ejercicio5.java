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
public class ejercicio5 {
     public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       int num1, num2;
       
         System.out.println("Ingres el primer numero");
         num1 = input.nextInt();
         
         System.out.println("Ingres el segundo numero");
         num2 = input.nextInt();
         
         System.out.println(num1 + num2);
         System.out.println(num1 - num2);
         System.out.println(num1 * num2);
         System.out.println((double) num1 / num2);
     }
}