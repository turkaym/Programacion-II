/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;
    import java.time.LocalDate;
/**
 *
 * @author marco
 */
public class FirmaDigital {
    private String firma;
    private String hashCode;
    private LocalDate fecha;
    private Usuario usuario; // AGREGACION 1:1
    
    public FirmaDigital(String firma, String hashCode, LocalDate fecha, Usuario usuario) {
        this.firma = firma;
        this.hashCode = hashCode;
        this.fecha = fecha;
        this.usuario = usuario;
    }
    
    
    public LocalDate getFecha(){
        return fecha;
    }
    
    public String getFirma(){
        return firma;
    }
    
    public void mostrarUsuario(){
        if (usuario != null) {
            System.out.println("El usuario " + usuario.getNombre() + " tiene la firma " + firma);
        }
    }

    @Override
    public String toString() {
        return "FirmaDigital{" + "firma=" + firma + ", hashCode=" + hashCode + ", fecha=" + fecha + ", usuario=" + usuario + '}';
    }
    
    
    
}
