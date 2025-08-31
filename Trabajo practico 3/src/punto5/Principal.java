/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto5;

/**
 *
 * @author marco
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        NaveEspacial nave = new NaveEspacial();
        nave.setNombre("Ares");
        nave.setCombustible(50);

        nave.mostrarEstado();

        // Despegar
        nave.despegar();

        // Intentar avanzar sin recargar lo suficiente (debe fallar)
        nave.avanzar(60); // necesita 60 y, tras despegar, tiene 45

        // Recargar y avanzar correctamente
        nave.recargarCombustible(30); // queda en 75
        nave.avanzar(40);             // consume 40 -> queda 35

        // Estado final
        nave.mostrarEstado();
        
    }
    
}
