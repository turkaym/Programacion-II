/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg2;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class ejercicio8 {
  
    
    public static void main(String[] args) {
        double precioBase = leerPrecioBase("Ingresa el precio base del producto", 1, Integer.MAX_VALUE);  
        double impuesto = leerImpuesto("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%):");
        double descuento = leerDescuento("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%):");
        double precioFinal= calcularPrecioFinal(precioBase, impuesto, descuento);
        
        System.out.println("El precio final del producto es: " + precioFinal);
   
        
    }
    
    public static int leerPrecioBase(String mensaje, int MIN, int MAX){
        Scanner input = new Scanner(System.in);
        System.out.print(mensaje + ": ");
        int x = Integer.parseInt(input.nextLine());
        
        while (x < MIN || x > MAX) {
            System.out.print("ERROR." + mensaje + ": ");
            x = Integer.parseInt(input.nextLine());
        }
        return x;
    }

    public static double leerImpuesto(String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.print(mensaje + ": ");
        int x = Integer.parseInt(input.nextLine());
        
        return x;
    }

    public static double leerDescuento(String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.print(mensaje + ": ");
        int x = Integer.parseInt(input.nextLine()); 
        
        return x;
    }
    
    public static Double calcularPrecioFinal(double precioBase, double impuesto, double descuento ){
        return precioBase + (precioBase * (impuesto / 100)) - (precioBase * (descuento / 100));
    }
    
    
}
