/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author marco
 */
public class GeneradorQR {
    public static void generar(String valor, String nomUser, String emailUser){
        Usuario usuario = new Usuario(nomUser, emailUser);
        CodigoQR qr = new CodigoQR(valor, usuario);
        
        System.out.println("Su codigo QR esta listo, " + usuario.getNombre() + " por un valor de: " + qr.getValor() + " registrado con el e-mail: " + usuario.getEmail() + ".");
    }
}
