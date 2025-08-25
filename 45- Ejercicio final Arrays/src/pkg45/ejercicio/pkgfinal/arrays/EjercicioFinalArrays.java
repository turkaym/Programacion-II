/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg45.ejercicio.pkgfinal.arrays;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class EjercicioFinalArrays {

    final static int CANT_NUMEROS = 8;
    
    public static void main(String[] args) {
        // Crear un vector de 8 enteros
        int[] numeros = new int[CANT_NUMEROS];
        // Pedir 8 numeros enteros
        cargarValores(numeros);
        // Calcular el promedio y mostrarlo
        double prom = promedio(numeros);
        System.out.println("El promedio es " + prom);
        // mostrar valores que superen el promedio2
        mostrarValoresMayoresQue(prom, numeros);
        
    }

    private static void cargarValores(int[] valores) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Ingresa el " + (i + 1) + "° valor: ");
            valores[i] = Integer.parseInt(input.nextLine());
        }
    }

    private static double promedio(int[] valores) {
     return suma(valores) / (double) valores.length;   
    }

    private static void mostrarValoresMayoresQue(double valor, int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > valor){
                System.out.println(valores[i] + " ");
            }
        }
    }

    private static double suma(int[] valores) {
        int acu = 0;
        for (int i = 0; i < valores.length; i++) {
            acu += valores[i];
        }
        return acu;
    }
    
}
