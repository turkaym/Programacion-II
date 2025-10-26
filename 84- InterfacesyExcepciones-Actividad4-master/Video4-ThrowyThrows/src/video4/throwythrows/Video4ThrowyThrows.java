/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package video4.throwythrows;

/**
 *
 * @author Bruno
 */
public class Video4ThrowyThrows {

    public static void main(String[] args) {

        /***Diferencia entre THROW y THROWS en Java***/       
    }
    
    private static class Verificador {

        public static void checkEsNegativo(int x) /*Para declarar que el metodo lanza una excepcion utilizamos "throws"*/ throws Exception{
            if (x < 0) {
                /*Para lanzar una excepcion se utiliza "throw"*/
                throw new Exception("No puede ser negativo");
            }
        }
    }
    
}
