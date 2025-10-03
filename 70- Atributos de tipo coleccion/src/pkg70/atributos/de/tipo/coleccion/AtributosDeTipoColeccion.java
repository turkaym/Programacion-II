/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg70.atributos.de.tipo.coleccion;

/**
 *
 * @author marco
 */
public class AtributosDeTipoColeccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Concesionaria c = new Concesionaria("FakeCar");
        c.mostrarAutos();
        
        c.agregarAuto(new Auto("123", "Rojo"));
        c.agregarAuto(new Auto("321", "Verde"));
        c.agregarAuto(new Auto("789", "Azul"));
    
        c.mostrarAutos();
    }
    
}
