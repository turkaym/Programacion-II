/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.ArrayList;

/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro("Perro"));
        animales.add(new Gato("Gato"));
        animales.add(new Vaca("Vaca"));
        
        for (Animal animal: animales){
            animal.describirAnimal();
            animal.hacerSonido();
            System.out.println("-------------------------------");
        }
    }
    
}
