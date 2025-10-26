/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class DivisionSegura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            System.out.println("Ingresa el dividendo: ");
            int a = new Scanner(System.in).nextInt();
            
            System.out.println("Ingresa el divisor: ");
            int b = new Scanner(System.in).nextInt();
            
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (Exception ex){
            System.out.println("Ocurrio un error: " + ex.getMessage());
            System.out.println("No se puede dividir por cero");
            ex.printStackTrace(System.out);
        }
        
        System.out.println("Operacion finalizada");
        
    }

    
}
