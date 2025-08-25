/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.farid.ejemplos;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Utils {
    
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
    
    /**
     * Retorna true si el primer argumento es multiplo del segundo argumendo
     * @param a un numero entero que sera dividido por <code>b<code>
     * @param b Un numero entero que dividira a <code>a<code>
     * @return return true si <code>a<code> es multiplo de <code>b<code>
     */
    
    static boolean esMultiplo(int a, int b){
        return obtenerResto(a, b) == 0;
    }
    
    static int obtenerResto(int num1, int num2){
        return num1 - num2 * (num1 / num2);
    }
    
    
    static void imprimirSimbolo(char simbolo, int veces){
        System.out.println(sucesionDeSimbolos(simbolo, veces));
    }

    static String sucesionDeSimbolos(char simbolo, int veces) {
        String sucesion = "";
        for (int i = 0; i < veces; i++) {
            sucesion += simbolo;
        }
        return sucesion;
    }
    
    
}
