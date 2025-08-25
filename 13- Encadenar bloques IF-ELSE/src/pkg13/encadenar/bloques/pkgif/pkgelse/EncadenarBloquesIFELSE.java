/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13.encadenar.bloques.pkgif.pkgelse;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class EncadenarBloquesIFELSE {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int num;
        String resultado;
        
        System.out.println("Ingresa un numero: ");
        num = Integer.parseInt(input.nextLine());
        
        if (num == 0) {
            resultado = "neutro";
        } else if (num > 0) {
            resultado = "positivo";
        } else {
            resultado = "negativo";
        }
        
        System.out.println("El numero " + num + " es " + resultado);
    }
    
}
