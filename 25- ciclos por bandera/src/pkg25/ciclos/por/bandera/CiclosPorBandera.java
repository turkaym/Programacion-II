/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg25.ciclos.por.bandera;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class CiclosPorBandera {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantNumeros = 0, num, sumatoria = 0;
        double promedio;
        int umbral = 10;
       
        while (sumatoria < umbral) {
            cantNumeros++;
            System.out.println("Ingresa numero " + cantNumeros + ": ");
            num = Integer.parseInt(input.nextLine());
            sumatoria += num;
        }
        
        promedio = (double) sumatoria /cantNumeros;
        
        System.out.println("La sumatoria de los numeros ingresados es: " + sumatoria);
        System.out.println("El promedio es: " + promedio);
    }
    
}
