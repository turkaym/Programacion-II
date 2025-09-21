/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author marco
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato, this);
    }
    
    public void setTitular(Titular titular){
        if (this.titular == null && titular != this.titular){
            this.titular = titular;
            if (titular.getPasaporte() != this ){
            titular.setPasaporte(this);
            }
        }
    }
    
    public Titular getTitular(){
        return this.titular;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {String titularStr = (titular != null) ? " Titular: " + titular.getNombre() : "sin titular";
        return "Pasaporte{" + "numero= " + numero + ", fechaEmision= " + fechaEmision + ", foto= " + foto.getImagen() + foto.getFormato() + titularStr + '}';
    }
}
