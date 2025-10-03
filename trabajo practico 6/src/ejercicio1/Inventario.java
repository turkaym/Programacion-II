/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventario {
    private ArrayList<Producto> productos;
    
    public Inventario(){
        this.productos = new ArrayList<>();
    }
    
    
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    
    
    public void listarProductos(){
       for (Producto producto: productos){
           System.out.println(producto);
       } 
    }
    
    
    public Producto buscarProductoPorId(String id){
        Producto productoEncontrado = null;
        Iterator<Producto> it = this.productos.iterator();
        while (it.hasNext() && productoEncontrado == null) {            
            Producto p = it.next();
            if (p.getId().equalsIgnoreCase(id)) {
                productoEncontrado = p;
            }
        }
          
        return productoEncontrado; 
    }
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria){
        ArrayList<Producto> productoEncontrado = new ArrayList<>();
        for (Producto producto: productos){
            // LOS ENUM PUEDE COMPARARSE CON == 
            if (producto.getCategoria() == categoria){
                productoEncontrado.add(producto);
            }
        }
        
        return productoEncontrado;
    }
    
    
    
    public Producto eliminarProducto(String id){
        Producto productoABorrar = buscarProductoPorId(id);
        
        if (productoABorrar != null){
            this.productos.remove(productoABorrar);
        }

        return productoABorrar;
    }
    
    
    public Producto actualizarStock(String id, int nuevaCantidad){
        if (nuevaCantidad < 0) {
            return null;    
        }
        
        Producto actualiazarStock = buscarProductoPorId(id);
        if (actualiazarStock != null) {
            actualiazarStock.setCantidad(nuevaCantidad);
        }
        
        return actualiazarStock;  
    }
    
    
    public int obtenerTotalStock(){
        int total = 0;
        for (Producto producto: productos){
            total += producto.getCantidad();
        }
        
        return total;
    }
    
    public Producto obtenerProductoConMayorStock(){
        if (productos.isEmpty()) {
            return null;
        }
        
        Producto mayorStock = productos.get(0);
        for (int i = 1; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            if (producto.getCantidad() > mayorStock.getCantidad()) {
                mayorStock = producto;
            }
        }
        
        return mayorStock;
    }
    
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max){
        // SWAP por si los parametos llean al reves.
        if (min > max) {
            double t = min; min = max; max= t;
        }
        
        ArrayList<Producto> resultado = new ArrayList<>();
        for (Producto producto: productos){
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                resultado.add(producto);
            }
        }
        
        return resultado;
    }
    
    
    public ArrayList<CategoriaProducto> mostrarCategoriasDisponibles(){
        // solo devulve las categorias que realmente estan presentes en productos
        ArrayList<CategoriaProducto> presentes = new ArrayList<>();
        for (Producto producto: productos){
            CategoriaProducto categoria = producto.getCategoria();
            
            if (!presentes.contains(categoria)) {
                presentes.add(categoria);
            }
        }
        return presentes;
    }
    
}
