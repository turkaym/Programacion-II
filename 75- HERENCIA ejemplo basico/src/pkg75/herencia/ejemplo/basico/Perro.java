/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg75.herencia.ejemplo.basico;

/**
 *
 * @author marco
 */
public class Perro extends Animal{ // LA PALABRA CLAVE EXTENDS ESTABLECE LA RELACION DE HERENCIA
    private String raza;
    
    public Perro(String nombre, int edad, String raza){
        super(nombre, edad);
        this.raza = raza;
        System.out.println("Constructor perro");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau Guau");
    }
    
    
}
