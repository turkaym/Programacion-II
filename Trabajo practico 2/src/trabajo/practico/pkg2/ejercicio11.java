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
public class ejercicio11 {
    
    static final double DESCUENTO_ESPECIAL = 0.10;

    public static void main(String[] args) {
        double precioProducto = leerPrecio("Ingrese el precio del producto: ");
        calcularDescuentoEspecial(precioProducto);
    }

    public static double leerPrecio(String mensaje) {
        Scanner input = new Scanner(System.in);
        double precio;

        System.out.print(mensaje);
        precio = Double.parseDouble(input.nextLine());

        while (precio <= 0) {
            System.out.print("Error: el precio debe ser mayor a 0. " + mensaje);
            precio = Double.parseDouble(input.nextLine());
        }

        return precio;
    }

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL; // variable local
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}
