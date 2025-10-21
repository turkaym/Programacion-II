/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg79.polimorfismo1;

/**
 *
 * @author marco
 */
public class Bicicleta extends Vehiculo{
    
    public void prenderPantalla(){
        System.out.println("Pantalla prendida");
    }
    
    public void energizarMotor(){
        System.out.println("Motor listo");
    }
    
    @Override
     public void encender(){
        prenderPantalla();
        energizarMotor();
    }
}
