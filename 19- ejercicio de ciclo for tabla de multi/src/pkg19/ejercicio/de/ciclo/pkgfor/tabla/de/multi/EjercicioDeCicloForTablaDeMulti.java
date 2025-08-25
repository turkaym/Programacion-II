/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg19.ejercicio.de.ciclo.pkgfor.tabla.de.multi;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class EjercicioDeCicloForTablaDeMulti {
    /*Desarrollar un algoritmo que permita ingresar un numero entero positivo entre 1 y 10 inclusive
    La computadora debe mostrar la tabla de multiplicar del numero ingresado*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Ingresa el numero que queres multiplicar: ");
        num1 = Integer.parseInt(input.nextLine());
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(num1 + " x " + i + " = " + (num1 * i));
    
        }
    }
    
}
