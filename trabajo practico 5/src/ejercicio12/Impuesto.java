/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author marco
 */
public class Impuesto {
    private int monto;
    private Contribuyente contribuyente; // asociacion unidireccional
    
    public Impuesto(int monto, Contribuyente contribuyente){
        this.monto = monto;
        this.contribuyente = contribuyente;
    }
    
    public int getMonto(){
        return monto;
    }
    
    public Contribuyente getContribuyente(){
        return contribuyente;
    }

    @Override
    public String toString() {
        return "Impuesto{" + "monto=" + monto + ", contribuyente=" + contribuyente + '}';
    }
    
    
    
    
}
