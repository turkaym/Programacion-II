/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto1;

/**
 *
 * @author marco
 */
public class Mascotas {
    final static int EDAD_MAX = 5;
    
    String nombre;
    String especie;
    int edad;
    
    void mostrarInfo(){
        System.out.println("Nombre: " +nombre + " | "+ "Especie: " + especie + " | " + "Edad: " + edad);
    }
    
    void cumplirAnio(){ 
        if (edad < 0) {
            System.out.println("ERROR. La edad no puede ser negativa");
            edad = 0;
            return;
        }
        
        
        if (edad < EDAD_MAX) {
            edad += 1;
            System.out.println("Feliz cumple " + nombre + ". Ahora tenes " + edad);
        } else {
            System.out.println("ya alcanzo la edad maxima");
        }  
    }
   
}
