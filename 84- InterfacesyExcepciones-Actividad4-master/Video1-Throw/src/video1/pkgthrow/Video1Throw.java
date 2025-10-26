/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package video1.pkgthrow;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Video1Throw {

    public static void main(String[] args) {
        
        /***THROW en Java: Lanzar EXCEPCIONES***/
        
        /**Observando donde java lanza una excepcion**/
        /*
        int x = Math.incrementExact(2147483647);
        System.out.println(x);
        */
        
        /**Lanzar excepciones manualmente**/
        
        int y,z;
        System.out.println("Ingrse y: ");
        y = new Scanner(System.in).nextInt();
        z = new Calculadora().factorial(y);
        System.out.println("Resultado: " + z);
        System.out.println("Adios!");
    }

    private static class Calculadora {
    
        /**Lanzar excepciones manualmente**/

        public int factorial(int num) {
            if (num < 0) {
                throw new ArithmeticException("No se puede calcular el factorial de un numero negativo");
                /**
                 * Ante la duda "RuntimeException"*
                 */
                /*
            throw new RuntimeException("No se puede calcular el factorial de un numero negativo");
                 */
            }
            if (num > 12) {
                throw new IllegalArgumentException("Por limitaciones técnicas, no se puede calcular el factorial de un entero mayor que 12");
            }
            int fact = 1;
            for (int i = 2; i <= num; i++) {
                fact = fact * i;
            }
            return fact;
        }
    }
    
}
