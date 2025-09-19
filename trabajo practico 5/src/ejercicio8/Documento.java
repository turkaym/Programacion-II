/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author marco
 */
import java.time.LocalDate;
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; //COMPOSICION 1:1
    
    
    public Documento(String titulo, String contenido, String firma, String hashCode, LocalDate fecha, Usuario usuario){
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(firma, hashCode, fecha, usuario);
    }
    
    public void mostrarFirma(){
        System.out.println("El documento " + titulo + " tiene la firma " + firmaDigital.getFirma());
    }

    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firmaDigital=" + firmaDigital + '}';
    }
    
    
    
}
