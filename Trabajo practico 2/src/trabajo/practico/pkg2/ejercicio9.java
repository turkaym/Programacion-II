/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg2;

import java.util.Scanner;


public class ejercicio9 {
    public static void main(String[] args) {
   
        double precioProducto = leerPrecioDelProducto("Ingresa el precio del producto: ");
        double pesoProducto = leerPesoDelProducto("Ingresa el peso del paquete en kg: ");
        String zonaEnvio = leerZonaDelEnvio("Ingresa la zona de envio (Nacional/Internacional):");
    
        double costoEnvio = calcularCostoEnvio(pesoProducto, zonaEnvio);
        double total = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envio es " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
        
    }

    public static double leerPrecioDelProducto(String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        double precio = Double.parseDouble(input.nextLine());
        
        return precio;
    }

    public static double leerPesoDelProducto(String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        double peso = Double.parseDouble(input.nextLine());
        
        return peso;
    }

    public static String leerZonaDelEnvio(String mensaje) {
        Scanner input = new Scanner(System.in);
        String zona;
        
        do {
           System.out.println(mensaje);
            zona = input.nextLine(); 
            
            if (!zona.equalsIgnoreCase("Nacional") && !zona.equalsIgnoreCase("Internacional")) {
                System.out.println("ERROR. Escriba 'Nacional' o 'Internacional'");
            }
        } while (!zona.equalsIgnoreCase("Nacional") && !zona.equalsIgnoreCase("Internacional"));  
        return zona;
    }

    private static double calcularCostoEnvio(double pesoProducto, String zonaEnvio) {
        double tarifa;
        if (zonaEnvio.equalsIgnoreCase("Nacional")) {
            tarifa = 5.0;
        } else {
            tarifa = 10.0;
        }
         return tarifa * pesoProducto;
    }

    private static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    
}
