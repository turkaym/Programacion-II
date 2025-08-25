/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg35.comoposicion.de.funciones;

/**
 *
 * @author marco
 */
public class ComoposicionDeFunciones {
    
    public static void main(String[] args) {
        // Cul es el doble del siguiente de 9?
        
        // Con variables
        int siguienteDe9 = siguiente(9);
        int dobleDeSiguiente = doble(siguienteDe9);
        System.out.println(dobleDeSiguiente);
        
        // Con composicion de funciones
        System.out.println( doble(siguiente(9)) );

    }
    
    static int siguiente(int num){
        return num + 1;
    }
    
    static int doble(int x){
        return x * 2;
    }
    
}
