/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23.sumatorias.y.promedios;

import java.util.Scanner;

public class SumatoriasYPromedios {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantNumeros, num, sumatoria = 0;
        double promedio;
        
        cantNumeros = 4;
        
        for (int i = 1; i <= cantNumeros; i++) {
            System.out.println("Ingresa un numero: ");
            num = Integer.parseInt(input.nextLine());
            sumatoria += num;
        }
        
        promedio = (double) sumatoria /cantNumeros;
        
        System.out.println("La sumatoria de los numeros ingresados es: " + sumatoria);
        System.out.println("El promedio es: " + promedio);
    }
    
}
