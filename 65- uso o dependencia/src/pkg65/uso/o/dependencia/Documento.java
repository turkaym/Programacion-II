/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg65.uso.o.dependencia;

/**
 *
 * @author marco
 */
public class Documento {
    private String titulo;
    private String cuerpo;
    
    public Documento(String titulo, String cuerpo){
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }
    
    public String getTiulo(){
        return titulo;
    }
    
    public String getCuerpo(){
        return cuerpo;
    }
    
}
