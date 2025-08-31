/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto4;

/**
 *
 * @author marco
 */
public class Principal {

    public static void main(String[] args) {
        Gallinas gallina1 = new Gallinas();
        gallina1.setIdGallina(1);
        gallina1.setEdad(0);
        gallina1.setHuevosPuestos(0);
        
        Gallinas gallina2 = new Gallinas();
        gallina2.setIdGallina(2);
        gallina2.setEdad(0);
        gallina2.setHuevosPuestos(0);
        
        gallina1.mostrarDato();
        gallina2.mostrarDato();
      
        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        
        gallina2.envejecer();
        gallina2.envejecer();
        gallina2.ponerHuevo();
        
        gallina1.mostrarDato();
        gallina2.mostrarDato();
        
    }
    
}
