/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author marco
 */
import java.time.LocalDate;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Titular titular = new Titular("Farid", "37498103");
//        ClaveSeguridad clave = new ClaveSeguridad("987", LocalDate.now());

        CuentaBancaria cuenta = new CuentaBancaria("000123456789", 150000.0, "123", LocalDate.now());

        cuenta.setTitular(titular);

        System.out.println(cuenta);
        System.out.println(titular);
       
    }
    
}
