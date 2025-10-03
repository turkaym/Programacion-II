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
public class Fabrica {
    private ArrayList<Sucursal> sucursales; 
    
    public Fabrica(){
        this.sucursales = new ArrayList<>();
    }
    
    public void listarInstrumentos(){
        for (Sucursal sucursal: sucursales){
            System.out.println(sucursal.getNombre());
            sucursal.listarInstrumentos();
        }
    }
    
    public void agregarSucursal(Sucursal sucursal){
        this.sucursales.add(sucursal);
    }
    
    public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo){
        ArrayList<Instrumento> instEncontrados = new ArrayList<>();
        for (Sucursal sucursal: sucursales){
            instEncontrados.addAll(sucursal.instrumentosPorTipo(tipo));
        }
        
        return instEncontrados;
    
    }
}
