/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg08.ciclo.pkgdo.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class CicloDoWhile {
    // CONSTANTE CON EL VALOR DE 0 PARA CERRAR EL CICLO DO-WHILE
    static final int CORTE = 0;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, cont = 0;
        
        do {
            System.out.println("Ingresa un numero. " + CORTE + " para salir: ");
            num = Integer.parseInt(input.nextLine());
            //cont = cont + 1;
            cont++;
        } while (num != CORTE);
        
        System.out.println("Cantidad de valores leidos: " + cont);
    }
    
}
