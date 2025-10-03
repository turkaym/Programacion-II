/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg69.arraylist.basico;

import java.util.ArrayList;

/**
 *
 * @author marco
 */
public class ArrayListBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto auto1= new Auto("AS123DF", "Rojo");
        
        ArrayList<Auto> misAutos = new ArrayList<>();
        
        System.out.println(misAutos.size()); // con size para saber el tamaño del array
        System.out.println(misAutos);
        
        System.out.println("********************");
        
        misAutos.add(auto1); // Agrego un auto al array
        System.out.println(misAutos.size());
        System.out.println(misAutos);
        
        System.out.println("********************");
        
        misAutos.add(new Auto("QW987MN", "Azul")); // otra forma de agregar el objeto es instanciandolo adentro del add
        System.out.println(misAutos.size());
        System.out.println(misAutos);
        
        System.out.println("********************");
        
        misAutos.add(new Auto("TY564VL", "Verde")); // otra forma de agregar el objeto es instanciandolo adentro del add
        System.out.println(misAutos.size());
        System.out.println(misAutos);
        
        System.out.println("********************");
        
        System.out.println("El 2°do auto es " + misAutos.get(1)); // Para obtener un auto usamos get(posicion del auto)
        
        System.out.println("********************");
        
        System.out.println("Mostrando todos los autos de la lista:");
        for (int i = 0; i < misAutos.size(); i++) {
            System.out.println("El auto en la posicion " + i + " es " + misAutos.get(i));
        }
        
        System.out.println("********************");
        
        misAutos.remove(0); // para eliminar un dato usamos remove
        System.out.println(misAutos.size());
        System.out.println(misAutos);
    }
    
    
}
