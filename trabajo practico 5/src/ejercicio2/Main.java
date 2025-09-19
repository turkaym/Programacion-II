/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bateria bateria = new Bateria("ASUS ROG", "4000 mAH");
        Usuario usuario = new Usuario("Marcos", "3749522");
        Celular celular = new Celular("123456", "Samsung", "A6", bateria);
        
        celular.mostrarBateria();
        
        celular.setUsuario(usuario);// aseguramos que usuario tambien guarda la referencia del celular
        System.out.println("El usuario " + usuario.getNombre() + " tiene el DNI " + usuario.getDni());
        System.out.println("El celular " + celular.getMarca() + " es el modelo " + celular.getModelo());
        System.out.println("usuario asociado al celular: " + celular.getUsuario().getNombre());
        System.out.println("celular asociado al usuario: " + usuario.getCelular().getMarca());
    }
    
}
