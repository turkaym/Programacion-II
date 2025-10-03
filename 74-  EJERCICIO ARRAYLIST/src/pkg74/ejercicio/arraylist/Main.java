/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg74.ejercicio.arraylist;

import java.util.ArrayList;

/** 
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        cargarFabrica(fabrica);
        
//        fabrica.listarInstrumentos();
        ArrayList<Instrumento> lista = fabrica.instrumentosPorTipo(TipoInstrumento.VIENTO);
        for (Instrumento instrumento: lista){
            System.out.println(instrumento);
        }
    }
    
    public static void cargarFabrica(Fabrica fabrica){
        Sucursal suc1 = new Sucursal("Sucursal A");
        Sucursal suc2 = new Sucursal("Sucursal B");
        Sucursal suc3 = new Sucursal("Sucursal C");
        
        suc1.agregarInstrumento(new Instrumento("ABC123", 500.000, TipoInstrumento.CUERDA));
        suc1.agregarInstrumento(new Instrumento("DSA356", 150.000, TipoInstrumento.PERCUSION));
        suc1.agregarInstrumento(new Instrumento("AQV333", 200.000, TipoInstrumento.VIENTO));
        
        suc2.agregarInstrumento(new Instrumento("VCX951", 350.000, TipoInstrumento.PERCUSION));
        suc2.agregarInstrumento(new Instrumento("POI439", 100.000, TipoInstrumento.VIENTO));
        
        suc3.agregarInstrumento(new Instrumento("LDH852", 50.000, TipoInstrumento.CUERDA));
 
        
        fabrica.agregarSucursal(suc1);
        fabrica.agregarSucursal(suc2);
        fabrica.agregarSucursal(suc3);
    
    }
    
}
