/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication36;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class WhileAccesoConcedidoDenegado {
    
    final static String NOMBRE_VALIDO = "Pepe";
    final static String CLAVE_VALIDA = "1234";
    final static int INTENTOS_MAXIMOS = 3;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre, clave;
        int intentos = 0;
        boolean credencialesInvalidas;
        
        do {
            System.out.println("Nombre de usuario: ");
            nombre = input.nextLine();
            
            System.out.println("Clave de usuario: ");
            clave = input.nextLine();
            
            credencialesInvalidas = !nombre.equalsIgnoreCase(NOMBRE_VALIDO) || !clave.equalsIgnoreCase(CLAVE_VALIDA);
            
            intentos++;
            
        } while (credencialesInvalidas && intentos < INTENTOS_MAXIMOS);
    
        if (credencialesInvalidas) {
            System.out.println("Se ha bloqueado la cuenta");
        } else {
            System.out.println("Acceso concedido");
        }
    }
    
}
