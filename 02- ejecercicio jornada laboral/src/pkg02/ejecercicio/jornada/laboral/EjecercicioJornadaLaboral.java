/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02.ejecercicio.jornada.laboral;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class EjecercicioJornadaLaboral {
    //DEFINICION DE LA CONSTANTE POR AFUERA DEL PUBLIC STATIC VOID MAAIN
    final static double CANT_JORNADAS_TRABAJADAS = 5.5;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double sueldoDiario, sueldoSemanal;
        
        System.out.println("Ingresa tu sueldo diario:");
        sueldoDiario = Double.parseDouble(input.nextLine());
        
        sueldoSemanal = sueldoDiario * CANT_JORNADAS_TRABAJADAS;
        
        System.out.println("Tu sueldo semanal es " + sueldoSemanal);
        
    }
    
}
