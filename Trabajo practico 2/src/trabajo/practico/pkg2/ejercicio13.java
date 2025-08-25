/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg2;

/**
 *
 * @author marco
 */
public class ejercicio13 {
        public static void main(String[] args) {
        // a. Declarar e inicializar un array con precios
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        // b. Mostrar precios originales con recursividad
        System.out.println("Precios originales:");
        mostrarRecursivo(precios, 0);

        // c. Modificar un precio específico (ej: índice 2 → $149.75 → $129.99)
        modificarPrecio(precios, 2, 129.99);

        // d. Mostrar precios modificados con recursividad
        System.out.println("\nPrecios modificados:");
        mostrarRecursivo(precios, 0);
    }

    // Función recursiva para mostrar precios
    public static void mostrarRecursivo(double[] array, int indice) {
        if (indice < array.length) {
            System.out.println("Precio: $" + array[indice]);
            mostrarRecursivo(array, indice + 1); // llamada recursiva
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
