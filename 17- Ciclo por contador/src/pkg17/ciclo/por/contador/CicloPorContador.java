/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg17.ciclo.por.contador;

/**
 *
 * @author marco
 */
public class CicloPorContador {

    public static void main(String[] args) {
        int cont;
        
        cont = 1;
        
        while (cont <= 5) {
            System.out.println(cont + " iteracion");
            // cont = cont + 1;
            cont++;
        }
        
        System.out.println("////////////////");
        
        cont = 5;
        
        while (cont >= 1) {
            System.out.println(cont + " iteracion");
            // cont = cont - 1;
            cont--;
        }
        
        
    }
    
}
