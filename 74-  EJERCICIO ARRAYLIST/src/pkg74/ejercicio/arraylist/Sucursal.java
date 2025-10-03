/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg74.ejercicio.arraylist;

import java.util.ArrayList;

/**
 *
 * @author marco
 */
public class Sucursal {
    private String nombre;
    private ArrayList<Instrumento> instrumentos;
    
    public Sucursal(String nombre){
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>();
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void agregarInstrumento(Instrumento ins){
        this.instrumentos.add(ins);
    }
    
    public void listarInstrumentos(){
        for (Instrumento instrumento: instrumentos){
            System.out.println(instrumento);
        }
    }
    
    public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo){
        ArrayList<Instrumento> instEncontrados = new ArrayList<>();
        for (Instrumento instrumento: instrumentos){
            if (instrumento.getTipo() == tipo) {
                instEncontrados.add(instrumento);
            }
        }
        
        return instEncontrados;
    
    }


}
