package trabajo.practico.pkg2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marco
 */
public class ejercicio4 {
    final static double DESCUENTO_A = 10;
    final static double DESCUENTO_B = 15;
    final static double DESCUENTO_C = 20;
    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        double precio, descuento;
        char categoria;
        
           
        System.out.println("Ingresa el precio: ");
        precio = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingresa la categoria del producto [A-B-C]");
        categoria = Character.toUpperCase(input.nextLine().charAt(0));
           
        if (categoria == 'A') {
            descuento = precio * (DESCUENTO_A / 100);
            System.out.println("Descuento aplicado: " + DESCUENTO_A + "%" );
            System.out.println("Precio final: " + (precio - descuento));
        } else if (categoria == 'B'){
            descuento = precio * (DESCUENTO_B / 100);
            System.out.println("Descuento aplicado: " + DESCUENTO_B + "%" );
            System.out.println("Precio final: " + (precio - descuento));
        } else if (categoria == 'C') {
            descuento = precio * (DESCUENTO_C / 100);
            System.out.println("Descuento aplicado: " + DESCUENTO_C + "%" );
            System.out.println("Precio final: " + (precio - descuento));
        } else {
            System.out.println("ERROR. La categoria debe ser [A-B-C]");
        }
        
    }
}
