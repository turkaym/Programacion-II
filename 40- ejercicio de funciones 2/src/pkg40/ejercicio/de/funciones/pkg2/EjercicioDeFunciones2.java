/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg40.ejercicio.de.funciones.pkg2;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class EjercicioDeFunciones2 {

    // Desarrollar un algoritmo de forma modularizada que permita ingresr un numero natural.
    // La computadora debera mostrar si el numero es o no perfecto
    
    public static void main(String[] args) {
        int n = leerEnteroEntre("Ingresa un numero natural", 1, Integer.MAX_VALUE);
        informarSiEsPerfecto(n);
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
    
    static void informarSiEsPerfecto(int num){
        if (esPerfecto(num)) {
            System.out.println("El numero " + num + " es perfecto");
        } else {
            System.out.println("El numero " + num + " NO es perfecto");
        }
    }

    static boolean esPerfecto(int num) {
        return sumatoriaDeDivisoresPropios(num) == num;
    }
    
    static boolean esMultiplo(int a, int b){
        return obtenerResto(a, b) == 0;
    }
    
    static int obtenerResto(int num1, int num2){
        return num1 - num2 * (num1 / num2);
    }

    static int sumatoriaDeDivisoresPropios(int num) {
        int sumatoria = 0;
        int mitad = num / 2; // para saber los divisores de un numero solo hace falta llegar hasta la mitad de ese numero
        
        for (int i = 1; i <= mitad; i++) {
            if (esMultiplo(num, i)) {
                sumatoria += i;
            }
        }
        return sumatoria;
    }
    
}
