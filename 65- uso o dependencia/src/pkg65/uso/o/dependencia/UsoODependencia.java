/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg65.uso.o.dependencia;

/**
 *
 * @author marco
 */
public class UsoODependencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Documento doc1 = new Documento("Prueba ","Este es un\ndocumento de prueba.");
        Impresora imp = new Impresora();
        
        imp.imprimir(doc1);
        imp.encender();
        imp.imprimir(doc1);
    }
    
}
