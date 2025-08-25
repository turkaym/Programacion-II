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
public class ejercicio5 {
    
    final static int FIN_CICLO = 0;
    
    public static void main(String[] args) {     
        
        Scanner input = new Scanner(System.in);
        int num, sumatoria = 0;
        
        System.out.print("Ingres un numero (" + FIN_CICLO + " para terminar): ");
        num = Integer.parseInt(input.nextLine());
        
        while (!(num == FIN_CICLO)) {           
            if (num % 2 == 0) {
                sumatoria += num;
            }
            
            System.out.print("Ingres un numero (" + FIN_CICLO + " para terminar): ");
            num = Integer.parseInt(input.nextLine());
        }
        
        System.out.println("La suma de los numeros pares es: " + sumatoria);
    }
}
