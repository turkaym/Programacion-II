/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg14.condicional.ternario.pkg1;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class CondicionalTernario1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int invitados, sillas, faltantes;
        
        System.out.println("Cantidad de invitados: ");
        invitados = Integer.parseInt(input.nextLine());
        
        System.out.println("Cantidad de sillas: ");
        sillas = Integer.parseInt(input.nextLine());
        
        if (invitados > sillas) {
            faltantes = invitados - sillas;
            System.out.println("Conseguir " + faltantes + " silla" + (faltantes != 1 ? "s" : ""));
        } else {
            System.out.println("Las sillas alcanzan");
        }
    }
    
}
