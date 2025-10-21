/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg76.polimorfismo.ejemplo.basico;

/**
 *
 * @author marco
 */
public class SMSService extends ServicioNotificacion{
    @Override
    public void enviarNotificacion(String mensaje, String destinatario) {
        System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
    }

}
