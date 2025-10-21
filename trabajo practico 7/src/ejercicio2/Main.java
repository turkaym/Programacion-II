/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author marco
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo("Circulo", 5));
        figuras.add(new Rectangulo("Rectangulo", 5,2));
     
        for (Figura figura: figuras){
            System.out.println("Figura: " + figura.getNombre());
            System.out.println("Area: " + figura.calcularArea());
            System.out.println("-------------------------------");
        }
    }   
    
}
