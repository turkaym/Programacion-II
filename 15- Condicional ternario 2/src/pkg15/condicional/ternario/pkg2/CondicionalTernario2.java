/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg15.condicional.ternario.pkg2;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class CondicionalTernario2 {
    
    final static int NOTA_APROBACION = 6;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota;
        String resultado;
        
        System.out.println("Ingresa tu nota: ");
        nota = Integer.parseInt(input.nextLine());
        
        resultado = (nota >= NOTA_APROBACION ? "aprobado" : "desaprobado" );
    
        System.out.println("Has " + resultado);
    }
    
}
