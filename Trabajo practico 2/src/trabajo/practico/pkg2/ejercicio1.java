/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.pkg2;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class ejercicio1 {

   
    public static void main(String[] args) {
        
        // Verificación de Año Bisiesto.
        Scanner input = new Scanner(System.in);
        int anio;
        
        System.out.println("Ingresa un año: ");
        anio = Integer.parseInt(input.nextLine());
        
        if ((anio % 4 == 0 && anio % 100 !=0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " NO es bisiesto");
        }   
    }
    
}
