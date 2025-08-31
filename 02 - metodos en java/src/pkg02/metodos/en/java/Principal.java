/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02.metodos.en.java;


public class Principal {

    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria();
        
        cb.mostrarDatos();
        cb.setAlias("MinuevoAlias");
        cb.mostrarDatos();
        cb.setAlias(null);
        cb.mostrarDatos();
       
        String a = cb.getAlias();
        System.out.println(a);
        
      
    }
    
}
    