/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asociacion.bidereccional.pkg1.a.pkg1;

/**
 *
 * @author marco
 */
public class AsociacionBidereccional1A1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matricula matricula = new Matricula("AB123LK");
        Coche etios = new Coche("Etios");
        
        etios.setMatricula(matricula); // PARA VINCULARLO, ASOCIADOS DE UN SOLO LADO
        
        System.out.println("Auto: " + etios.getModelo());
        System.out.println("Matricula: " + matricula.getNumero());
        System.out.println("El auto " + etios.getModelo() + " tiene la matricula " + etios.getMatricula().getNumero()); // AUTO ASOCIADO A LA MATRICULA 
        System.out.println("La matricula " + matricula.getNumero()+ " esta asociada al auto " + matricula.getCoche().getModelo() ); // MATRICULA ASOCIADA AL AUTO
    }  
    
}
