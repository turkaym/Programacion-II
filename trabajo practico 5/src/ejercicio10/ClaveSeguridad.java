/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author marco
 */
import java.time.LocalDate;
public class ClaveSeguridad {
    private String codigo;
    private LocalDate ultimaModificacion;

    // Constructor
    public ClaveSeguridad(String codigo, LocalDate ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    // Constructor copia (para composición)
    public ClaveSeguridad(ClaveSeguridad otra) {
        this.codigo = otra.codigo;
        this.ultimaModificacion = otra.ultimaModificacion;
    }

    public String getCodigo() { return codigo; }
    public LocalDate getUltimaModificacion() { return ultimaModificacion; }

    @Override
    public String toString() {
        return "ClaveSeguridad{codigo='" + codigo + "', ultimaModificacion=" + ultimaModificacion + "}";
    } 
    
}
