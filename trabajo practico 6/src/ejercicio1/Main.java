/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        cargarInventario(inventario);
        
        // Lista de productos
        inventario.listarProductos();
        
        System.out.println("---------------------------------------");
        
        // buscar producto por id
        Producto buscar = inventario.buscarProductoPorId("104");
        if (buscar == null) {
            System.out.println("No se encontro el producto");
        } else {
            System.out.println("Se encontro el producto " + buscar);
        }
        
        System.out.println("---------------------------------------");
        
        // eliminar producto por id
        Producto productoBorrado = inventario.eliminarProducto("105");
        System.out.println(productoBorrado == null ? "No se encontro el proucto " : "Se borro: " + productoBorrado);
        
         System.out.println("---------------------------------------");
        
        // filtrar producto por categoria
        ArrayList<Producto> listaCategoria =  inventario.filtrarPorCategoria(CategoriaProducto.HOGAR);
        for (Producto producto: listaCategoria){
            System.out.println(producto);
        }
        
        System.out.println("---------------------------------------");
        
        //actualizar stock
        Producto p1 = inventario.actualizarStock("102", 5);
        System.out.println(p1 == null ? "No se pudo actualizar" : "Actualizado: " + p1);
        
        Producto p2 = inventario.actualizarStock("104", -3);
        System.out.println(p2 == null ? "No se pudo actualizar (cantidad negativa)" : "Actualizado: " + p2);
        
        System.out.println("---------------------------------------");
        
        // obtener el total de stcok
        int total = inventario.obtenerTotalStock();
        System.out.println("El total de unidades en stock: " + total);
        
        System.out.println("---------------------------------------");
        
        // producto con mayor stock
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        System.out.println(mayorStock == null ? "Inventario vacio" : "Producto con mayor stock " + mayorStock);
        
        System.out.println("---------------------------------------");
        
        // filtrar productos por precio
        ArrayList<Producto> rango = inventario.filtrarProductosPorPrecio(1500, 3000);
        System.out.println("Productos entre 1500 y 3000");
        for (Producto producto: rango){
            System.out.println(producto);
        }
        
        System.out.println("---------------------------------------");
        
        // Mostrar categorias
        ArrayList<CategoriaProducto> categorias = inventario.mostrarCategoriasDisponibles();
        System.out.println("Categorias que estan en el inventario: " + categorias);
        
    
    }
    
    
    public static void cargarInventario(Inventario inventario){
        Producto arroz = new Producto("101", "Arroz", 1000, 2, CategoriaProducto.ALIMENTOS);
        Producto celular = new Producto("102", "Celular", 3000, 1, CategoriaProducto.ELECTRONICA);
        Producto remera = new Producto("103", "Remera", 1500, 3,CategoriaProducto.ROPA);
        Producto sillon = new Producto("104", "Sillon", 8000, 1, CategoriaProducto.HOGAR);
        Producto pantalon = new Producto("105", "Pantalon", 5000, 3,CategoriaProducto.ROPA);
        
        
        inventario.agregarProducto(arroz);
        inventario.agregarProducto(celular);
        inventario.agregarProducto(remera);
        inventario.agregarProducto(sillon);
        inventario.agregarProducto(pantalon);
    }
}
