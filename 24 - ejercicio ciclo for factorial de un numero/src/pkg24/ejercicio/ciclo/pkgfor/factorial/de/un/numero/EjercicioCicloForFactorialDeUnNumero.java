/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg24.ejercicio.ciclo.pkgfor.factorial.de.un.numero;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class EjercicioCicloForFactorialDeUnNumero {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, productoria = 1;
        
        System.out.println("Ingresa un numero para conocer su factorial: ");
        num = Integer.parseInt(input.nextLine());
        
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                productoria *= i;
            }
            System.out.println("El factorial de " + num + " es: " + productoria);
        } else {
          System.out.println("No se puede calcular el factorial de un numero negativo");
        }
        
    }
    
}
