/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg2;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        int stockActual = leerStockActual("Ingrese el stock actual del producto: ");
        int cantidadVendida = leerCantidadVendida("Ingrese la cantidad vendida:", stockActual);
        int cantidadRecibida = leerCantidadRecibida("Ingrese la cantidad recibida:");
        
        int stock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + stock);
    }

    public static int leerStockActual(String mensaje) {
        Scanner input = new Scanner(System.in);
        int stock;
        
        System.out.print(mensaje);
        stock = Integer.parseInt(input.nextLine());
        
        while (stock < 0) {
            System.out.println("ERROR: el stock no puede ser negativo " + mensaje);
            stock = Integer.parseInt(input.nextLine());
        }
        return stock;
    }

    private static int leerCantidadVendida(String mensaje, int stockActual) {
        Scanner input = new Scanner(System.in);
        int cantVendida;
        
        System.out.print(mensaje);
        cantVendida = Integer.parseInt(input.nextLine());
        
         while (cantVendida < 0 || cantVendida > stockActual) {
            if (cantVendida < 0) {
                System.out.print("Error: la cantidad vendida no puede ser negativa. " + mensaje);
            } else {
                System.out.print("Error: no puede vender más que el stock actual (" + stockActual + "). " + mensaje);
            }
            cantVendida = Integer.parseInt(input.nextLine());
        }
        
        return cantVendida;
    }

    private static int leerCantidadRecibida(String mensaje) {
        Scanner input = new Scanner(System.in);
        int cantRecibida;
        
        System.out.print(mensaje);
        cantRecibida = Integer.parseInt(input.nextLine());
        
        while (cantRecibida < 0) {
            System.out.print("Error: la cantidad recibida no puede ser negativa. " + mensaje);
            cantRecibida = Integer.parseInt(input.nextLine());
        }
        
        return cantRecibida;
    }

    private static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
        
    }
}
