/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author marco
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // AGREGACIÓN 1:1
    private Usuario usuario; // ASOCIACION 1:1
    
    public Celular(String imei, String marca, String modelo, Bateria bateria){
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    
    public void mostrarBateria(){
        if (bateria != null) {
            System.out.println("La bateria del celular es modelo " + bateria.getModelo() + " y tiene una capacidad de " + bateria.getCapacidad());
        }
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }
    
    public Usuario getUsuario(){
        return usuario;
    }

    public String getImei(){
        return imei;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setImei(){
        if (imei != null) {
            this.imei = imei;
        }
    }
    
    public void setMarca(){
        if (marca != null) {
            this.marca = marca;
        }
    }

    public void setModelo(){
        if (modelo != null) {
            this.modelo = modelo;
        }
    }

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + ", usuario=" + usuario + '}';
    }
    
    
}
