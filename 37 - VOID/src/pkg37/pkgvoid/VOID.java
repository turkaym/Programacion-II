/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg37.pkgvoid;

/**
 *
 * @author marco
 */
public class VOID {

    public static void main(String[] args) {
        imprimirSimbolo('#', 5);
        imprimirSimbolo('$', 4);
        imprimirSimbolo('@', 6);
        
        String s = sucesionDeSimbolos('*', 7);
        System.out.println(s);
    }
    
    static void imprimirSimbolo(char simbolo, int veces){
        for (int i = 0; i < veces; i++) {
                System.out.print(simbolo);
        }
        
        System.out.println(); // salto de linea
    }
    
    static String sucesionDeSimbolos(char simbolo, int veces){
        String sucesion = ""; // aca es donde vamos a estar guardando los simbolos
        for (int i = 0; i < veces; i++) {
            sucesion += simbolo;
        }
        return sucesion;
    }
    
    
}
