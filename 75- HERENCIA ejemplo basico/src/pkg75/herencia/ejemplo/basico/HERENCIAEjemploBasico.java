/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg75.herencia.ejemplo.basico;

/**
 *
 * @author marco
 */
public class HERENCIAEjemploBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DOWNCASTING SEGURO
        Animal animal = new Perro("Princesa", 11, "Dogo de Burdeus");
       
        // El operador instanceof es esencial para realizar downcasting seguro, evitando excepciones en tiempo de ejecución y garantizando la robustez del código.
        if (animal instanceof Perro) {
            Perro perro = (Perro) animal; // DOWNCASTING SEGURO
            System.out.println("El nombre del perro es: " + perro.nombre);
           
        } else {
            System.out.println("El animal no es un perro");
        }
        
        Animal animal1 = new Animal("perro", 5);
        animal1.hacerSonido();// "Sonido genérico de animal"
        animal.hacerSonido();// "¡Guau!" - versión sobrescrita@@
    }
    
}
