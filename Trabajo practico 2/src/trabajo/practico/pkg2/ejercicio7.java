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
public class ejercicio7 {
    final static int INICIO = 0;
    final static int FIN = 10;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota; 
   
        do {
            System.out.print("Ingresa una notra entre (" + INICIO + "-" + FIN + ")");
            nota = Integer.parseInt(input.nextLine());
            
            if (nota < INICIO || nota > FIN ) {
                System.out.println("ERROR. Nota invalida. Ingresa una notra entre (" + INICIO + "-" + FIN + ")");
            }
        } while (nota < INICIO || nota > FIN);
        
        System.out.println("Nota guardada con exito");
    }
}
