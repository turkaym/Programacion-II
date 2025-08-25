/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg27.validacion.de.entradas;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class EjercicioDoWhile {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantidad;
        double precio;
        double montoTotal = 0; // contador
        char opcion;
        
        do {
            System.out.println("Ingresa la cantidad del articulo: ");
            cantidad = Integer.parseInt(input.nextLine());

            System.out.println("Ingresa el precio unitario: ");
            precio = Double.parseDouble(input.nextLine());
            
            //montoTotal = montoTotal + (cantidad * precio);
            montoTotal += cantidad * precio;
            
            System.out.println("¿Desea ingresar otro articulo? [S/N]");
            opcion = input.nextLine().charAt(0);
        } while (opcion != 'N' && opcion != 'n');
            // OTRA FORMA: (!(opcion == 'N' || opcion == 'n'))
            
        System.out.println("Monto total del ticket " + "$" + montoTotal);
    }
    
}
