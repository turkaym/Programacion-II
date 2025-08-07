/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03.ejercicio.terreno.metros.cuadrados;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class EjercicioTerrenoMetrosCuadrados {
    //Declaro constante de cantidad de pasadas de alambres
    final static int CANT_PASADAS = 3;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ancho, largo, precioM2, valorDelTerreno, perimetro, cantAlambre;
        
        System.out.print("Ingresa el ancho del terreno: ");
        ancho = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingresa el largo del terreno: ");
        largo = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingresa el precio del metro cuadrado: ");
        precioM2 = Double.parseDouble(input.nextLine());
        
        valorDelTerreno = (ancho * largo) * precioM2;
        
        perimetro = (2 * ancho) + (2 * largo); 
        cantAlambre = perimetro * CANT_PASADAS;
        
        System.out.print("El valor del terreno es " + "USD" + valorDelTerreno + " y " + cantAlambre + " metros de alambre");
        
    }
    
}
