/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg44.arrays.basico;

/**
 *
 * @author marco
 */
public class ArraysBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tambien puede declarar la variable y despues referirme a esa variable para colocarle un valor.
        // int[] edades;
        // edades = new int[6]
        int[] edades = new int[6];
        double[] precios = new double[4];
        boolean[] flags = new boolean[2];
        char[] simbolos = new char[5];
        String[] palabras = new String[2];
        
        // Con los vectores ya declarados no se puede declarar la variable y despues referirme a esa variable para colocarle un valor.
        int[] edades2 = {27, 45, 32, 16 ,89};     
        double[] precios2 = {2.5, 8.50, 9.15};
        boolean[] flags2 = {false, true, false};
        char[] simbolos2 = {'$', '@', '&', 'h'};
        String[] palabras2 = {"Hola", "Mundo"};
        
        System.out.println(precios2[2]); //9.15
        precios2[2] = 10.50;
        System.out.println(precios2[2]); // 10.50
        
        // para ver todos los elementos de un array no queda otra mas que hacer un ciclo for usando .length
        
        for (int i = 0; i < edades2.length; i++) {
            int elementos = edades2[i];
            System.out.print(elementos + " ");
        }
    }
    
}
