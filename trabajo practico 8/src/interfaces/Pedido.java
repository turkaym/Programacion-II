/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author marco
 */
public class Pedido implements Pagable{
    private ArrayList<Producto> productos;
    private String estado;
    private Cliente cliente;
    
    public Pedido(Cliente cliente){
        this.estado = estado;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    
    
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p: productos){
            total += p.calcularTotal();
        }
        return total;
    }
    
    public void cambiarEstado(String nuevoEstado){
        this.estado = nuevoEstado;
        cliente.notificarCambio("El pedido cambio a: " + nuevoEstado);
    }
    
    public void mostrarProductos(){
        for (Producto p: productos){
            System.out.println(p);
        }
    }
}
