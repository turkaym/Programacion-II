/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class CadenaaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        
            System.out.println("Ingresa un numero: ");
            String texto = new Scanner(System.in).nextLine();
            
            int numero = Integer.parseInt(texto);
            
            System.out.println("Numero ingresado: " + numero);
        } catch(NumberFormatException nfe) {
            System.out.println("Ocurrio un error: " + nfe.getMessage());
            System.out.println("No pueden ser letras");
            nfe.printStackTrace(System.out);
         
        } catch (Exception ex){
            System.out.println("Error: " + ex);
        }
        
        System.out.println("Operacion finalizada");
    }   
    
}
