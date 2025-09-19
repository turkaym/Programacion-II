/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.time.LocalDate;
/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Farid", "farid@salomon.com");
//        FirmaDigital firma = new FirmaDigital("firmaDelUsuario", "hash123", LocalDate.now(), usuario);
        Documento doc = new Documento("Planificacion", "'Planificacion de la escuela'", "firmaDelUsuario", "has1230", LocalDate.now(), usuario);
        
        doc.mostrarFirma();
        System.out.println(doc);
    }
    
}