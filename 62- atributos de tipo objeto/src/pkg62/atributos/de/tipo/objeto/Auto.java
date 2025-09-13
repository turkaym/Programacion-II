/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg62.atributos.de.tipo.objeto;

/**
 *
 * @author marco
 */
public class Auto {
     //ATRIBUTOS
    private String patente; //VARIABLE DE INSTANCIA
    private String marca;   //VARIABLE DE INSTANCIA
    private double precio;  //VARIABLE DE INSTANCIA
    private String color;   //VARIABLE DE INSTANCIA
    private Motor motor;    // Atributo del objeto
    private static double descuento; //VARIBLE DE CLASE POR QUE USA STATIC
    
    //CONSTRUCTOR PARA INICIALIZAR LOS ATRIBUTOS
    public Auto(String patente, String marca, double precio, String color, Motor motor){
        this.patente = patente;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.motor = motor;
        // NO PUEDO USAR this.descuento = 10; YA QUE THIS APUNTA A LAS VARIABLES DE INSTANCIA
        //AL SE VARIABLE DE CLASE, TENGO QUE LLAMAR A LA CLASE AUTO
        Auto.descuento = 10;
    }
    
    
    
    //A nivel de metodo precioPromocional() es un metodo de instancia
    //Cada uno de los objetos ahora tiene su metodo precioPromocional
    public double precioPromicional(){
        return this.precio - this.precio * Auto.descuento / 100;
    }
    
    //Metodo anularDescuento no puede estar a nivel del objeto
    // lo mejor es que sea estatico para que lke pertenezca a la clase
    public static void anularDescuento(){
        Auto.descuento = 0;
    }
    
    //Metodo toString para visualizar dn la consola el estado del objeto 

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", marca=" + marca + 
                ", precio=" + precio + ", color=" + color + ", motor=" + 
                motor + '}';
    }
    
}
