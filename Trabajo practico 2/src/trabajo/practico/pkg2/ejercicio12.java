/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg2;

/**
 *
 * @author marco
 */
public class ejercicio12 {
        public static void main(String[] args) {
        // a. Declarar e inicializar un array con precios
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        // b. Mostrar valores originales
        System.out.println("Precios originales:");
        mostrarPrecios(precios);

        // c. Modificar el precio de un producto específico (ej: índice 2 → $149.75 → $129.99)
        modificarPrecio(precios, 2, 129.99);

        // d. Mostrar valores modificados
        System.out.println("\nPrecios modificados:");
        mostrarPrecios(precios);
    }

    // Método para mostrar todos los precios de un array
    public static void mostrarPrecios(double[] array) {
        for (double precio : array) {
            System.out.println("Precio: $" + precio);
        }
    }

    // Método para modificar un precio específico
    public static void modificarPrecio(double[] array, int indice, double nuevoPrecio) {
        if (indice >= 0 && indice < array.length) {
            array[indice] = nuevoPrecio;
        } else {
            System.out.println("Error: índice fuera de rango.");
        }
    }
}
