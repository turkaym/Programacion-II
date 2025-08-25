/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg32.ciclos.por.contador.y.bandera;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class CiclosPorContadorYBandera {

    final static int MESES_POR_ANIO = 12;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sueldoMensual ,sueldoAnual = 0;
        int i = 1;
        
        System.out.print("Ingrese el sueldo para el mes n°" + i + ": ");
        sueldoMensual = Double.parseDouble(input.nextLine());
        
        while (i < MESES_POR_ANIO && sueldoMensual > 0) {
            sueldoAnual += sueldoMensual;
            i++;
            System.out.print("Ingrese el sueldo para el mes n°" + i + ": ");
            sueldoMensual = Double.parseDouble(input.nextLine());
        }
        
        if (sueldoMensual > 0) {
            sueldoAnual += sueldoMensual;
        }
        
        System.out.println("Tu sueldo anuel es: " + sueldoAnual);
    }
    
}
