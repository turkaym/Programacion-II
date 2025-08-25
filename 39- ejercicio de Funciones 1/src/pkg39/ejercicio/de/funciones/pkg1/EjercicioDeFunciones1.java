/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg39.ejercicio.de.funciones.pkg1;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class EjercicioDeFunciones1 {

    // Desarrollar un algoritmo de forma modularizada que permita ingresar un numero natural
    // La computadora debe mostrar si el numero es o no primo
    // vamos a usar una metodolofia top-down ir de lo mas general a lo mas particular
    
    
    public static void main(String[] args) {
        int n = leerEnteroEntre("Ingresa un numero natural", 1, Integer.MAX_VALUE);
        informarSiEsPrimo(n);
    }
    
    static int leerEnteroEntre(String mensaje, int MIN, int MAX){
        Scanner input = new Scanner(System.in);
        System.out.print(mensaje + ": ");
        int x = Integer.parseInt(input.nextLine());
        
        while (x < MIN || x > MAX) {
            System.out.print("ERROR." + mensaje + ": ");
            x = Integer.parseInt(input.nextLine());
        }
        return x;
    }
    
    static void informarSiEsPrimo(int num){
        if (esPrimo(num)) {
            System.out.println("El numero " + num + " es primo");
        } else {
            System.out.println("El numero " + num + " NO es primo");
        }
    }
    
    static boolean esPrimo(int num){
        int cont = 2;
        int mitad = num / 2;
        while (cont <= mitad && !esMultiplo(num, cont)) {
            cont++;
        }
        return cont > mitad;
    }
    
    static boolean esMultiplo(int a, int b){
        return obtenerResto(a, b) == 0;
    }
    
    static int obtenerResto(int num1, int num2){
        return num1 - num2 * (num1 / num2);
    }
}
