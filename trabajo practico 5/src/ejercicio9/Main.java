/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CitaMedica cita1 = new CitaMedica("19 de septiembre", "13:00hs");
        Paciente paciente1 = new Paciente("Juan Carlos", "OSDE");
        Profesional profesional1 = new Profesional("Pepe Gonzalez", "Cardiologo");
        CitaMedica cita2 = new CitaMedica("19 de septiembre", "13:00hs", paciente1, profesional1);
        
        System.out.println(cita1);
        System.out.println("");
        System.out.println(cita2);
    }
    
}
