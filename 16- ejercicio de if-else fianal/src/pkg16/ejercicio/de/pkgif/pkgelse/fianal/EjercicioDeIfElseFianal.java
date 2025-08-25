/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg16.ejercicio.de.pkgif.pkgelse.fianal;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class EjercicioDeIfElseFianal {
    
    final static int LIMITE_INFERIOR = 0;
    final static int LIMITE_SUPERIOR = 24;
    final static int LIMITE_MADRUGADA = 5;
    final static int LIMITE_MANIANA = 11;
    final static int LIMITE_MEDIODIA = 13;
    final static int LIMITE_TARDE = 19;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horaDelDia;
        
        System.out.println("Ingresa la hora: ");
        horaDelDia = Integer.parseInt(input.nextLine());
        
        if (horaDelDia < LIMITE_INFERIOR) {
            System.out.println("La hora del dia no puede ser negativo");
        } else if (horaDelDia > LIMITE_SUPERIOR) {
            System.out.println("La hora del dia no puede ser superior a 24");
        } else if (horaDelDia <= LIMITE_MADRUGADA) {
            System.out.println("Es de madrugada");
        } else if (horaDelDia <= LIMITE_MANIANA) {
            System.out.println("Es la Mañiana");
        } else if (horaDelDia <= LIMITE_MEDIODIA) {
            System.out.println("Es el mediodia");
        } else if (horaDelDia <= LIMITE_TARDE) {
            System.out.println("Es de tarde");
        } else {
            System.out.println("Es de noche");
        }
    }
    
}
