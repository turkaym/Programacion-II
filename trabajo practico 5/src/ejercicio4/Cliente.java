/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author marco
 */
public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjetaDeCredito;
    
    public Cliente(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDni(){
        return dni;
    }
    
    public TarjetaDeCredito getTarjetaDeCredito(){
        return tarjetaDeCredito;
    }
    
    public void setNombre(String nombre){
        if (nombre != null) {
            this.nombre = nombre;
        }
    }
    
    public void setDni(String dni){
        if (dni != null) {
            this.dni = dni;
        }
    }
    
    //ASOCIACION BIDIRECCIONAL
    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito){
        this.tarjetaDeCredito = tarjetaDeCredito;
        //EVITA EL BUCLE INFINITO PARA ASEGURAR Y ASEGURA LA CONSISTENCIA DE LA RELACION
        //ESTO NOS ASEGURA QUE HAYA COHERENCIA EN LA VINCULACION
        if (tarjetaDeCredito != null && tarjetaDeCredito.getCliente() != this) {
            tarjetaDeCredito.setCliente(this);
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + ", tarjetaDeCredito=" + tarjetaDeCredito + '}';
    }
    
    
}
