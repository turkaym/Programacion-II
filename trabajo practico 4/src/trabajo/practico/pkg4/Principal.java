/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.pkg4;

/**
 *
 * @author marco
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instancia de obetos
        Empleado empleado1 = new Empleado("Marcos", "Back-end", 2500);
        Empleado empleado2 = new Empleado("Gonzalo", "Tester", 1800);
        Empleado empleado3 = new Empleado("Hugo", "Front-end", 2000);
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        
        System.out.println("");
        
        empleado1.actualizarSalario(15); // metodo con el porcentaje de aumento
        empleado2.actualizarSalario(300);// metodo con la cantidad fija
        System.out.println(empleado1);
        System.out.println(empleado2);
        
        System.out.println("");
        
        System.out.println("El total de empleqados es " + Empleado.mostrarTotalEmpleados());
        
    }
    
}
