/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg07.ciclo.pkgfor.en.java;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class CicloForEnJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.println("Ingresa un numero positivo: ");
        num = Integer.parseInt(input.nextLine());
        
        // de 1 a 5
        for (int i = num; i <= 5; i++){
            System.out.println(i);
        }
        
        System.out.println(" ");
        
        // de 8 a 0 
        for (int j = 8; j >= 0; j--){
            System.out.println(j);
        };
        
        System.out.println(" ");
        
        // de 0 a 10 pero de 2 en 2
        for (int b = 0; b < 10; b += 2){
            System.out.println(b);
        };
        
        System.out.println(" ");
        
        // de 10 a 0 pero de 3 en 3
        for (int a = 10; a >= 0; a -= 3){
            System.out.println(a);
        };
    }
    
}
