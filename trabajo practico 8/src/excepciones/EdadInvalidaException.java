/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author marco
 */
public class EdadInvalidaException extends RuntimeException {

    public EdadInvalidaException(String edad_fuera_del_rango) {
        super(edad_fuera_del_rango);
    }
    
}
