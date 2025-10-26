/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package video2.interpretarerrores;

/**
 *
 * @author Bruno
 */
public class Video2InterpretarErrores {

    public static void main(String[] args) {

        /***Cómo interpretar ERRORES en Java***/
        
        /**Interpretar el 'call stack'**/
        
        Persona p = new Persona(-1);
    }

    private static class Persona {

        private int edad;

        public Persona(int edad) {
            setEdad(edad);
        }

        private void setEdad(int edad) {
            try {
                Verificador.checkEsNegativo(edad);
                this.edad = edad;
            } catch (RuntimeException ex) {
                throw new IllegalArgumentException("La edad debe ser positiva", ex);
            }
        }
    }

    private static class Verificador {

        public static void checkEsNegativo(int x) {
            if (x < 0) {
                throw new RuntimeException("No puede ser negativo");
            }
        }
    }
    
}
