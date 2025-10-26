/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package video5.excepcionespropias;

/**
 *
 * @author Bruno
 */
public class Video5ExcepcionesPropias {

    public static void main(String[] args) {

        /***EXCEPCIONES PROPIAS en Java***/
    }

    public class IntegerOverflowException extends RuntimeException {

        public IntegerOverflowException() {
        }

        public IntegerOverflowException(String message) {
            super(message);
        }

        public IntegerOverflowException(String message, Throwable cause) {
            super(message, cause);
        }

        public IntegerOverflowException(Throwable cause) {
            super(cause);
        }
    }
    
}
