/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author marco
 */
public class EditorVideo {
    public static void exportar(String formato, Proyecto proyecto){
        Render render = new Render(formato, proyecto);
        
        System.out.println("Exportar proyecto " + proyecto.getNombre() + " en formato " + render.getFormato());
    }
}
