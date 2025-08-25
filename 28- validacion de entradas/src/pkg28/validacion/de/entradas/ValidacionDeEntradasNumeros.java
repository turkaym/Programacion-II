/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg28.validacion.de.entradas;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class ValidacionDeEntradasNumeros {
    final static int MIN = 1;
    final static int MAX = 10;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.println("Ingresa un numero entre " + MIN + " y " + MAX + ": " );
        num = Integer.parseInt(input.nextLine());
        
        while (num < MIN || num > MAX) {
            System.out.println("ERROR. Ingresa un numero entre " + MIN + " y " + MAX + ": " );
            num = Integer.parseInt(input.nextLine());
        }
    }
    
}
