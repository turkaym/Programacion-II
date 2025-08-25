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
public class ejercicio6 {
    
        final static int LIMITE = 10;
    
    public static void main(String[] args) {     
        
        Scanner input = new Scanner(System.in);
        int num; 
        int positivo = 0; 
        int negativo = 0;
        int cero = 0;            
        
        for (int i = 1; i <= LIMITE; i++) {
            System.out.print("Ingres el numero "+ i + ": ");
            num = Integer.parseInt(input.nextLine());
            
            if (num > 0) {
                positivo ++;
            } else if (num < 0) {
                negativo ++;
            } else {
                cero++;
            }
        }
        
        System.out.println("Positivos: " + positivo);
        System.out.println("Negativos: " + negativo);
        System.out.println("Ceros: " + cero); 
    }
}
