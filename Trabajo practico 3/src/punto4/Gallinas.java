/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto4;

/**
 *
 * @author marco
 */
public class Gallinas {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    void mostrarDato(){
        System.out.println("Id: " + idGallina + " | " + "Edad: " + edad + " | " + "Huevos puestos: " + huevosPuestos);
    }
    
     public void ponerHuevo() {
        huevosPuestos = huevosPuestos + 1;
        System.out.println("Gallina " + idGallina + " puso un huevo. Total: " + huevosPuestos);
    }

    public void envejecer() {
        edad = edad + 1;
        System.out.println("Gallina " + idGallina + " ahora tiene " + edad + " años.");
    }
    
    public int getIdGallina() {
        return idGallina;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public int getHuevosPuestos() {
        return huevosPuestos;
    }
    
  public void setIdGallina(int nuevoId) {
        if (nuevoId > 0) { idGallina = nuevoId; }
        else { System.out.println("ID inválido (debe ser > 0)"); }
    }

    public void setEdad(int nuevaEdad) {
        if (nuevaEdad >= 0) { edad = nuevaEdad; }
        else { System.out.println("Edad inválida (no puede ser negativa)"); }
    }

    public void setHuevosPuestos(int nuevosHuevos) {
        if (nuevosHuevos >= 0) { huevosPuestos = nuevosHuevos; }
        else { System.out.println("Huevos inválidos (no puede ser negativo)"); }
    }
}
